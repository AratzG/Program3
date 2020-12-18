/*package sqlite;

import users.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

*//**
 *
 * @author Aratz y Anton
 *//*
public class UpdateData
{

    *//**
     * Connect to the test.db database
     *
     * @return the Connection object
     *//*
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

    *//**
     * Update data of a equipo specified by the name
     *
     * @param equipo
     *//*
    public void update(User usuario, String nuevo)
    {
        String sql = "UPDATE USUARIO SET idUser = ?, nombre = ? , password = ?, correo = ?, " +
                "isAdmin = ? WHERE nombre = ?";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            // set the corresponding param
            pstmt.setInt(1, User.getIdUser());
            pstmt.setString(2, User.getNombre());
            pstmt.setShort(3, User.getPassword());
            pstmt.setShort(4, User.getCorreo());
            pstmt.setShort(5, User.getGolesEncajados());
            pstmt.setString(7, nuevo);

            // update
            pstmt.executeUpdate();
            }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    *//**
     * Actualiza un jugador según su código.
     * @param jugador
     * @param real
     *//*
    public void updateJugador(Jugador jugador, String real)
    {
        String sql = "UPDATE JUGADOR SET nombre = ? , equipo = ?, apellido = ?, goles = ?, " +
                "asistencias = ?, dorsal = ?, nombreCamiseta = ?, piernaBuena = ?, edad = ?, " +
                " nacionalidad = ? WHERE codJug = ?";

        try
                (
                        Connection conn = this.connect();
                        PreparedStatement pstmt = conn.prepareStatement(sql)
                )
        {
            // set the corresponding param
            pstmt.setString(1, jugador.getNombre());
            pstmt.setString(2, jugador.getNomEquipo());
            pstmt.setString(3, jugador.getApellido());
            pstmt.setInt(4, jugador.getGoles());
            pstmt.setInt(5, jugador.getAsistencias());
            pstmt.setShort(6,jugador.getDorsal());
            pstmt.setString(7,jugador.getNombreCamiseta());
            pstmt.setString(8, jugador.getPiernaBuena());
            pstmt.setInt(9, jugador.getEdad());
            pstmt.setString(10, jugador.getNacionalidad());
            pstmt.setString(11, real);

            // update
            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    *//**
     * @param args the command line arguments
     *//*
    public static void main(String[] args)
    {
            UpdateData app = new UpdateData();

            // update the warehouse with id 3

    }
}
*/