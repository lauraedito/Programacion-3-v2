package examenProg;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gym extends JFrame{
	
	
	public Gym() {
		this.setSize(1000, 700);
		setTitle("Ingresar");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null); 
		
		
		//panel();
		panel2();
		
		
	}
	void panel () {
		JPanel panelGym = new JPanel (null);
		panelGym.setSize(this.getWidth()/2,this.getHeight());
		panelGym.setBackground(Color.decode("#B9A7CA"));
		add(panelGym);
		
		JPanel panelGym2 = new JPanel (null);
		panelGym2.setSize(this.getWidth()/2,this.getHeight());
		panelGym2.setLocation(this.getWidth()/2,0);
		panelGym2.setBackground(Color.decode("#F7F0FD"));
		add(panelGym2);
		
		
		
		JLabel usuario = new JLabel("Usuario: ", SwingConstants.CENTER);
		usuario.setFont(new Font("Whoduck", Font.BOLD, 25));
		usuario.setBounds(140, 150, 220, 50);
		panelGym2.add(usuario);
		
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(140, 220, 220, 35);
		panelGym2.add(cajaTexto);
		
		JLabel contraseña = new JLabel("Contraseña: ", SwingConstants.CENTER);
		contraseña.setFont(new Font("Whoduck", Font.BOLD, 25));
		contraseña.setBounds(140, 300, 220, 35);
		panelGym2.add(contraseña);
		
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(140, 360, 220, 30);
		panelGym2.add(contrasena);
		
		JButton boton = new JButton("Acceder");
		boton.setFont(new Font("Whoduck", Font.BOLD, 25));
		boton.setBounds(140, 440, 220, 35);
		panelGym2.add(boton);
		 
	}
	
	void panel2 () {
		JPanel panel2 = new JPanel (null);
		panel2.setSize(this.getWidth(),this.getHeight());
		panel2.setBackground(Color.decode("#F7F0FD"));
		add(panel2);
		

		JButton boton = new JButton("Acceder");
		boton.setFont(new Font("Whoduck", Font.BOLD, 25));
		boton.setBounds(140, 440, 220, 35);
		panel2.add(boton);
		
		
	
	}
	
	

}
