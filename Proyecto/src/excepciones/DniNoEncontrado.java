package excepciones;
       
   		/**
   		 * Mediante esta clase gestionaremos la excepci�n DNINoEncontrado
   		 * @author Aratz y Ant�n
   		 *
   		 */
public class DniNoEncontrado extends Exception{
	
		/**
		 * El m�todo extiende de la clase Exception para mostrar el mensaje de de error
		 * @param mensaje es el mensaje que se mostrar�
		 */
	
				public DniNoEncontrado(String mensaje) {
					super(mensaje);
	}

}

