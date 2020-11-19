package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cards.BankCard;
import cards.DNI;
import users.User;

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

	public void insertUsuario(User u) {

		String sql = "INSERT INTO Usuarios (idUser, nombre, password, correo, isAdmin) VALUES(?,?,?,?,?)";

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
	
	public void insertDni(DNI d) {

		String sql = "INSERT INTO DNI (numDni, nombre, apellido1, apellido2, fecNacimiento, fecCaducidad) VALUES(?,?,?,?,?,?)";

		try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)

        ){

			pstmt.setString(1, d.getNumDni());
			pstmt.setString(2, d.getNombre());
			pstmt.setString(3, d.getApellido1());
			pstmt.setString(4, d.getApellido2());
			pstmt.setInt(5, d.getFecNacimietno());
			pstmt.setInt(6, d.getFecCaducidad());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void insertTarjetaBanco(BankCard b) {

		String sql = "INSERT INTO BANCA (banco, credito, numeroTarjeta, numeroSecreto, dinero) VALUES(?,?,?,?,?)";

		try (
                Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)

        ){

			pstmt.setString(1, b.getBanco());
			pstmt.setBoolean(2, b.getCredito());
			pstmt.setInt(3, b.getNumTarjeta());
			pstmt.setInt(4, b.getNumSeguridad());
			pstmt.setInt(5, b.getDinero());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
   
	public static void main(String[] args)
    {

        InsertData iD = new InsertData();
        User aratz = new User(1, "Aratz", "aratz.dg@gmail.com", "1234", true);
        iD.insertUsuario(aratz);
        
        User anton = new User(1, "Anton", "anton.sg@gmail.com", "1234", false);
        iD.insertUsuario(anton);
        
        
        DNI dniAratz = new DNI("45198222W", "Aratz", "de Goicoechea", "Martin", 19051999, 21122021);
        iD.insertDni(dniAratz);



    }


}
