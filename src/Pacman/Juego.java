package Pacman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class Juego extends JFrame{
	
	private int circleX = 70;
    private int circleY = 70;
	
	
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
		
		
		

	    
		 JPanel pantalla = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                dibujarCirculo(g);
	                
	            }
	        };
	        pantalla.setPreferredSize(new Dimension(1000, 600));
	        pantalla.setBackground(Color.black);
	        pantalla.setFocusable(true); // Hacer el panel enfocable para que pueda recibir eventos de teclado
	        pantalla.addKeyListener(new KeyAdapter() { // Agregar KeyListener
	            @Override
	            public void keyPressed(KeyEvent e) {
	                int key = e.getKeyCode();
	                if (key == KeyEvent.VK_W) {
	                    circleY -= 20; // Mover hacia arriba
	                } else if (key == KeyEvent.VK_S) {
	                    circleY += 20; // Mover hacia abajo
	                } else if (key == KeyEvent.VK_A) {
	                    circleX -= 20; // Mover hacia la izquierda
	                } else if (key == KeyEvent.VK_D) {
	                    circleX += 20; // Mover hacia la derecha
	                }
	                pantalla.repaint(); // Volver a dibujar el círculo después de moverlo
	            }
	        });
	        paneljuego.add(pantalla);
	    
	    
	        
	    JPanel reinicio = new JPanel();
	    reinicio.setPreferredSize(new Dimension(1000, 100)); 
	    reinicio.setLayout(null);
	    reinicio.setBackground(Color.gray);
	    paneljuego.add(reinicio);
	        
	    JButton btnReinicio = new JButton("Reinicio");
	    btnReinicio.setBounds(450, 20,100,50);
	    btnReinicio.setBackground(Color.decode("#4447E6"));
	    btnReinicio.setForeground(Color.decode("#FCFBFC"));
	    reinicio.add(btnReinicio);
	    
		
		 
	}
	
	void dibujarCirculo(Graphics g) {
		
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode("#ECFF00"));
        g2d.fillOval(circleX, circleY, 50, 50); 
    }
	
	
	
} 
