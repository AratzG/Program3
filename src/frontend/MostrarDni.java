package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cards.DNI;
import sqlite.SelectData;
import users.User;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarDni extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public MostrarDni(User usuario){
		
		ArrayList<DNI> listaDnis = new ArrayList<DNI>();		
		SelectData sd = new SelectData();
		listaDnis = sd.selectDni();
		
		int contador =0;
		for(DNI d : listaDnis){
			contador++;
			if(usuario.getIdUser() == d.getPropietario()){
				
				break;
				
			}
		}

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(15, 16, 69, 20);
		contentPane.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(15, 52, 69, 20);
		contentPane.add(lblNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido");
		lblPrimerApellido.setBounds(15, 94, 121, 20);
		contentPane.add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido");
		lblSegundoApellido.setBounds(15, 130, 143, 20);
		contentPane.add(lblSegundoApellido);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(15, 166, 143, 20);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblFechaCaducidad = new JLabel("Fecha Caducidad");
		lblFechaCaducidad.setBounds(15, 202, 132, 20);
		contentPane.add(lblFechaCaducidad);
		
		JLabel lblDnimostrado = new JLabel(listaDnis.get(contador).getNumDni());
		lblDnimostrado.setBounds(182, 16, 90, 20);
		contentPane.add(lblDnimostrado);
		
		JLabel lblNombremostrado = new JLabel(listaDnis.get(contador).getNombre());
		lblNombremostrado.setBounds(182, 52, 104, 20);
		contentPane.add(lblNombremostrado);
		
		JLabel lblApellidomostrado = new JLabel(listaDnis.get(contador).getApellido1());
		lblApellidomostrado.setBounds(182, 94, 90, 20);
		contentPane.add(lblApellidomostrado);
		
		JLabel lblApellidomostrado_1 = new JLabel(listaDnis.get(contador).getApellido2());
		lblApellidomostrado_1.setBounds(182, 130, 104, 20);
		contentPane.add(lblApellidomostrado_1);
		
		
		/*Integer value = listaDnis.get(contador).getFecNacimiento();
		
		SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
		String formatedDate = newFormat.format(value);
		System.out.println(formatedDate);
		String fechaNacimiento = String.valueOf(formatedDate);*/
		
		
		String fechaNacimiento = String.valueOf(listaDnis.get(contador).getFecNacimiento());
		
		JLabel lblFecnacmostrado = new JLabel(fechaNacimiento);
		lblFecnacmostrado.setBounds(182, 166, 69, 20);
		contentPane.add(lblFecnacmostrado);
		
		String fechaCaducidad = String.valueOf(listaDnis.get(contador).getFecCaducidad());
		
		JLabel lblFeccadmostrado = new JLabel(fechaCaducidad);
		lblFeccadmostrado.setBounds(182, 202, 69, 20);
		contentPane.add(lblFeccadmostrado);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                MostrarDni.this.setVisible(false);
                MenuMisTarjetas menu = new MenuMisTarjetas(usuario);
                menu.setVisible(true);
                MostrarDni.this.dispose();
			}
		});
		btnOk.setBounds(106, 291, 115, 29);
		contentPane.add(btnOk);
	}

}
