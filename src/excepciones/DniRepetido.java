package excepciones;
	
	/**
	 * Mediante esta clase gestionaremos la excepcion DNIRepetido
	 * @author Aratz y Ant�n
	 *
	 */

public class DniRepetido extends Exception {
		
		/**
		 * El m�todo extiende de la clase Exception para mostrar el mensaje de de error
		 * @param mensaje es el mensaje que se mostrar�
		 */
		
		
		public DniRepetido(String mensaje) {
			super(mensaje);
		}

	}

