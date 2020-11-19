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

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Esta es la ventana principal para entrar a nuestro gestor de tarjetas
	 * @author Aratz y Antón
	 *
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
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
			}
		});
		btnTarjetas.setBounds(43, 43, 167, 29);
		panel.add(btnTarjetas);
		
		JButton btnOtros = new JButton("Otros");
		btnOtros.setBounds(43, 128, 115, 29);
		panel.add(btnOtros);
	}

	public Menu(User usuario, Login login) {
		// TODO Auto-generated constructor stub
	}
}
