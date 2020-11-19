package sqlite;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import users.User;
/**
 * Clase para la creacion de tablas
 * @author Aratz & Anton
 * 
 */
public class CreateTable
{
     /**
     * Create a new table in the test database
     *
     */
    public static void createNewTableUsuarios()
    {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql =                 
        		"CREATE TABLE USUARIO\n" +
                "(idUser NUMBER NOT NULL,\n" +
                "nombre TEXT NOT NULL,\n" +
                "password TEXT NOT NULL,\n" +
                "correo TEXT NOT NULL, \n" +
                "isAdmin BOOLEAN, \n" +
                "PRIMARY KEY (idUser));\n";

        try
                (
                        Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()
                )
        {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createNewTableDNI()
    {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql =                 
        		"CREATE TABLE DNI\n" +
                "(numDni TEXT NOT NULL ,\n" +
                "nombre TEXT NOT NULL,\n" +
                "apellido1 TEXT NOT NULL,\n" +
                "apellido2 TEXT NOT NULL, \n" +
                "fecNacimiento NUMBER NOT NULL,\n" +
                "fecCaducidad NUMBER NOT NULL, \n" +
                "PRIMARY KEY (numDni));\n";

        try
                (
                        Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()
                )
        {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createNewTableBankCard()
    {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql =                 
        		"CREATE TABLE BANCA\n" +
                "(idUser NUMBER NOT NULL,\n" +
                "banco TEXT NOT NULL,\n" +
                "credito BOOLEAN,\n" +
                "numTarjeta NUMBER NOT NULL, \n" +
                "numSeguridad NUMBER NOT NULL, \n" + 
                "dinero NUMBER NOT NULL, \n" +
                "PRIMARY KEY (numTarjeta));\n";


        try
                (
                        Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()
                )
        {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        createNewTableUsuarios();
        createNewTableDNI();
        createNewTableBankCard();
    }
}