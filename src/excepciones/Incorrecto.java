package excepciones;

     /**
      * Mediante esta clase gestionaremos la excepci�n Incorrecto
      * @author Aratz y Ant�n
      *
      */

public class Incorrecto extends Exception {
	
     	/**
	     * El m�todo extiende de la clase Exception para mostrar el mensaje de de error
	     * @param mensaje es el mensaje que se mostrar�
	     */
	
	
		public Incorrecto(String mensaje) {
			super(mensaje);
	}

}
