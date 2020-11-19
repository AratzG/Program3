package frontend;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import excepciones.UsuarioNoExiste;

import sqlite.SelectData;

import users.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * Este método sirve para hacer el login 
 * @author Aratz y Antón
 *
 */
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JTextField textPassword;
	
    private ArrayList<User> listaUsuarios;
    private User usuario = new User();
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Aqui se realiza el login
	 * 
	 * 
	 */
	public Login() {
		
        sqlite.SelectData sD = new sqlite.SelectData();
        listaUsuarios = sD.selectUsuario();
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(32, 37, 69, 20);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(32, 95, 69, 20);
		contentPane.add(lblPassword);
		
		textUser = new JTextField();
		textUser.setBounds(178, 34, 146, 26);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setBounds(178, 92, 146, 26);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioInput = textUser.getText();
                String passwordInput = textPassword.getText();

                
                try
                {
                    boolean encontrado = comprobarUsuario(usuarioInput, passwordInput);
                    if(encontrado)
                    {
                        if(usuario.isAdmin()==true)
                        {
                            Login.this.setVisible(false);
                            VentanaAdmin ventana=new VentanaAdmin(listaUsuarios, Login.this);
                            ventana.setVisible(true);
                            Login.this.dispose();
                        }
                        else
                        {
                            Login.this.setVisible(false);
                            Menu menu = new Menu(usuario, Login.this);
                            menu.setVisible(true);
                        }
                    }
                } catch (UsuarioNoExiste e1) {
                    JOptionPane.showMessageDialog(Login.this, e1.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
		btnLogin.setBounds(60, 143, 115, 29);
		contentPane.add(btnLogin);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(246, 143, 115, 29);
		contentPane.add(btnSignIn);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login.this.dispose();
            }
        });
		btnExit.setBounds(162, 199, 115, 29);
		contentPane.add(btnExit);
	}
	/**
     * Sirve para comprobar que el usuario no existe o que la contraseña introducida es incorrecta
     * @param usuarioInput el usuario introducido 
     * @param passwordInput la contraseña introducida
     * 
     */
	
	public boolean comprobarUsuario(String usuarioInput, String passwordInput) throws UsuarioNoExiste
    {
        boolean encontrado = false;
        boolean contraIncorr = true;
        User userActual = new User();
        SelectData sD = new SelectData();
        listaUsuarios = sD.selectUsuario();
        for(int i=0;i<listaUsuarios.size();i++)
        {
            if(listaUsuarios.get(i).getNomUser().equals(usuarioInput))
            {
                encontrado=true;
                userActual=listaUsuarios.get(i);
            }
        }
        if(!encontrado)
        {
            throw new UsuarioNoExiste("El usuario introducido no existe");
        }
        else
        {
            for(int i=0;i<listaUsuarios.size();i++)
            {
                if(listaUsuarios.get(i).getPassword().equals(passwordInput))
                {
                    contraIncorr=false;
                }
            }
            if(contraIncorr)
            {
                throw new UsuarioNoExiste("ContraseÃ±a incorrecta");
            }
            else
            {
                setUser(userActual);
                return true;
            }
        }
    }

    public void setUser(User usuario) {
        this.usuario = usuario;
    }
    
	public User getUser() {
        return usuario;
    }




}
