package Registro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Login extends JFrame{
	public Login() {
		this.setSize(1000, 700);
		setTitle("Ingresar");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null);
		//crearLogin();
		crearRegistro();
	}
	
	void crearLogin () {
		JPanel panelLogin = new JPanel();
		
		panelLogin.setSize(this.getWidth(),this.getHeight());
		panelLogin.setLocation(0,0);
		panelLogin.setLayout(null);
		panelLogin.setBackground(Color.DARK_GRAY);
		add(panelLogin);
		
		JLabel etiqueta = new JLabel("Iniciar sesión",0);
		etiqueta.setBounds(375, 100, 250, 40);
		etiqueta.setForeground(Color.WHITE);
		etiqueta.setFont(new Font("Agency FB", Font.BOLD,40));
		
		panelLogin.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel("Ingrese su usuario: ", 0);
		etiqueta2.setBounds(390, 200, 220, 35);
		etiqueta2.setFont(new Font("Agency FB", Font.BOLD,25));
		etiqueta2.setForeground(Color.WHITE);
		//etiqueta2.setOpaque(true);
		//etiqueta2.setBackground(Color.white);
		panelLogin.add(etiqueta2);
		
		JTextField cajaUsuario = new JTextField();
		cajaUsuario.setBounds(390, 236, 220, 35);
		panelLogin.add(cajaUsuario);
		
		JLabel etiquetaPass = new JLabel("Ingrese su contraseña: ", 0);
		etiquetaPass.setBounds(390, 300, 220, 35);
		etiquetaPass.setForeground(Color.WHITE);
		etiquetaPass.setFont(new Font("Agency FB", Font.BOLD,25));
		
		panelLogin.add(etiquetaPass);
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(390, 336, 220, 35);
		panelLogin.add(contrasena);
		
		JButton botonAcceder = new JButton("Acceder");
		botonAcceder.setBounds(425, 400, 150, 40);
		botonAcceder.setFont(new Font("Agency FB", Font.BOLD,30));
		panelLogin.add(botonAcceder);
		
		botonAcceder.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(cajaUsuario.getText().length()<=0) {
					cajaUsuario.setBorder(new LineBorder(Color.red,4));
					
				}else {
					cajaUsuario.setBorder(new LineBorder(Color.GREEN,4));
				}
				
				String contra = new String(contrasena.getPassword());
				
				if(contra.length()<=0) {
					contrasena.setBorder(new LineBorder(Color.red,4));
					
				}else {
					contrasena.setBorder(new LineBorder(Color.GREEN,4));
				}
				
				
				
			 

			}
		});
		
		JMenuBar barra = new JMenuBar();
		
		JMenu lista1 = new JMenu("Inicio");
		JMenu lista2 = new JMenu("Login");
		JMenu lista3 = new JMenu("Registro");
		JMenu lista4 = new JMenu("Carga");
		JMenu lista5 = new JMenu("Ayuda");
		
		barra.add(lista1);
		barra.add(lista2);
		barra.add(lista3);
		barra.add(lista4);
		barra.add(lista5);
		
		add(panelLogin);
		setJMenuBar(barra);

		
	}
	
	void crearRegistro () {
		JPanel panelRegistro = new JPanel();
		
		panelRegistro.setSize(this.getWidth(),this.getHeight());
		panelRegistro.setLocation(0,0);
		panelRegistro.setLayout(null);
		panelRegistro.setBackground(Color.decode("#432975"));
		add(panelRegistro);
		
		JLabel etiqueta = new JLabel("Registrarse",0);
		etiqueta.setBounds(375, 50, 250, 44);
		etiqueta.setForeground(Color.decode("#DCCA8A"));
		etiqueta.setFont(new Font("Agency FB", Font.BOLD,40));
		panelRegistro.add(etiqueta);
		
		JLabel etiquetaNombre = new JLabel("Ingrese su nombre ", 0);
		etiquetaNombre.setBounds(240, 140, 220, 35);
		etiquetaNombre.setFont(new Font("Agency FB", Font.BOLD,25));
		etiquetaNombre.setForeground(Color.WHITE);
		panelRegistro.add(etiquetaNombre);
		
		JTextField cajaNombre = new JTextField();
		cajaNombre.setBounds(240, 176, 220, 35);
		panelRegistro.add(cajaNombre);
		
		
		JLabel etiquetaApellido = new JLabel("Ingrese su apellido ", 0);
		etiquetaApellido.setBounds(540, 140, 220, 35);
		etiquetaApellido.setFont(new Font("Agency FB", Font.BOLD,25));
		etiquetaApellido.setForeground(Color.WHITE);
		panelRegistro.add(etiquetaApellido);
		
		JTextField cajaApellido = new JTextField();
		cajaApellido.setBounds(540, 175, 220, 35);
		panelRegistro.add(cajaApellido);
		
		JLabel etiquetacorreo = new JLabel("Correo Electronico ", 0);
		etiquetacorreo.setBounds(375, 240, 220, 35);
		etiquetacorreo.setFont(new Font("Agency FB", Font.BOLD,25));
		etiquetacorreo.setForeground(Color.WHITE);
		panelRegistro.add(etiquetacorreo);
		
		JTextField cajacorreo = new JTextField();
		cajacorreo.setBounds(375, 275, 220, 35);
		panelRegistro.add(cajacorreo);
		
		JLabel etiquetaContrasenia = new JLabel("Contraseña  ", 0);
		etiquetaContrasenia.setBounds(375, 340, 220, 35);
		etiquetaContrasenia.setFont(new Font("Agency FB", Font.BOLD,25));
		etiquetaContrasenia.setForeground(Color.WHITE);
		panelRegistro.add(etiquetaContrasenia);
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(375, 375, 220, 35);
		panelRegistro.add(contrasena);
		
		
		JLabel etiquetaContrasenia2 = new JLabel("Confirmar  contraseña  ", 0);
		etiquetaContrasenia2.setBounds(375, 440, 220, 35);
		etiquetaContrasenia2.setFont(new Font("Agency FB", Font.BOLD,25));
		etiquetaContrasenia2.setForeground(Color.WHITE);
		panelRegistro.add(etiquetaContrasenia2);
		
		JPasswordField contrasenaRepetir = new JPasswordField();
		contrasenaRepetir.setBounds(375, 475, 220, 35);
		panelRegistro.add(contrasenaRepetir);
		
		JCheckBox condiciones = new JCheckBox ("Acepto los términos y condiciones");
		condiciones.setBounds(375, 520, 220, 35);
		condiciones.setForeground(Color.WHITE);
		panelRegistro.add(condiciones);
		condiciones.setOpaque(false);
		
		
		JButton botonRegistrarse = new JButton("Registrarse");
		botonRegistrarse.setBounds(375, 570, 220, 40);
		botonRegistrarse.setFont(new Font("Agency FB", Font.BOLD,30));
		
		panelRegistro.add(botonRegistrarse);
		
		
		 botonRegistrarse.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                String contrasenia1 = new String(contrasena.getPassword());
	                String contrasenia2 = new String(contrasenaRepetir.getPassword());

	                
	                if (contrasenia1.equals(contrasenia2)) {
	                    
	                    JOptionPane.showMessageDialog(null, "Registro exitoso", "exito", JOptionPane.INFORMATION_MESSAGE);
	                } else {
	                    
	                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	                
	                
	               
	        				
	        				if(cajaNombre.getText().length()<=0) {
	        					cajaNombre.setBorder(new LineBorder(Color.red,4));
	        					
	        				}else {
	        					cajaNombre.setBorder(new LineBorder(Color.GREEN,4));
	        				}
	        				
	        				if(cajaApellido.getText().length()<=0) {
	        					cajaApellido.setBorder(new LineBorder(Color.red,4));
	        					
	        				}else {
	        					cajaApellido.setBorder(new LineBorder(Color.GREEN,4));
	        				}
	        				
	        				if(cajacorreo.getText().length()<=0) {
	        					cajacorreo.setBorder(new LineBorder(Color.red,4));
	        					
	        				}else {
	        					cajacorreo.setBorder(new LineBorder(Color.GREEN,4));
	        				}
	        				
	        				String contra = new String(contrasena.getPassword());
	        				
	        				if(contra.length()<=0) {
	        					contrasena.setBorder(new LineBorder(Color.red,4));
	        					
	        				}else {
	        					contrasena.setBorder(new LineBorder(Color.GREEN,4));
	        				}
	        				
	        				
	        				if(contra.length()<=0) {
	        					contrasenaRepetir.setBorder(new LineBorder(Color.red,4));
	        					
	        				}else {
	        					contrasenaRepetir.setBorder(new LineBorder(Color.GREEN,4));
	        				}
	        				
	        				
	        			 

	            }
	        });
		
		
		 JMenuBar barra = new JMenuBar();
			
			JMenu lista1 = new JMenu("Inicio");
			JMenuItem login = new JMenuItem("Login");
	        JMenuItem registrar = new JMenuItem("Registrar");

	        
	        lista1.add(login);
	        lista1.add(registrar);
			
			barra.add(lista1);
			
			add(panelRegistro);
			setJMenuBar(barra);

		 
		 
		}

}
