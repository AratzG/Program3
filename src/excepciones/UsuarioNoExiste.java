package excepciones;

/**
 * Mediante esta clase gestionaremos la excepci�n UsuarioNoExiste
 * @author Aratz y Ant�n
 *
 */

public class UsuarioNoExiste extends Exception
{
 	/**
     * El m�todo extiende de la clase Exception para mostrar el mensaje de de error
     * @param mensaje es el mensaje que se mostrar�
     */


    public UsuarioNoExiste(String mensaje)
    {
        super(mensaje);
    }
}
