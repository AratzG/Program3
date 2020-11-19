package excepciones;
       
   		/**
   		 * Mediante esta clase gestionaremos la excepción DNINoEncontrado
   		 * @author Aratz y Antón
   		 *
   		 */
public class DniNoEncontrado extends Exception{
	
		/**
		 * El método extiende de la clase Exception para mostrar el mensaje de de error
		 * @param mensaje es el mensaje que se mostrará
		 */
	
				public DniNoEncontrado(String mensaje) {
					super(mensaje);
	}

}

