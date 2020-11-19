package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import cards.BankCard;
import cards.DNI;
import users.User;

public class SelectData {
 
	private ArrayList<User> listaUsuarios = new ArrayList<>();
    private ArrayList<DNI> listaDnis = new ArrayList<>();
    private ArrayList<BankCard> listaBanca = new ArrayList<>();

    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */

    private Connection connect() {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:" + name;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    /**
     * 
     *
     * @return ArrayList de usuario
     */
    public ArrayList selectUsuario() {
        String sql = "SELECT * FROM USUARIO";

        try
                (
                        Connection conn = this.connect();
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql)

                ) {

            while (rs.next()) {
            
            	int id;
				String name;
				String contrasenya;
				String mail;
				boolean admin;


                User usuario = new User();

                id = rs.getInt("idUser");
				name = rs.getString("nombre");
				contrasenya = rs.getString("password");
				mail = rs.getString("correo");
				admin = rs.getBoolean("isAdmin");

				usuario.setIdUser(id);
				usuario.setNomUser(name);
				usuario.setPassword(contrasenya);
				usuario.setCorreo(mail);
				usuario.setAdmin(admin);

                listaUsuarios.add(usuario);

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaUsuarios;
    }
 
	public ArrayList selectDni() {

		String sql = "SELECT * FROM DNI";
		try
        (
                Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)

        )
		{
			while (rs.next()) {
				String numeroIdentidad = rs.getString("numDNI");
				String name = rs.getString("nombre");
				String surname1 = rs.getString("apellido1");
				String surname2 = rs.getString("apellido2");
				int dateDob = rs.getInt("fecNacimiento");
				int dateExp = rs.getInt("fecCaducidad");
				
				
				DNI dni = new DNI(numeroIdentidad, name, surname1, surname2, dateDob, dateExp);
				listaDnis.add(dni);
				

				listaDnis.add(dni);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaDnis;

	}
	
    
    
	public ArrayList selectTarjetaBanco() {

		String sql = "SELECT * FROM BANCA";
		try
        (
                Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)

        )
		{
			while (rs.next()) {
				String entidad;
				boolean credit;
				int cardNum;
				int secNum;
				int money;
				
				BankCard bankCard = new BankCard();				
				
				entidad = rs.getString("banco");
				credit = rs.getBoolean("credito");
				cardNum = rs.getInt("numeroTarjeta");
				secNum = rs.getInt("numeroSecreto");
				money = rs.getInt("dinero");
				
				bankCard.setBanco(entidad);
				bankCard.setCredito(credit);
				bankCard.setNumTarjeta(cardNum);
				bankCard.setNumSeguridad(secNum);
				bankCard.setDinero(money);

				

				listaBanca.add(bankCard);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return listaBanca;

	}
	
    public static void main(String[] args)
    {
        SelectData sD = new SelectData();
        sD.selectUsuario();
        sD.selectTarjetaBanco();
        sD.selectDni();


        
    }



}
