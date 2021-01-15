package frontend;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sqlite.DeleteData;
import sqlite.SelectData;
import users.User;

import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAdmin extends JFrame {

	private JPanel contentPane;
	private ArrayList<User> listaUsuarios;


	/**
	 * Create the frame.
	 */
	public VentanaAdmin() {
        SelectData sD = new SelectData();
        listaUsuarios = sD.selectUsuario();
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		
        DefaultListModel model = new DefaultListModel();
        //for(User u : listaUsuarios)
        listaUsuarios.forEach(e->  model.addElement(e));
        
        JList<User> list = new JList<User>(model);
        
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(53, 56, 149, 213);
		contentPane.add(scrollPane);
        
	
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                MostrarUsuario mostrarUsuario = new MostrarUsuario(list.getSelectedValue());
                mostrarUsuario.setVisible(true);
                
			}
		});
		btnMostrar.setBounds(296, 75, 115, 29);
		contentPane.add(btnMostrar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try{
                	User u = list.getSelectedValue();
                    if(u!=null) {
                       DeleteData dD = new DeleteData();
                       dD.deleteUsuario(u.getNomUser());
                       
                       int indiceSeleccion = list.getSelectedIndex();
                       System.out.println(indiceSeleccion-1);
                       
                       list.remove(indiceSeleccion-1);
                       //No se me actualiza el borrado
                       
                     }
                }
                catch(NullPointerException nada)
                {
                    JOptionPane.showMessageDialog(null, "Selecciona un usuario");
                }
                
			}
		});
		btnEliminar.setBounds(296, 153, 115, 29);
		contentPane.add(btnEliminar);
		
		JLabel lblListaDeUsuarios = new JLabel("Lista de usuarios");
		lblListaDeUsuarios.setBounds(28, 20, 136, 20);
		contentPane.add(lblListaDeUsuarios);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaBuscarUsuarios buscarUsuarios = new VentanaBuscarUsuarios(listaUsuarios);
				buscarUsuarios.setVisible(true);
			}
		});
		btnBuscar.setBounds(296, 226, 115, 29);
		contentPane.add(btnBuscar);
	}
}
