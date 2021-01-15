package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cards.BankCard;
import users.User;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroducirTarjetaBanco extends JFrame {

	private JPanel contentPane;
	private JTextField txtBanco;
	private JTextField txtNumerotarjeta;
	private JTextField txtNumerosecreto;
	private JTextField txtSaldo;
	
	private String banco;
	private Boolean credito;
	private int numTarjeta;
	private int numSeguridad;
	private int dinero;
	
	private ArrayList<BankCard> listaBanca;
	private BankCard tarjetaBanco = new BankCard();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroducirTarjetaBanco frame = new IntroducirTarjetaBanco();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public IntroducirTarjetaBanco(User usuario) {
		
		sqlite.InsertData sD = new sqlite.InsertData();

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEntidadBancaria = new JLabel("Entidad bancaria");
		lblEntidadBancaria.setBounds(30, 54, 137, 20);
		contentPane.add(lblEntidadBancaria);
		
		JLabel lblTipoTarjeta = new JLabel("Tipo Tarjeta");
		lblTipoTarjeta.setBounds(30, 103, 116, 20);
		contentPane.add(lblTipoTarjeta);
		
		JLabel lblNumeroTarjeta = new JLabel("Numero Tarjeta");
		lblNumeroTarjeta.setBounds(30, 151, 116, 20);
		contentPane.add(lblNumeroTarjeta);
		
		JLabel lblCvv = new JLabel("CVV");
		lblCvv.setBounds(30, 204, 69, 20);
		contentPane.add(lblCvv);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(30, 257, 69, 20);
		contentPane.add(lblSaldo);
		
		txtBanco = new JTextField();
		txtBanco.setText("");
		txtBanco.setBounds(180, 51, 146, 26);
		contentPane.add(txtBanco);
		txtBanco.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(180, 100, 146, 26);
		comboBox.addItem("Credito");
		comboBox.addItem("Debito");
		contentPane.add(comboBox);
		
		
		txtNumerotarjeta = new JTextField();
		txtNumerotarjeta.setText("");
		txtNumerotarjeta.setBounds(180, 148, 227, 26);
		contentPane.add(txtNumerotarjeta);
		txtNumerotarjeta.setColumns(10);
		
		txtNumerosecreto = new JTextField();
		txtNumerosecreto.setText("");
		txtNumerosecreto.setBounds(180, 201, 146, 26);
		contentPane.add(txtNumerosecreto);
		txtNumerosecreto.setColumns(10);
		
		txtSaldo = new JTextField();
		txtSaldo.setText("");
		txtSaldo.setBounds(180, 254, 146, 26);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				banco = txtBanco.getText();
				
				if(comboBox.getSelectedItem().toString().matches("Credito")){
					credito = true;
				}else{
					credito = false;
				}			
				
				int numeroTarj = Integer.parseInt(txtNumerotarjeta.getText());
				numTarjeta = numeroTarj;
				
				int numeroSeg = Integer.parseInt(txtNumerosecreto.getText());
				numSeguridad = numeroSeg;
				
				int money = Integer.parseInt(txtSaldo.getText());
				dinero = money;
				
				tarjetaBanco = new BankCard(banco, credito, numTarjeta, numSeguridad, dinero, "Tarjeta Banco", usuario.getIdUser());
				sD.insertTarjetaBanco(tarjetaBanco);
				
				 IntroducirTarjetaBanco.this.setVisible(false);
	             IntroducirTarjetaBanco.this.dispose();
	             MisTarjetasBanco misTarjetasBanco = new MisTarjetasBanco(usuario, listaBanca);
	             misTarjetasBanco.setVisible(true);
			}
		});
		btnOk.setBounds(166, 323, 115, 29);
		contentPane.add(btnOk);
	}

}
