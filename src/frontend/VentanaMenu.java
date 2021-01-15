package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import users.User;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMenu extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public VentanaMenu(User usuario, Login login) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 428, 244);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnTarjetas = new JButton("Mis Tarjetas");
		btnTarjetas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                VentanaMenu.this.setVisible(false);
                MenuMisTarjetas ventanaMisTarjetas =new MenuMisTarjetas(usuario);
                ventanaMisTarjetas.setVisible(true);
                VentanaMenu.this.dispose();
			}
		});
		btnTarjetas.setBounds(235, 94, 167, 29);
		panel.add(btnTarjetas);
		
		JButton btnOtros = new JButton("Mis Datos");
		btnOtros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                //VentanaMenu.this.setVisible(false);
                MostrarUsuario mostrarUsuario = new MostrarUsuario(usuario);
                mostrarUsuario.setVisible(true);
               // VentanaMenu.this.dispose();
				
			}
		});
		btnOtros.setBounds(44, 94, 131, 29);
		panel.add(btnOtros);
	}
}
