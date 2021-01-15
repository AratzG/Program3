package frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cards.BankCard;
import cards.BusCard;
import cards.DNI;
import sqlite.SelectData;
import users.User;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;



public class MenuMisTarjetas extends JFrame {
	
	private JPanel contentPane;
	ArrayList<DNI> listaDnis;
	Image img;

	/**
	 * Esta es la ventana donde apareceran las diferentes tarjetas disponibles
	 * @author Aratz y Antón
	 *
	 */

	/**
	 * Create the frame.
	 */
	public MenuMisTarjetas(User usuario) {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDni = new JButton("DNI");
		//btnDni.addActionListener(new ActionListener() {
	      btnDni.addActionListener(e->{
			//public void actionPerformed(ActionEvent e) {
				//MenuMisTarjetas.this.setVisible(false);
                MostrarDni mostrarDni =new MostrarDni(usuario);
                mostrarDni.setVisible(true);
                //MenuMisTarjetas.this.dispose();
 
				
			
				/*boolean tieneDni = dniIntroducido(usuario);
				System.out.println(tieneDni);
				if(tieneDni){
					//MenuMisTarjetas.this.setVisible(false);
	                IntroducirDni introducirDni =new IntroducirDni(usuario, MenuMisTarjetas.this);
	                introducirDni.setVisible(true);
	                //MenuMisTarjetas.this.dispose();
					
				}else {
					//MenuMisTarjetas.this.setVisible(false);
	                MostrarDni mostrarDni =new MostrarDni(usuario);
	                mostrarDni.setVisible(true);
	                //MenuMisTarjetas.this.dispose();
					
				}*/
				

			//}
		});
		btnDni.setBounds(58, 82, 129, 29);
		contentPane.add(btnDni);
		
		JButton btnTarjetaBanco = new JButton("App Banca");
		btnTarjetaBanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<BankCard> listaBanca = new ArrayList<BankCard>();
				SelectData sd = new SelectData();
				listaBanca = sd.selectTarjetaBanco();
				
				//MenuMisTarjetas.this.setVisible(false);			
			    MisTarjetasBanco misTarjetaBanco =new MisTarjetasBanco(usuario, listaBanca);
                misTarjetaBanco.setVisible(true);
                //MenuMisTarjetas.this.dispose();
				
			}
		});
		btnTarjetaBanco.setBounds(58, 154, 129, 29);
		contentPane.add(btnTarjetaBanco);
		
		JButton btnTarjetaA = new JButton("Bus Card");
		btnTarjetaA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<BusCard> listaBus = new ArrayList<BusCard>();
				SelectData sd = new SelectData();
				listaBus= sd.selectTarjetaBus();
				
				MisTarjetasBus MisTarjetasBus = new MisTarjetasBus(usuario, listaBus);
				MisTarjetasBus.setVisible(true);
			}
		});
		btnTarjetaA.setBounds(273, 82, 115, 29);
		contentPane.add(btnTarjetaA);
		
		JButton btnTarjetaB = new JButton("Generica");
		btnTarjetaB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTarjetaB.setBounds(273, 154, 115, 29);
		contentPane.add(btnTarjetaB);
		
//		img = new ImageIcon(this.getClass().getResource("images/home.png")).getImage();
//		
//		JButton btn = new JButton(new ImageIcon(img));
//		btn.setOpaque(false);
//		btn.setForeground(Color.WHITE);
//		
//		btn.setBounds(171, 214, 72, 57);
//		contentPane.add(btn);
	}
	
	public boolean dniIntroducido(User usuario){
		
		boolean dniEncontrado = false;
		
        SelectData sD = new SelectData();
        listaDnis = sD.selectUsuario();
        
        System.out.println("Id user: "+usuario.getIdUser());
        System.out.println("Propietario: "+listaDnis.get(0).getNumDni());
        
               
        for(int i = 0; i < listaDnis.size(); i++){
          	if(usuario.getIdUser() == listaDnis.get(i).getPropietario()){
        		dniEncontrado = true;
        		
        	        		
        }
		     
		
		
		
		
	}
		return dniEncontrado;
	}

}
