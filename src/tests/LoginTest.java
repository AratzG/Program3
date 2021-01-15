package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import excepciones.UsuarioNoExiste;
import frontend.Login;
import users.Admin;
import users.User;
/**
 * Clase que relaiza el test para el emtodo Login
 * @author Aratz y Anton
 *
 */

public class LoginTest {
	
	private String usuarioCorrecto;
	private String passwordCorrecta;
	private User usuario;
	private ArrayList<User> listaUsuarios;
	private String usarioAdminCorrecto;
	private String passwordAdminCorrecta;
	private Admin admin;
    private Login login;
	
    
    /**
     * Asignacion de los elementos que vamos a utilizar para hacer el test
     * @throws Exception
     */
	@Before
	public void setUp() throws Exception {
		usuarioCorrecto = "Anton";
		passwordCorrecta = "1234";
		//usuario = new User(1,"Anton","1234","correo",false);
		//usarioAdminCorrecto = "Aratz" ;
		//passwordAdminCorrecta = "1234";
		//admin = new Admin(0, "AdminPrueba", "Password", "correo", true);
	}
	/*
	 * No necesiamos realizar tearDown
	 */

	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Llamada del metodo login para realizar el test
	 */
	@Test
	public void test() {
		   try{
			   
	            login.comprobarUsuario(usuarioCorrecto,passwordCorrecta);
	            fail("Ha encontrado el usuario o la pass es correcta");
	        } catch (UsuarioNoExiste usuarioNoExiste) {
	            usuarioNoExiste.printStackTrace();
	        }
		
	}

}
