package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MenuMisTarjetas extends JFrame {

	private JPanel contentPane;

	/**
	 * Esta es la ventana donde apareceran las diferentes tarjetas disponibles
	 * @author Aratz y Antón
	 *
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuMisTarjetas frame = new MenuMisTarjetas();
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
	public MenuMisTarjetas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDni = new JButton("DNI");
		btnDni.setBounds(28, 36, 115, 29);
		contentPane.add(btnDni);
		
		JButton btnTarjetaBanco = new JButton("Tarjeta Banco");
		btnTarjetaBanco.setBounds(28, 108, 129, 29);
		contentPane.add(btnTarjetaBanco);
		
		JButton btnTarjetaA = new JButton("Tarjeta A");
		btnTarjetaA.setBounds(243, 36, 115, 29);
		contentPane.add(btnTarjetaA);
		
		JButton btnTarjetaB = new JButton("Tarjeta B");
		btnTarjetaB.setBounds(243, 108, 115, 29);
		contentPane.add(btnTarjetaB);
		
		JButton btnTarjetaC = new JButton("Tarjeta C");
		btnTarjetaC.setBounds(42, 175, 115, 29);
		contentPane.add(btnTarjetaC);
	}

}
