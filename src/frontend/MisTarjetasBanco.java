package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cards.BankCard;
import recursividad.MergeSort;
import sqlite.SelectData;
import users.User;

import javax.swing.JTable;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class MisTarjetasBanco extends JFrame {

	private JPanel contentPane;
	private ArrayList<BankCard> listaBanca;



	/**
	 * Create the frame.
	 * @param  
	 */
	public MisTarjetasBanco(User usuario, ArrayList<BankCard> listaBanca) {
        SelectData sD = new SelectData();
        //listaBanca = sD.selectTarjetaBanco();
       
        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i < listaBanca.size(); i++)
        {
        	
        	if(usuario.getIdUser() == listaBanca.get(i).getPropietario()){
        		model.addElement(listaBanca.get(i));
        	}
           
        }
        JList<BankCard> list = new JList<BankCard>(model);
        
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(44, 51, 121, 165);
		contentPane.add(scrollPane);
		
				
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MisTarjetasBanco.this.setVisible(false);
				
				
                MostrarTarjetaBanco mostrarTarjetaBanco =new MostrarTarjetaBanco(list.getSelectedValue());
                mostrarTarjetaBanco.setVisible(true);
                //MisTarjetasBanco.this.dispose();
				
			}
		});
		btnMostrar.setBounds(250, 61, 165, 29);
		contentPane.add(btnMostrar);
		
		JButton btnOrdenarPor = new JButton("Ordenar menor saldo");
		btnOrdenarPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int izq = 0;
				int der = listaBanca.size()-1;
				MergeSort merge = new MergeSort();
				merge.mergesort(listaBanca, izq, der);
				
				 MisTarjetasBanco.this.setVisible(false);
	             MisTarjetasBanco.this.dispose();
	             
	             MisTarjetasBanco ms = new MisTarjetasBanco(usuario, listaBanca);
	             ms.setVisible(true);
			}
		});
		btnOrdenarPor.setBounds(250, 119, 165, 29);
		contentPane.add(btnOrdenarPor);
		
		JButton btnAadirTarjeta = new JButton("A\u00F1adir Tarjeta");
		btnAadirTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntroducirTarjetaBanco introducirTarjetaBanco = new IntroducirTarjetaBanco(usuario);
				introducirTarjetaBanco.setVisible(true);
			}
		});
		btnAadirTarjeta.setBounds(250, 176, 165, 29);
		contentPane.add(btnAadirTarjeta);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MisTarjetasBanco.this.setVisible(false);
				MisTarjetasBanco.this.dispose();
			}
		});
		btnOk.setBounds(144, 326, 115, 29);
		contentPane.add(btnOk);
	}
}
