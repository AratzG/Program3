package cards;

/**
 * En esta clase se desarrollan los atributos de la tarjeta de bus
 * @author Aratz y Antón
 *
 */


public class BusCard extends Card {
	private String numeroTarjeta;
	private String localidad;
	private int trayectos;
	private int saldo;

	
	/**
	 * Constructor de tarjetas
	 * @param numeroTarjeta
	 * @param nombreTarjeta
	 * @param propietario
	 * @param localidad
	 * @param trayectos
	 * @param saldo
	 */
	public BusCard(String numeroTarjeta, String localidad, int trayectos, int saldo, String nombreTarjeta, int propietario) {
		super(nombreTarjeta, propietario);
		this.numeroTarjeta = numeroTarjeta;
		this.localidad = localidad;
		this.trayectos = trayectos;
		this.saldo = saldo;
	}

	/**
	 * Constructor vacio
	 * @param nombreTarjeta
	 * @param propietario
	 */
	public BusCard(String nombreTarjeta, int propietario) {
		super(nombreTarjeta, propietario);
	}
	
	

	/**
	 * @return the numeroTarjeta
	 */
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNombrePropietario(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the trayectos
	 */
	public int getTrayectos() {
		return trayectos;
	}

	/**
	 * @param trayectos the trayectos to set
	 */
	public void setTrayectos(int trayectos) {
		this.trayectos = trayectos;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/* Metodo toSring para los atributos de tajeta de bus
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BusCard [numeroTarjeta=" + numeroTarjeta + ", saldo=" + saldo + "]";
	}
	
	
	
	

}
