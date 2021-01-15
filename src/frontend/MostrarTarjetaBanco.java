package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cards.BankCard;
import cards.DNI;
import sqlite.SelectData;
import users.User;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarTarjetaBanco extends JFrame {

	private JPanel contentPane;
	private BankCard r;


	/**
	 * Create the frame.
	 */
	public MostrarTarjetaBanco( BankCard tarjetaBanco) {
		
/*		ArrayList<BankCard> listaBanca = new ArrayList<BankCard>();
		SelectData sd = new SelectData();
		listaBanca = sd.selectTarjetaBanco();
		
		int contador =0;
		for(BankCard b : listaBanca){
			contador++;
			if(usuario.getIdUser() == b.getPropietario()){
		
				break;
				
			}
		}
		*/

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEntidadBancaria = new JLabel("Entidad Bancaria");
		lblEntidadBancaria.setBounds(25, 55, 127, 20);
		contentPane.add(lblEntidadBancaria);
		
		JLabel lblTipoTarjeta = new JLabel("Tipo Tarjeta");
		lblTipoTarjeta.setBounds(25, 109, 127, 20);
		contentPane.add(lblTipoTarjeta);
		
		JLabel lblNumeroTarjeta = new JLabel("Numero Tarjeta");
		lblNumeroTarjeta.setBounds(25, 168, 127, 20);
		contentPane.add(lblNumeroTarjeta);
		
		JLabel lblCvv = new JLabel("CVV");
		lblCvv.setBounds(25, 218, 69, 20);
		contentPane.add(lblCvv);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(25, 274, 69, 20);
		contentPane.add(lblSaldo);
		
		
		
		
		JLabel lblBanco = new JLabel(tarjetaBanco.getBanco());
		lblBanco.setBounds(190, 55, 69, 20);
		contentPane.add(lblBanco);
		
		String tipoTarjeta = null;
		
		if(tarjetaBanco.getCredito().TRUE){
			tipoTarjeta = "Credito";
		}else{
			tipoTarjeta ="Debito";
		}
		
		JLabel lblEscredito = new JLabel(tipoTarjeta);
		lblEscredito.setBounds(190, 109, 69, 20);
		contentPane.add(lblEscredito);
		
		String numeroTarj = String.valueOf(tarjetaBanco.getNumTarjeta());
		
		JLabel lblNumtarjeta = new JLabel(numeroTarj);
		lblNumtarjeta.setBounds(190, 168, 69, 20);
		contentPane.add(lblNumtarjeta);
		
		String numeroSeg = String.valueOf(tarjetaBanco.getNumSeguridad());
		
		JLabel lblNumseguridad = new JLabel(numeroSeg);
		lblNumseguridad.setBounds(190, 218, 69, 20);
		contentPane.add(lblNumseguridad);
		
		String numeroMoney = String.valueOf(tarjetaBanco.getDinero());
		
		JLabel lblMoney = new JLabel(numeroMoney);
		lblMoney.setBounds(190, 274, 69, 20);
		contentPane.add(lblMoney);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 MostrarTarjetaBanco.this.setVisible(false);
	             MostrarTarjetaBanco.this.dispose();
	             
			}
		});
		btnOk.setBounds(145, 310, 115, 29);
		contentPane.add(btnOk);
		
		
	}

}
