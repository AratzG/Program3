package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import excepciones.PasswordDistintas;
import users.User;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class VentanaRegistro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNombre;
	private JTextField txtEmail;
	private JPasswordField pwdPassword;
	
	User usuario = new User();
	private JLabel lblRepetirPassword;
	private JPasswordField pwdPasswordrepetida;
	
	boolean contrasenyasIguales;
	

	/**
	 * Create the frame.
	 * @param login 
	 * @param listaUsuarios
	 */
	public VentanaRegistro(ArrayList <User> listaUsuarios, Login login) {
		
        sqlite.InsertData sD = new sqlite.InsertData();
   
		
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(25, 43, 69, 20);
		contentPane.add(lblNombre);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(25, 97, 69, 20);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(25, 201, 69, 20);
		contentPane.add(lblEmail);
		
		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(177, 40, 146, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("");
		txtEmail.setBounds(177, 198, 146, 26);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("");
		pwdPassword.setBounds(177, 94, 146, 26);
		contentPane.add(pwdPassword);
		
		lblRepetirPassword = new JLabel("Repetir Password");
		lblRepetirPassword.setBounds(25, 147, 129, 20);
		contentPane.add(lblRepetirPassword);
		
		pwdPasswordrepetida = new JPasswordField();
		pwdPasswordrepetida.setText("");
		pwdPasswordrepetida.setBounds(177, 144, 146, 26);
		contentPane.add(pwdPasswordrepetida);
		pwdPasswordrepetida.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					contrasenyasIguales = passwordIguales(pwdPasswordrepetida, pwdPassword);
					
					if(contrasenyasIguales){
						
												
						int idUser = calcularSiguienteId(listaUsuarios);
						String nombre = txtNombre.getText();
						String password = pwdPassword.getText();
						String email = txtEmail.getText();
						
						usuario = new User(idUser ,nombre, password, email, false);
						sD.insertUsuario(usuario);
						
						VentanaRegistro.this.setVisible(false);
		                VentanaRegistro.this.dispose();
		                Login nuevoLogin = new Login();
		                nuevoLogin.setVisible(true);						

					}
				} catch (PasswordDistintas e1) {
					JOptionPane.showMessageDialog(VentanaRegistro.this, e1.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
					pwdPasswordrepetida.setText("");
					pwdPassword.setText("");
				}

	
				
								



			}
		});
		btnOk.setBounds(174, 257, 115, 29);
		contentPane.add(btnOk);
		
		

	}
	
	int calcularSiguienteId(ArrayList<User> listaUsuarios) {
			
		int ultimaPos = 0;
		 
		for(int i=0;i<listaUsuarios.size();i++)
           {
			ultimaPos ++;
           }			
		
		return listaUsuarios.get(ultimaPos-1).getIdUser() + 1;
		
	}
	
	boolean passwordIguales(JPasswordField pwdPasswordrepetida, JPasswordField pwdPassword)throws PasswordDistintas{
		boolean sonIguales = false;
		
		if(pwdPasswordrepetida.getText().equals(pwdPassword.getText())){
			sonIguales = true;
		}else{
			throw new PasswordDistintas("Ambas password no coinciden, vuelve a introducirlas.");
		}
		
		return sonIguales;
	}

}
