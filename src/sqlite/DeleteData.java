package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase que elimina informacion de la base de datos.
 * @author sqlitetutorial.net
 */
public class DeleteData
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
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**
     * Elimina un usario especificando el nombre
     *
     * @param nombre
     */
    public void deleteUsuario(String nombre)
    {
        String sql = "DELETE FROM USUARIOS WHERE nombre = ?";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {

            // set the corresponding param
            pstmt.setString(1, nombre);

            // execute the delete statement
            pstmt.executeUpdate();

        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Elimina un dni mediante la especificación del numero de dni
     * @param numDni
     */
    public void deletePartido(String codPar)
    {
        String sql = "DELETE FROM DNI WHERE numDni = ?";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {

            // set the corresponding param
            pstmt.setString(1, codPar);

            // execute the delete statement
            pstmt.executeUpdate();

        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Elimina una tarjeta del banco especificando el numero de la tarjeta
     * @param numeroTarjeta
     */
    public void deleteMiembro(String nombre)
    {
        String sql = "DELETE FROM BANCA WHERE numeroTarjeta = ?";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {

            // set the corresponding param
            pstmt.setString(1, nombre);

            // execute the delete statement
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
        DeleteData dataDeleter = new DeleteData();

       
    }

}