package excepciones;
	
	/**
	 * Mediante esta clase gestionaremos la excepcion DNIRepetido
	 * @author Aratz y Antón
	 *
	 */

public class DniRepetido extends Exception {
		
		/**
		 * El método extiende de la clase Exception para mostrar el mensaje de de error
		 * @param mensaje es el mensaje que se mostrará
		 */
		
		
		public DniRepetido(String mensaje) {
			super(mensaje);
		}

	}

