package excepciones;
	
	/**
	 * Mediante esta clase gestionaremos la excepcion DNIRepetido
	 * @author Aratz y Ant�n
	 *
	 */

public class PasswordDistintas extends Exception {
		
		/**
		 * El m�todo extiende de la clase Exception para mostrar el mensaje de de error
		 * @param mensaje es el mensaje que se mostrar�
		 */
		
		
		public PasswordDistintas(String mensaje) {
			super(mensaje);
		}

	}

