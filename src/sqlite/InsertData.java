package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cards.BankCard;
import cards.BusCard;
import cards.DNI;
import users.User;

/**
 * Clase que permite introducir datos en la base de datos
 * @author Anton y Aratz
 *
 */
public class InsertData {
    
	/**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect()
    {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:"+name;

        Connection conn = null;

        try
        {
            conn = DriverManager.getConnection(url);
          
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

        return conn;
    }
    
    /**
     * Metodo que permite introducir un usuario en la tabla USUARIOS
     * @param u usuario que vamos a introduir en la base de datos
     */

	public void insertUsuario(User u) {

		String sql = "INSERT INTO USUARIO (idUser, nombre, password, correo, isAdmin) VALUES(?,?,?,?,?)";

		try  (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)

        )
		{

			
			pstmt.setInt(1, u.getIdUser());
			pstmt.setString(2, u.getNomUser());
			pstmt.setString(3, u.getPassword());
			pstmt.setString(4, u.getCorreo());
			pstmt.setBoolean(5, u.isAdmin());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
    /**
     * Metodo que permite introducir un dni en la tabla DNI
     * @param d dni que vamos a introduir en la base de datos
     */
	public void insertDni(DNI d) {

		String sql = "INSERT INTO DNI (numDni, nombre, apellido1, apellido2, fecNacimiento, fecCaducidad, nombreTarjeta, propietario) VALUES(?,?,?,?,?,?,?,?)";

		try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)

        ){

			pstmt.setString(1, d.getNumDni());
			pstmt.setString(2, d.getNombre());
			pstmt.setString(3, d.getApellido1());
			pstmt.setString(4, d.getApellido2());
			pstmt.setInt(5, d.getFecNacimiento());
			pstmt.setInt(6, d.getFecCaducidad());
			pstmt.setString(7, d.getNombreTarjeta());
			pstmt.setInt(8, d.getPropietario());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
    /**
     * Metodo que permite introducir una tarjeta de banco en la tabla BANCA
     * @param b tarjeta de banco que vamos a introduir en la base de datos
     */
	public void insertTarjetaBanco(BankCard b) {

		String sql = "INSERT INTO BANCA (banco, credito, numTarjeta, numSeguridad, dinero, nombreTarjeta, propietario) VALUES(?,?,?,?,?,?,?)";

		try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)

        ){

			pstmt.setString(1, b.getBanco());
			pstmt.setBoolean(2, b.getCredito());
			pstmt.setInt(3, b.getNumTarjeta());
			pstmt.setInt(4, b.getNumSeguridad());
			pstmt.setInt(5, b.getDinero());
			pstmt.setString(6, b.getNombreTarjeta());
			pstmt.setInt(7, b.getPropietario());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
    /**
     * Metodo que permite introducir una tarjeta de bus en la tabla BUS
     * @param b tarjeta de bus que vamos a introduir en la base de datos
     */
	public void insertTarjetaBus(BusCard b) {

		String sql = "INSERT INTO BUS (numTarjeta,localidad, trayectos, saldo ,nombreTarjeta, propietario) VALUES(?,?,?,?,?,?)";
		
		try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)

        ){

			pstmt.setString(1, b.getNumeroTarjeta());
			pstmt.setString(2, b.getLocalidad());
			pstmt.setInt(3, b.getTrayectos());
			pstmt.setInt(4, b.getSaldo());
			pstmt.setString(5, b.getNombreTarjeta());
			pstmt.setInt(6, b.getPropietario());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
   
	public static void main(String[] args)
    {
		// Introducimos unos usarios para probar la apllicacion
		// Aratz sera el unico admin
        InsertData iD = new InsertData();
        User aratz = new User(1, "Aratz", "1234", "aratz.dg@gmail.com", true);
        iD.insertUsuario(aratz);
        
        User anton = new User(2, "Anton", "1234", "anton.sg@gmail.com", false);
        iD.insertUsuario(anton);
        
        
        DNI dniAratz = new DNI("45198222W", "Aratz", "de Goicoechea", "Martin", 19051999, 21122021, "DNI", 1);
        iD.insertDni(dniAratz);
        
        BankCard bancoAratz = new BankCard("BBVA", true, 456778658, 354, 10000000, "Banco", 1);
        iD.insertTarjetaBanco(bancoAratz);
        
        DNI dniGenerico = new DNI("45123344r", "Nombre", "Apellido1", "Apellido2", 19051999, 21122021, "DNI", 3);
        iD.insertDni(dniGenerico);
        
        BusCard busCard = new BusCard("N3455", "Donosti", 45, 35, "Dbus", 2);
        iD.insertTarjetaBus(busCard);



    }


}
