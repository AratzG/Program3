import users.User;

/**
 * 
 * @author Aratz
 * @version 1.0
 * @since 15/10/2020
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User Aratz;
		Aratz = new User(1, "Aratz", "aratz.dg@gmail.com", "1234");
		
		User usuarioPrueba = new User();
		
		System.out.println("ID de usuario: "+Aratz.getIdUser());
		System.out.println("Nombre de usuario: "+Aratz.getNomUser());
		System.out.println("Correo de usuario: "+Aratz.getCorreo());
		System.out.println("Contraseña de usuario: "+Aratz.getPassword());
	}

}
