package sqlite;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import users.User;
/**
 * Clase para la creacion de tablas de la base de datos
 * @author Aratz & Anton
 * 
 */
public class CreateTable
{
     /**
     * Metodo para la creacion de la taba USUARIOS
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
                "(idUser NUMBER PRIMARY KEY NOT NULL,\n" +
                "nombre TEXT NOT NULL,\n" +
                "password TEXT NOT NULL,\n" +
                "correo TEXT NOT NULL, \n" +
                "isAdmin BOOLEAN);\n";

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
     * Metodo para la creacion de la taba DNI
     *
     */
    public static void createNewTableDNI()
    {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql =                 
        		"CREATE TABLE DNI\n" +
                "(numDni TEXT PRIMARY KEY NOT NULL ,\n" +
                "nombre TEXT NOT NULL,\n" +
                "apellido1 TEXT NOT NULL,\n" +
                "apellido2 TEXT NOT NULL, \n" +
                "fecNacimiento NUMBER NOT NULL,\n" +
                "fecCaducidad NUMBER NOT NULL,\n" +
                "nombreTarjeta TEXT NOT NULL,\n" +
                "propietario NUMBER NOT NULL);\n";

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
     * Metodo para la creacion de la taba BANCO
     *
     */
   
    public static void createNewTableBankCard()
    {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:" + name;

        // SQL statement for creating a new table
        String sql =                 
        		"CREATE TABLE BANCA\n" +
                "(banco TEXT NOT NULL,\n" +
                "credito BOOLEAN,\n" +
                "numTarjeta NUMBER  PRIMARY KEY  NOT NULL, \n" +
                "numSeguridad NUMBER NOT NULL, \n" + 
                "dinero NUMBER NOT NULL, \n" + 
                "nombreTarjeta TEXT NOT NULL, \n" + 
                "propietario NUMBER NOT NULL);\n";


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
     * Metodo para la creacion de la taba BUS
     *
     */
    public static void createNewTableBusCard()
    {
        // SQLite connection string
        String name = "Wallet.db";
        String url = "jdbc:sqlite:" + name;
        

        // SQL statement for creating a new table
        String sql =                 
        		"CREATE TABLE BUS\n" +
                "(numTarjeta NUMBER  PRIMARY KEY  NOT NULL, \n" +
                "localidad TEXT NOT NULL,\n" +
                "saldo NUMBER NOT NULL, \n" + 
                "trayectos NUMBER NOT NULL, \n" + 
                "nombreTarjeta TEXT NOT NULL, \n" + 
                "propietario NUMBER NOT NULL);\n";


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
        createNewTableBusCard();
    }
}