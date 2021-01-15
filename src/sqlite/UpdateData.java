package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cards.BankCard;
import cards.BusCard;

/**
 * Clase que permite actualizar usuarios
 * @author Alumno
 *
 */
public class UpdateData
{

    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect()
    {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:" + name;
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
     * Metodo para actualizar los datos de una tarjeta de Banco dado un numero de tarjeta
     * @param b tarjeta de banco que queremos actualizar
     * @param numeroTarjeta de la atrjeta que queremos cambiar
     */
    
    public void updateBanca (BankCard b, int numeroTarjeta)
    {
        String sql = "UPDATE BANCA SET banco = ? , credito = ?, numSeguridad = ?, " +
                "dinero = ?, nombreTarjeta = ? , propietario = ? WHERE numTarjeta = ?";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
        	
            // set the corresponding param
    		pstmt.setString(1, b.getBanco());
			pstmt.setBoolean(2, b.getCredito());
			pstmt.setInt(3, numeroTarjeta);
			pstmt.setInt(4, b.getNumSeguridad());
			pstmt.setInt(5, b.getDinero());
			pstmt.setString(6, b.getNombreTarjeta());
			pstmt.setInt(7, b.getPropietario());
			pstmt.executeUpdate();

            // update
            pstmt.executeUpdate();
            }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
   
    /**
     * Metodo para actualizar los datos de una tarjeta de bus dado un numero de tarjeta
     * @param b tarjeta de banco que queremos actualizar
     * @param numeroTarjeta de la atrjeta que queremos cambiar
     */
   
    public void updateBus(BusCard b, String numeroTarjeta)
    {
        String sql = "UPDATE BUS SET localidad = ? , trayectos = ?, saldo = ?, nombreTarjeta = ?, " +
                "propietario = ? WHERE numTarjeta = ?";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            // set the corresponding param
			pstmt.setString(1, numeroTarjeta);
			pstmt.setString(2, b.getLocalidad());
			pstmt.setInt(3, b.getTrayectos());
			pstmt.setInt(4, b.getSaldo());
			pstmt.setString(5, b.getNombreTarjeta());
			pstmt.setInt(6, b.getPropietario());

            // update
            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
            UpdateData uD = new UpdateData();

            
    }
}
