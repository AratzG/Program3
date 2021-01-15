package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import cards.BankCard;
import cards.BusCard;
import recursividad.MergeSort;
import recursividad.QuickSort;
import sqlite.SelectData;
import sqlite.UpdateData;
import users.User;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class MisTarjetasBus extends JFrame {

	private JPanel contentPane;
	private ArrayList<BankCard> listaBanca = new ArrayList<BankCard>();
	private JTextField textField;
	private JTextField textEuros;
	



	/**
	 * Create the frame.
	 */
	public MisTarjetasBus(User usuario, ArrayList<BusCard> listaBus) {

        
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		SelectData sD = new SelectData();
		listaBanca = sD.selectTarjetaBanco();
		

		
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i < listaBus.size(); i++)
        {
        	
        	if(usuario.getIdUser() == listaBus.get(i).getPropietario()){
        		model.addElement(listaBus.get(i));
        	}
           
        }
        JList<BusCard> list = new JList<BusCard>(model);
        
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(44, 51, 121, 165);
		contentPane.add(scrollPane);
		
				
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				MostrarTarjetaBus mostrarTarjetaBus =new MostrarTarjetaBus(list.getSelectedValue());
                mostrarTarjetaBus.setVisible(true);
                				
			}
		});
		btnMostrar.setBounds(250, 61, 130, 29);
		contentPane.add(btnMostrar);
		
		JButton btnOrdenarPor = new JButton("Ordenar por saldo");
		btnOrdenarPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int izq = 0;
				int der = listaBus.size()-1;
				QuickSort quicksort = new QuickSort();
				quicksort.quicksortSaldo(listaBus, izq, der);
				
				 MisTarjetasBus.this.setVisible(false);
	             MisTarjetasBus.this.dispose();
	             
	             MisTarjetasBus ms = new MisTarjetasBus(usuario, listaBus);
	             ms.setVisible(true);
			}
		});
		btnOrdenarPor.setBounds(250, 119, 130, 29);
		contentPane.add(btnOrdenarPor);
		
		JButton btnAadirTarjeta = new JButton("A\u00F1adir Tarjeta");
		btnAadirTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntroducirTarjetaBus introducirTarjetaBus = new IntroducirTarjetaBus(usuario);
				introducirTarjetaBus.setVisible(true);
			}
		});
		btnAadirTarjeta.setBounds(250, 173, 139, 29);
		contentPane.add(btnAadirTarjeta);
		
		textEuros = new JTextField();
		textEuros.setBounds(79, 236, 86, 26);
		contentPane.add(textEuros);
		textEuros.setColumns(10);
		

		DefaultComboBoxModel<BankCard> model2 = new DefaultComboBoxModel<BankCard>();
		JComboBox<BankCard> comboBox = new JComboBox<BankCard>(model2);
		
		comboBox.setBounds(207, 236, 208, 26);
		contentPane.add(comboBox);
		
        for(int j = 0; j < listaBanca.size(); j++)
        {
        	
        	if(usuario.getIdUser() == listaBanca.get(j).getPropietario()){
        		comboBox.addItem(listaBanca.get(j));
         	}
           
        }
		
		
		
		JButton btnRecargar = new JButton("Recargar");
		btnRecargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
/*				int cantidadAjustar = Integer.parseInt(textEuros.getText());
				int nuevoSaldoBus = list.getSelectedValue().getSaldo() - cantidadAjustar;
				int nuevoSaldoBanco = comboBox.getSelectedItem().getDinero() - cantidadAjustar;
				
				String banco = comboBox.getSelectedItem().getBanco();
				boolean credito = comboBox.getSelectedItem().isCredito();
				int numTarjetaB = comboBox.getSelectedItem().getNumTarjeta();
				int numSeguridad = comboBox.getSelectedItem().getNumSeguridad();
				String nombreTarjetaB = comboBox.getSelectedItem().getNombreTarjeta();
				int propietarioB = comboBox.getSelectedItem().getPropietario();
				
				BankCard b = new BankCard(banco, credito, numTarjetaB, numSeguridad, nuevoSaldoBanco, nombreTarjetaB, propietarioB);
				
				String numeroTarjetaU = list.getSelectedValue().getNombreTarjeta();
				String localidad = list.getSelectedValue().getLocalidad();
				int trayectos= list.getSelectedValue().getTrayectos();
				String nombreTarjetaU = list.getSelectedValue().getNombreTarjeta();
				int propietarioU = list.getSelectedValue().getPropietario();
				
				BusCard u = new BusCard(numeroTarjetaU, localidad, trayectos, nuevoSaldoBus, nombreTarjetaU, propietarioU);
				UpdateData uD = new UpdateData();
				uD.updateBanca(b);
				uD.updateBus(u);*/
				
			}
		});
		btnRecargar.setBounds(449, 235, 115, 29);
		contentPane.add(btnRecargar);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(193, 337, 115, 29);
		contentPane.add(btnOk);
		
		

	}
	

}
