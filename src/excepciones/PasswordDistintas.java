package excepciones;
	
	/**
	 * Mediante esta clase gestionaremos la excepcion DNIRepetido
	 * @author Aratz y Antón
	 *
	 */

public class PasswordDistintas extends Exception {
		
		/**
		 * El método extiende de la clase Exception para mostrar el mensaje de de error
		 * @param mensaje es el mensaje que se mostrará
		 */
		
		
		public PasswordDistintas(String mensaje) {
			super(mensaje);
		}

	}

