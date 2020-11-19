package excepciones;

     /**
      * Mediante esta clase gestionaremos la excepción Incorrecto
      * @author Aratz y Antón
      *
      */

public class Incorrecto extends Exception {
	
     	/**
	     * El método extiende de la clase Exception para mostrar el mensaje de de error
	     * @param mensaje es el mensaje que se mostrará
	     */
	
	
		public Incorrecto(String mensaje) {
			super(mensaje);
	}

}
