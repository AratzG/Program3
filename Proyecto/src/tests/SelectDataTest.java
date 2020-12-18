package tests;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sqlite.SelectData;
/**
 * Test para comprobar el selector de datos del programa
 */

public class SelectDataTest {

    SelectData dataSelector = new SelectData();
    
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Si obtenemos un fail, entonces, sabemos que el test funciona
     */
    @Test
    public void selectUsuarios() {
        try
        {
           dataSelector.selectUsuario();
           fail("Funciona bien.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
