package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import users.User;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarUsuario extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public MostrarUsuario(User usuario) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(38, 99, 69, 20);
		contentPane.add(lblNombre);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(38, 152, 69, 20);
		contentPane.add(lblPassword);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(38, 203, 69, 20);
		contentPane.add(lblCorreo);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(38, 63, 69, 20);
		contentPane.add(lblId);
		
		JLabel lblDatosDelUsuario = new JLabel("Datos del usuario seleccionado");
		lblDatosDelUsuario.setBounds(64, 16, 227, 20);
		contentPane.add(lblDatosDelUsuario);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                MostrarUsuario.this.setVisible(false);
                MostrarUsuario.this.dispose();
                
       
			}
		});
		btnOk.setBounds(176, 255, 115, 29);
		contentPane.add(btnOk);
		
	
		
		JLabel lblIdmostrado = new JLabel(String.valueOf(usuario.getIdUser()));
		lblIdmostrado.setBounds(162, 63, 69, 20);
		contentPane.add(lblIdmostrado);
		
		JLabel lblNombremostrado = new JLabel(usuario.getNomUser());
		lblNombremostrado.setBounds(162, 99, 109, 20);
		contentPane.add(lblNombremostrado);
		
		JLabel lblPasswordmostrado = new JLabel(usuario.getPassword());
		lblPasswordmostrado.setBounds(162, 152, 115, 20);
		contentPane.add(lblPasswordmostrado);
		
		JLabel lblCorreomostrado = new JLabel(usuario.getCorreo());
		lblCorreomostrado.setBounds(162, 203, 150, 20);
		contentPane.add(lblCorreomostrado);
	}
}
