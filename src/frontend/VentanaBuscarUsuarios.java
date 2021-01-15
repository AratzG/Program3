package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import users.User;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaBuscarUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtBuscarUsuario;
	private User usuario;	
	private JButton btnClose;


	/**
	 * Create the frame.
	 * @param listaUsuarios 
	 */
	public VentanaBuscarUsuarios(ArrayList<User> listaUsuarios) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBuscarUsuario = new JTextField();
		txtBuscarUsuario.setText("BuscarUsuario");
		txtBuscarUsuario.setBounds(141, 113, 288, 35);
		contentPane.add(txtBuscarUsuario);
		txtBuscarUsuario.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombreIntroducido = txtBuscarUsuario.getText();
				boolean usuarioEncontrado = false;
				if (nombreIntroducido != null) {

					for (User u : listaUsuarios) {

						if (u.getNomUser().equals(nombreIntroducido)) {
							usuarioEncontrado = true;
							usuario = u;
							break;
						}
					}

					if (usuarioEncontrado == false){
						JOptionPane.showMessageDialog(VentanaBuscarUsuarios.this,"No se ha encontrado el usuario");
					}

					else if (usuarioEncontrado == true) {
					
						MostrarUsuario mostrarUsuario = new MostrarUsuario(usuario);
						mostrarUsuario.setVisible(true);
						
					}
				}
			}
		});
		btnBuscar.setBounds(444, 116, 115, 29);
		contentPane.add(btnBuscar);
		
		JLabel lblNombre = new JLabel("Introduce el nombre de usuario: ");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombre.setBounds(15, 81, 298, 20);
		contentPane.add(lblNombre);
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaBuscarUsuarios.this.setVisible(false);
				VentanaBuscarUsuarios.this.dispose();
				
			}
		});
		btnClose.setBounds(242, 220, 115, 29);
		contentPane.add(btnClose);
	}

}
