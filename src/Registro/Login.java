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
		JFrame frame;
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null);
		
		crearLogin(this);
		///crearRecuperacion (this);
		//crearRegistro(this);
		
	}
	
	void crearLogin (JFrame frame) {
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
		
		JMenu lista1 = new JMenu("Cuenta");
		
		JMenuItem login = new JMenuItem("Login");
		lista1.add(login);
		
		JMenuItem registrar = new JMenuItem("Registro");
		lista1.add(registrar);
		
		JMenuItem recuperarCuenta = new JMenuItem("Recuperación de cuenta");
		lista1.add(recuperarCuenta);
		 
		
		JMenu lista2 = new JMenu("Usuarios");
		JMenuItem alta = new JMenuItem("Alta");
		lista2.add(alta);
		
		JMenuItem baja = new JMenuItem("Baja");
		lista2.add(baja);
		
		JMenuItem consultar = new JMenuItem("Consultar");
		lista2.add(consultar);
		
		
		JMenu lista3 = new JMenu("Ayuda");
		JMenuItem usuario = new JMenuItem("¿Cómo crear un usuario?");
		lista3.add(usuario);
		
		JMenuItem sistema = new JMenuItem("¿Cómo acceder al sistema?");
		lista3.add(sistema);
		
		JMenuItem olvidarContraseña = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		lista3.add(olvidarContraseña);

		barra.add(lista1);
		barra.add(lista2);
		barra.add(lista3);
		
		add(panelLogin);
		setJMenuBar(barra);
		
		JButton botoncuenta = new JButton("crear cuenta");
		botoncuenta.setBounds(400, 460, 200, 40);
		botoncuenta.setFont(new Font("Agency FB", Font.BOLD,30));
		panelLogin.add(botoncuenta);
		
		botoncuenta.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			panelLogin.setVisible(false);
			crearRegistro(frame);
		}
		
			
		});
		
		recuperarCuenta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					panelLogin.setVisible(false);
					crearRecuperacion(frame);
				}
					
				});
		
		registrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					panelLogin.setVisible(false);
					crearRegistro(frame);
				}
				
					
				});
		 
		 
		
	}

	void crearRegistro (JFrame frame) {
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
	                String nombre = cajaNombre.getText();
    		        String apellido = cajaApellido.getText();
    		        String correo = cajacorreo.getText();
    		        
    		        boolean aceptaTerminos = condiciones.isSelected();
    		        
    	 	        
    		        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contrasenia1.isEmpty() || contrasenia2.isEmpty()) {
    		            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
    		            if (nombre.isEmpty()) cajaNombre.setBorder(new LineBorder(Color.RED, 4));
    		            if (apellido.isEmpty()) cajaApellido.setBorder(new LineBorder(Color.RED, 4));
    		            if (correo.isEmpty()) cajacorreo.setBorder(new LineBorder(Color.RED, 4));
    		            if (contrasenia1.isEmpty()) contrasena.setBorder(new LineBorder(Color.RED, 4));
    		            if (contrasenia2.isEmpty()) contrasenaRepetir.setBorder(new LineBorder(Color.RED, 4));
    		            return;
    		        }
    		        
    		       
    		        if (!correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
    		            JOptionPane.showMessageDialog(null, "Por favor, ingrese un correo electrónico válido", "Error", JOptionPane.ERROR_MESSAGE);
    		            cajacorreo.setBorder(new LineBorder(Color.RED, 4));
    		            return;
    		        }
    		        
    		       
    		        if (contrasenia1.length() < 8) {
    		            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
    		            contrasena.setBorder(new LineBorder(Color.RED, 2));
    		            return;
    		        }
    		        
    		        
    		        if (!contrasenia1.equals(contrasenia2)) {
    		            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
    		            contrasena.setBorder(new LineBorder(Color.RED, 4));
    		            contrasenaRepetir.setBorder(new LineBorder(Color.RED, 4));
    		            return;
    		        }
    		        
    		        
    		        if (!aceptaTerminos) {
    		            JOptionPane.showMessageDialog(null, "Debe aceptar los términos y condiciones", "Error", JOptionPane.ERROR_MESSAGE);
    		            return;
    		        }
    		        
    		        
    		        JOptionPane.showMessageDialog(null, "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    				

	                
	                
	        				
	        				
	        		
	            }
	        });
		
		
		JMenuBar barra = new JMenuBar();
			
		JMenu lista1 = new JMenu("Cuenta");
		JMenuItem login = new JMenuItem("Login");
	    JMenuItem registrar = new JMenuItem("Registro");
	    JMenuItem recuperarLaCuenta = new JMenuItem("Recuperación de cuenta");
		lista1.add(recuperarLaCuenta);
	    
		JMenu lista2 = new JMenu("Usuarios");
		JMenuItem altaR = new JMenuItem("Alta");
		lista2.add(altaR);
		
		JMenuItem baja = new JMenuItem("Baja");
		lista2.add(baja);
		
		JMenuItem consultar = new JMenuItem("Consultar");
		lista2.add(consultar);
		
		JMenu lista3 = new JMenu("Ayuda");
		JMenuItem usuario = new JMenuItem("¿Cómo crear un usuario?");
		lista3.add(usuario);
		
		JMenuItem sistema = new JMenuItem("¿Cómo acceder al sistema?");
		lista3.add(sistema);
		
		JMenuItem olvidarContraseña = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		lista3.add(olvidarContraseña);
		lista1.add(login);
	    lista1.add(registrar);
	    lista1.add(recuperarLaCuenta);
	        
	    lista2.add(altaR);
	    lista2.add(baja);
	    lista2.add(consultar);
	        
	    lista3.add(usuario);
	    lista3.add(sistema);
	    lista3.add(olvidarContraseña);
			
		barra.add(lista1);
		barra.add(lista2);
		barra.add(lista3);
			
		add(panelRegistro);
		setJMenuBar(barra);

		 //login
			login.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelRegistro.setVisible(false);
					crearLogin(frame);
				}
				
					
				});
			
			recuperarLaCuenta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panelRegistro.setVisible(false);
					crearRecuperacion(frame);
				}
				
					
				});
		    
		}
	
	void crearRecuperacion (JFrame frame) {
		JPanel panelRe = new JPanel();
		panelRe.setSize(this.getWidth(),this.getHeight());
		panelRe.setLocation(0,0);
		panelRe.setLayout(null);
		panelRe.setBackground(Color.decode("#432975"));
		add(panelRe);
		
		JLabel recuperacion = new JLabel("Recuperación",0);
		recuperacion.setBounds(375, 100, 250, 40);
		recuperacion.setForeground(Color.WHITE);
		recuperacion.setFont(new Font("Agency FB", Font.BOLD,40));
		
		panelRe.add(recuperacion);
		
		JMenuBar barra = new JMenuBar();
		JMenu lista1 = new JMenu("Cuenta");
		JMenuItem login = new JMenuItem("Login");
	    JMenuItem registrar = new JMenuItem("Registro");
	    JMenuItem recuperarLaCuenta = new JMenuItem("Recuperación de cuenta");
		lista1.add(recuperarLaCuenta);
	     
		JMenu lista2 = new JMenu("Usuarios");
		JMenuItem altaR = new JMenuItem("Alta");
		lista2.add(altaR);
		
		JMenuItem baja = new JMenuItem("Baja");
		lista2.add(baja);
		
		JMenuItem consultar = new JMenuItem("Consultar");
		lista2.add(consultar);
		 
		JMenu lista3 = new JMenu("Ayuda");
		JMenuItem usuario = new JMenuItem("¿Cómo crear un usuario?");
		lista3.add(usuario);
		
		JMenuItem sistema = new JMenuItem("¿Cómo acceder al sistema?");
		lista3.add(sistema);
		
		JMenuItem olvidarContraseña = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		lista3.add(olvidarContraseña);
		lista1.add(login);
	    lista1.add(registrar);
	    lista1.add(recuperarLaCuenta);
	        
	    lista2.add(altaR);
	    lista2.add(baja);
	    lista2.add(consultar);
	        
	    lista3.add(usuario);
	    lista3.add(sistema);
	    lista3.add(olvidarContraseña);
			
		barra.add(lista1);
		barra.add(lista2);
		barra.add(lista3);
			
		add(panelRe);
		setJMenuBar(barra);

		 //login
			login.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					panelRe.setVisible(false);
					crearLogin(frame);
				}
				
					
				});
			
			registrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					panelRe.setVisible(false);
					crearRegistro(frame);
				}
			});
		
	}

}




