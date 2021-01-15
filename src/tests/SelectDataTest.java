package tests;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sqlite.InsertData;
import sqlite.SelectData;
import users.User;

/**
 * Metodo para realizar el test de seleccion de datos
 * @author Alumno
 *
 */
public class SelectDataTest {
	
	private User usuarioPrueba;
	private ArrayList <User> listaUsuarios;
	private String usuarioSeleccionado;
	private String passwordSeleccionado;
	

    SelectData dataSelector = new SelectData();
        
    /**
     * Instanciacion de la clase y metodo selectdata y los arrays empleados
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    
    listaUsuarios = new ArrayList<User>();
    SelectData sD = new SelectData();
    
	InsertData iD = new InsertData();
	iD.insertUsuario(usuarioPrueba);
	
    listaUsuarios = sD.selectUsuario();
    usuarioPrueba = new User(1,"Usuario","constrasenya","correo",false);
    

    
    	
    }

    @After
    public void tearDown() throws Exception {
    	
    }

   /**
    * Comporbamos si el metodo selectData nos selecciona lo desado
    */
    @Test
    public void selectUsuarios() {

    	
    	for (User u : listaUsuarios){
    		if((u.getNomUser().equals("Usuario")) && (u.getPassword().equals("constrasenya"))){
    			usuarioSeleccionado = u.getNomUser();
    			passwordSeleccionado = u.getPassword();
    			break;
    		}
    	}
    	
    	Assert.assertTrue(usuarioSeleccionado.equals("Usuario"));
    	Assert.assertTrue(passwordSeleccionado.equals("constrasenya"));

    }

}
