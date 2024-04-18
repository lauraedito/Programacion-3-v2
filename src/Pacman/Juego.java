package Pacman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class Juego extends JFrame{
	
	public Juego() {
		this.setSize(1000, 700);
		setTitle("Pacman");
		
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null);
		
		crearjuego ();
		
	}
	
	void crearjuego () {
		JPanel paneljuego = new JPanel();
		paneljuego.setSize(this.getWidth(),this.getHeight());
		paneljuego.setLocation(0,0);
		setLayout(null);
		add(paneljuego);
		
		
		JPanel pantalla = new JPanel();
	    pantalla.setPreferredSize(new Dimension(1000, 600)); 
	    pantalla.setBackground(Color.black);
	    paneljuego.add(pantalla);
	    
	    JPanel circulo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dibujarCirculo(g);
            }
        };
        
        circulo.setPreferredSize(new Dimension(150, 150)); // Establecemos el tamaño preferido del panel circulo
        circulo.setBackground(Color.decode("#ECFF00"));
        pantalla.add(circulo);
	    
	    
	        
	    JPanel reinicio = new JPanel();
	    reinicio.setPreferredSize(new Dimension(1000, 100)); 
	    reinicio.setBackground(Color.gray);
	    paneljuego.add(reinicio);
	        
	    JButton btnReinicio = new JButton("Reinicio");
	    btnReinicio.setBounds(10, 20,100,30);
	    btnReinicio.setBackground(Color.decode("#4447E6"));
	    btnReinicio.setForeground(Color.decode("#FCFBFC"));
	    reinicio.add(btnReinicio);
	        
		
		/*
		 
	        
	        // Agregamos el panel circulo al panel pantalla
	        JPanel circulo = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                dibujarCirculo(g);
	            }
	        };
	        circulo.setPreferredSize(new Dimension(150, 150)); // Establecemos el tamaño preferido del panel circulo
	        circulo.setBackground(Color.decode("#ECFF00"));
	        pantalla.add(circulo);
	        
	       
	        
	        
	        
	        */
		
	}
	
	void dibujarCirculo(Graphics g) {
		
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode("#ECFF00"));
        g2d.fillOval(80, 244, 150, 150); 
    }
	
} 
