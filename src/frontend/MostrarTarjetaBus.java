package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cards.BankCard;
import cards.BusCard;

public class MostrarTarjetaBus extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public MostrarTarjetaBus(BusCard tarjetaBus) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumTarj = new JLabel("Numero Tarjeta");
		lblNumTarj.setBounds(25, 55, 127, 20);
		contentPane.add(lblNumTarj);
		
		JLabel lblMunicipio = new JLabel("Localidad");
		lblMunicipio.setBounds(25, 109, 127, 20);
		contentPane.add(lblMunicipio);
		
		JLabel lblViajes = new JLabel("Viajes");
		lblViajes.setBounds(25, 168, 127, 20);
		contentPane.add(lblViajes);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(25, 218, 69, 20);
		contentPane.add(lblSaldo);
		
		JLabel lblNomTarj = new JLabel("Nombre Tarjeta");
		lblNomTarj.setBounds(25, 274, 112, 20);
		contentPane.add(lblNomTarj);
		
		
		
		
		JLabel lblNumTarjeta = new JLabel(tarjetaBus.getNumeroTarjeta());
		lblNumTarjeta.setBounds(190, 55, 105, 20);
		contentPane.add(lblNumTarjeta);
		
				
		JLabel lblLocalidad = new JLabel(tarjetaBus.getLocalidad());
		lblLocalidad.setBounds(190, 109, 90, 20);
		contentPane.add(lblLocalidad);
		
		String numeroViajes = String.valueOf(tarjetaBus.getTrayectos());
		
		JLabel lblNumeroViajes = new JLabel(numeroViajes);
		lblNumeroViajes.setBounds(190, 168, 69, 20);
		contentPane.add(lblNumeroViajes);
		
		String money = String.valueOf(tarjetaBus.getSaldo());
		
		JLabel lblDinero = new JLabel(money);
		lblDinero.setBounds(190, 218, 69, 20);
		contentPane.add(lblDinero);
		
		JLabel lblNomtarj = new JLabel(tarjetaBus.getNombreTarjeta());
		lblNomtarj.setBounds(190, 274, 69, 20);
		contentPane.add(lblNomtarj);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostrarTarjetaBus.this.setVisible(false);
				MostrarTarjetaBus.this.dispose();
			}
		});
		btnOk.setBounds(134, 329, 115, 29);
		contentPane.add(btnOk);
		
		
	}

}
