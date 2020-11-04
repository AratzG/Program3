package users;

public class User {
	private int idUser;
	private String nomUser;
	private String correo;
	private String password;
	
	public User(int idUser, String nomUser, String correo, String password) {
		super();
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.correo = correo;
		this.password = password;
	}
	
	/**
	 * Creates an empty user
	 */

	public User() {
		super();
	}


	/**
	 * Gets the users ID
	 * @return An int representing the users id
	 */
	public int getIdUser() {
		return idUser;
	}
	
	/**
	 * Sets the users id
	 * @param idUser An int containing the users id
	 */

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	/**
	 * Gets the user name
	 * @return A String representing the users name
	 */

	public String getNomUser() {
		return nomUser;
	}
	
	/**
	 * Sets the users name
	 *@param nomUser A String contaning the users name
	 */

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	
	/**
	 *  Gets the users email
	 * @return A String representing the users email
	 */

	public String getCorreo() {
		return correo;
	}
	
	/**
	 * Sets the users email
	 * @param correo A String containing the users email
	 */

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	/**
	 * Gets the users password
	 * @return A String representing the users password
	 */

	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the user password
	 * @param password A string containing the users pasword
	 */

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
