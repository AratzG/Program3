package cards;

import java.util.Date;

/**
 * En esta clase se desarrollan los atributos del DNI
 * @author Aratz y Antón
 *
 */ 

public class DNI extends Card{
	private String numDni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int fecNacimiento;
	private int fecCaducidad;
	
	 /**
     * Este método es el constructor con parámetros del DNI
     * @param numDni es el numero de DNI
     * @param nombre es el nombre de la persona poseedora
     * @param apellido1 es el primer apellido de la persona
     * @param apellido2 es el segundo apellido de la persona
     * @param fecNacimiento es la fecha de nacimiento de la persona
     * @param fecCaducidad es la fecha de caducidad del docuemnto
     */	
	
	
	public DNI(String numDni, String nombre, String apellido1, String apellido2, int fecNacimiento, int fecCaducidad, String nombreTarjeta, int propietario) {
		super(nombreTarjeta, propietario);
		this.numDni = numDni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fecNacimiento = fecNacimiento;
		this.fecCaducidad = fecCaducidad;
	}
	 /**
     * Constructor vacio
     */
	public DNI() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * Este método devuelve el atributo numDni a otra clase
	 * @return numDni
	 */
	public String getNumDni() {
		return numDni;
	}
	/**
	 * Este método da valor al atributo numDni
	 * @param numDni 
	 */
	public void setNumDni(String numDni) {
		this.numDni = numDni;
	}
	/**
	 * Este método devuelve el atributo nombre a otra clase
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Este método da valor al atributo nombre
	 * @param nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Este método devuelve el atributo apellido1 a otra clase
	 * @return apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	/**
	 * Este método da valor al atributo apellido1
	 * @param apellido1 
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	/**
	 * Este método devuelve el atributo apellido2 a otra clase
	 * @return apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}
	/**
	 * Este método da valor al atributo apellido2
	 * @param apellido2 
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * Este método devuelve el atributo fecNacimiento a otra clase
	 * @return fecNacimietno
	 */
	public int getFecNacimiento() {
		return fecNacimiento;
	}
	/**
	 * Este método da valor al atributo fecNaciemiento
	 * @param fecNacimietno 
	 */
	public void setFecNacimietno(int fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	/**
	 * Este método devuelve el atributo fecCaducidad a otra clase
	 * @return fecCaducidad
	 */
	public int getFecCaducidad() {
		return fecCaducidad;
	}
	/**
	 * Este método da valor al atributo fecCaducidad
	 * @param fecCaducidad
	 */
	public void setFecCaducidad(int fecCaducidad) {
		this.fecCaducidad = fecCaducidad;
	}
	
		
	
	
	
	
	
}
