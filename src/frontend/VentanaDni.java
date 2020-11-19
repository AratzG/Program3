package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class VentanaDni extends JFrame {

	private JPanel contentPane;


/**
 * Esta es la ventana en la que se mostrará el DNI
 * @author Aratz y Antón
 *
 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDni frame = new VentanaDni();
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
	public VentanaDni() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setText("nombre");
		txtpnNombre.setBounds(198, 37, 81, 26);
		contentPane.add(txtpnNombre);
		
		JTextPane txtpnApellido = new JTextPane();
		txtpnApellido.setText("Apellido1");
		txtpnApellido.setBounds(198, 79, 81, 26);
		contentPane.add(txtpnApellido);
		
		JTextArea txtrApellido = new JTextArea();
		txtrApellido.setText("Apellido 2");
		txtrApellido.setBounds(198, 119, 104, 35);
		contentPane.add(txtrApellido);
	}
}
