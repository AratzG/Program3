package cards;

/**
 * Clase para crear cualquier tipo de tarjeta a partir de los datos que se
 * 			introduzcan el la ventana.
 * @author Anton y Aratz
 *
 * @param <T>
 */

public class TarjetaGenerica<T> {
	private T campo;
	
	/**
	 * Constructor de la tarjeta generica
	 */
	public TarjetaGenerica(){
		campo=null;
	}
	
	/**
	 * Establece el tipo de valor de campo segun el input del usuario
	 * @param nuevoValor valor introudido por el usuario en la ventan
	 */
	public void setCampo(T nuevoValor){
		campo = nuevoValor;
	}
	
	/**
	 * Obtiene el atributo campo
	 * @return
	 */
	
	public T getCampo(){
		return campo;
	}
	
	
}
