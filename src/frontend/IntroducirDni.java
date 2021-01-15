package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import cards.DNI;
import sqlite.SelectData;
import users.User;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class IntroducirDni extends JFrame {

	private JPanel contentPane;
	private JTextField txtFeccaducidad;
	private JTextField txtFecnacimiento;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private JTextField txtNombre;
	private JTextField txtDni;
	
	DNI dni = new DNI();
	
	private String numDni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int fecNacimiento;
	private int fecCaducidad;
	



	/**
	 * Create the frame.
	 */
	public IntroducirDni(User usuario, MenuMisTarjetas menuMisTarjetas) {
		sqlite.InsertData sD = new sqlite.InsertData();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(21, 79, 57, 20);
		contentPane.add(lblNombre);
		
		JLabel lblPrimerApellido = new JLabel("Primer Apellido");
		lblPrimerApellido.setBounds(21, 123, 110, 20);
		contentPane.add(lblPrimerApellido);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido");
		lblSegundoApellido.setBounds(21, 163, 146, 20);
		contentPane.add(lblSegundoApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(21, 42, 28, 20);
		contentPane.add(lblDni);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(21, 207, 124, 20);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblFechaCaducidad = new JLabel("Fecha Caducidad");
		lblFechaCaducidad.setBounds(21, 251, 118, 20);
		contentPane.add(lblFechaCaducidad);
		
		txtFeccaducidad = new JTextField();
		txtFeccaducidad.setBounds(183, 248, 146, 26);
		txtFeccaducidad.setText("");
		contentPane.add(txtFeccaducidad);
		txtFeccaducidad.setColumns(10);
		
		txtFecnacimiento = new JTextField();
		txtFecnacimiento.setBounds(183, 204, 146, 26);
		txtFecnacimiento.setText("");
		contentPane.add(txtFecnacimiento);
		txtFecnacimiento.setColumns(10);
		
		txtApellido1 = new JTextField();
		txtApellido1.setBounds(184, 160, 146, 26);
		txtApellido1.setText("");
		contentPane.add(txtApellido1);
		txtApellido1.setColumns(10);
		
		txtApellido2 = new JTextField();
		txtApellido2.setBounds(183, 120, 146, 26);
		txtApellido2.setText("");
		contentPane.add(txtApellido2);
		txtApellido2.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(183, 76, 146, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setText("");
		txtDni.setBounds(183, 39, 146, 26);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		JButton btnIntroducir = new JButton("Introducir");
		btnIntroducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numDni = txtDni.getText();
				nombre = txtNombre.getText();
				apellido1 = txtApellido1.getText();
				apellido2 = txtApellido2.getText();
				fecNacimiento = Integer.parseInt(txtFecnacimiento.getText());
				fecCaducidad = Integer.parseInt(txtFeccaducidad.getText());
				
				dni = new DNI(numDni, nombre, apellido1, apellido2, fecNacimiento, fecCaducidad, "DNI", usuario.getIdUser());
				sD.insertDni(dni);
			}
		});
		btnIntroducir.setBounds(244, 313, 115, 29);
		contentPane.add(btnIntroducir);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntroducirDni.this.setVisible(false);
                MenuMisTarjetas menuMisTarjetas =new MenuMisTarjetas(usuario);
                menuMisTarjetas.setVisible(true);
                IntroducirDni.this.dispose();
				
			}
		});
		btnVolver.setBounds(77, 313, 115, 29);
		contentPane.add(btnVolver);
	}
	

}

