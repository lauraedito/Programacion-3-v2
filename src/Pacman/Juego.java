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
		//paneljuego.setLayout(null);
		//paneljuego.setBackground(Color.black);
		add(paneljuego);
		
		
		JPanel circulo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dibujarCirculo(g);
            }
        };
		
		JPanel pantalla = new JPanel();
		pantalla.setBounds(0, 0, 1000,600);
		//pantalla.setLayout(null);
		pantalla.setBackground(Color.black);
		paneljuego.add(pantalla, BorderLayout.NORTH); 
		//pantalla.add(circulo);
		//pantalla.repaint();
		
		/////
		JPanel reinicio = new JPanel();
		reinicio.setBounds(0, 600, 1000,100);
		//reinicio.setLayout(null);
		reinicio.setBackground(Color.decode("#7E848B"));
		this.getContentPane().add(reinicio);
		paneljuego.add(reinicio, BorderLayout.SOUTH);
		
		JButton btnReicnicio = new JButton("Reinicio");
		btnReicnicio.setFont(new Font("Arial", Font.PLAIN, 20));
		btnReicnicio.setBounds(400, 10, 200, 40);
		btnReicnicio.setBackground(Color.decode("#4447E6"));
	//	btnReicnicio.setOpaque(true);
		btnReicnicio.setForeground(Color.decode("#FCFBFC"));
		reinicio.add(btnReicnicio);
		
		 
		
		
	}
	
	void dibujarCirculo(Graphics g) {
		
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode("#ECFF00"));
        g2d.fillOval(80, 244, 150, 150); 
    }
	
} 
