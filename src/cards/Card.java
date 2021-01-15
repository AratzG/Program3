package cards;

/**
 * En esta clase se desarrollan los atributos de las tarjetas.
 * Todas las clases tarjetas a excepcion de TarjetaGenerica Son subclases de esta clase
 * @author Aratz y Antón
 *
 */
public class Card {
	private String nombreTarjeta;
	private int propietario;
	
	/**
	 * Constructor de la clase tarjeta
	 * @param nombreTarjeta nombre de la tarjeta
	 * @param propietario id del propietario que ha introducido la tarjeta en el sistema
	 */
	
	public Card(String nombreTarjeta, int propietario) {
		this.nombreTarjeta = nombreTarjeta;
		this.propietario = propietario;
	}
	
	/**
	 * Constructor vacio
	 */
	
	public Card() {
		super();
	}



	/**
	 * Obtiene el nombre de  la tarjeta
	 * @return the nombreTarjeta
	 */
	public String getNombreTarjeta() {
		return nombreTarjeta;
	}

	/**
	 * Establece el nombre de la tarjeta
	 * @param nombreTarjeta
	 */
	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}

	/**
	 * Obtiene el id del pripietario de la tarjeta
	 * @return the propietario
	 */
	public int getPropietario() {
		return propietario;
	}

	/**
	 * Establece el propietario de la tarjeta
	 * @param propietario
	 */
	public void setPropietario(int propietario) {
		this.propietario = propietario;
	}
	
	
	
	

}


