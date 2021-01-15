package cards;

/**
 * En esta clase se desarrollan los atributos de la tarjeta bancaria
 * @author Aratz y Antón
 *
 */

public class BankCard extends Card{
	private String banco;
	private Boolean credito;
	private int numTarjeta;
	private int numSeguridad;
	private int dinero;
	
	  /**
     * Este método es el constructor con parámetros de la tarjeta bancaria
     * @param banco banco al que perteneces
     * @param credito credito de la tarjeta
     * @param numtarjeta es el tu número personal de la tarjeta bancaria
     * @param numSeguridad es la clave de seguridad de la tarjeta
     * @param int dinero será el dinero que tienes en la cuenta
     */

	
	public BankCard(String banco, Boolean credito, int numTarjeta, int numSeguridad, int dinero) {
		super();
		this.banco = banco;
		this.credito = credito;
		this.numTarjeta = numTarjeta;
		this.numSeguridad = numSeguridad;
		this.dinero = dinero;
	}
	

	public BankCard() {
		
	}



	/**
	 * Este método devuelve el atributo banco a otra clase
	 * @return banco
	 */
	public String getBanco() {
		return banco;
	}


	/**
	 * Este método da valor al atributo banco
	 * @param banco 
	 */
	public void setBanco(String banco) {
		this.banco = banco;
	}

	/**
	 * Este método devuelve el atributo credito a otra clase
	 * @return credito
	 */
	public Boolean getCredito() {
		return credito;
	}


	/**
	 *  Este método da valor al atributo credito
	 * @param credito 
	 */
	public void setCredito(Boolean credito) {
		this.credito = credito;
	}

	/**
	 * Este método devuelve el atributo numTarjeta a otra clase
	 * @return numTarjeta
	 */
	public int getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 *  Este método da valor al atributo numTarjeta
	 * @param numTarjeta 
	 */
	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * Este método devuelve el atributo numSeguridad a otra clase
	 * @return numSeguridad
	 */
	public int getNumSeguridad() {
		return numSeguridad;
	}

	/**
	 *  Este método da valor al atributo numSeguridad
	 * @param numSeguridad
	 */
	public void setNumSeguridad(int numSeguridad) {
		this.numSeguridad = numSeguridad;
	}


	/**
	 * Este método devuelve el atributo dinero a otra clase
	 * @return dinero
	 */
	public int getDinero() {
		return dinero;
	}

	/**
	 *  Este método da valor al atributo dinero
	 * @param dinero 
	 */
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	

	

}
