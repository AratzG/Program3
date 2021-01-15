package frontend;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sqlite.InsertData;
import sqlite.SelectData;
import users.User;
import cards.BusCard;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class IntroducirTarjetaBus extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumerotarjeta;
	private JTextField txtLocalidad;
	private JTextField txtSaldo;
	private JTextField txtNombretarjeta;
	private ArrayList<BusCard> listaBus;
	private String numeroTarjeta;
	private String localidad;
	private int trayectos;
	private int saldo;
	private String nombreTarjeta;
	


	/**
	 * Create the frame.
	 */
	public IntroducirTarjetaBus(User usuario) {
		InsertData iD = new InsertData();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroTarjeta = new JLabel("Numero Tarjeta");
		lblNumeroTarjeta.setBounds(15, 90, 129, 20);
		contentPane.add(lblNumeroTarjeta);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(15, 150, 69, 20);
		contentPane.add(lblLocalidad);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(15, 246, 69, 20);
		contentPane.add(lblSaldo);
		
		JLabel lblNombreTarjeta = new JLabel("Nombre Tarjeta");
		lblNombreTarjeta.setBounds(15, 298, 129, 20);
		contentPane.add(lblNombreTarjeta);
		
		JLabel lblIntroduceLosDatos = new JLabel("Introduce los datos de tu tarjeta de Bus:");
		lblIntroduceLosDatos.setBounds(15, 34, 314, 20);
		contentPane.add(lblIntroduceLosDatos);
		
		txtNumerotarjeta = new JTextField();
		txtNumerotarjeta.setText("");
		txtNumerotarjeta.setBounds(179, 87, 146, 26);
		contentPane.add(txtNumerotarjeta);
		txtNumerotarjeta.setColumns(10);
		
		txtLocalidad = new JTextField();
		txtLocalidad.setText("");
		txtLocalidad.setBounds(179, 150, 146, 26);
		contentPane.add(txtLocalidad);
		txtLocalidad.setColumns(10);
		
		txtSaldo = new JTextField();
		txtSaldo.setText("");
		txtSaldo.setBounds(179, 243, 146, 26);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		txtNombretarjeta = new JTextField();
		txtNombretarjeta.setText("");
		txtNombretarjeta.setBounds(179, 295, 146, 26);
		contentPane.add(txtNombretarjeta);
		txtNombretarjeta.setColumns(10);
		
		JLabel lblViajes = new JLabel("Viajes");
		lblViajes.setBounds(15, 197, 69, 20);
		contentPane.add(lblViajes);
		
		JSpinner spinner = new JSpinner();
		for(int i = 0; i<100; i++){spinner.setValue(i);}
		spinner.setBounds(189, 201, 32, 26);
		contentPane.add(spinner);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numeroTarjeta = txtNumerotarjeta.getText();
				localidad = txtLocalidad.getText();
				trayectos = (int) spinner.getValue();
				saldo = Integer.parseInt(txtSaldo.getText());
				nombreTarjeta = txtNombretarjeta.getText();
				
				BusCard busCard = new BusCard(numeroTarjeta, localidad, trayectos, saldo, nombreTarjeta, usuario.getIdUser());
				iD.insertTarjetaBus(busCard);
				
				IntroducirTarjetaBus.this.setVisible(false);
				IntroducirTarjetaBus.this.dispose();
			}
		});
		btnOk.setBounds(160, 371, 115, 29);
		contentPane.add(btnOk);
		

	}
}
