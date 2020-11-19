package excepciones;

/**
 * Mediante esta clase gestionaremos la excepción UsuarioNoExiste
 * @author Aratz y Antón
 *
 */

public class UsuarioNoExiste extends Exception
{
 	/**
     * El método extiende de la clase Exception para mostrar el mensaje de de error
     * @param mensaje es el mensaje que se mostrará
     */


    public UsuarioNoExiste(String mensaje)
    {
        super(mensaje);
    }
}
