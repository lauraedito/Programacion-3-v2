package Pacman;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;

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
	        pantalla.setFocusable(true); 
	        pantalla.addKeyListener(new KeyAdapter() { 
	            @Override
	            public void keyPressed(KeyEvent e) {
	                int key = e.getKeyCode();
	                if (key == KeyEvent.VK_W) {
	                    if (!colisionMarcos(circleX, circleY - 20)) {
	                        circleY -= 20;
	                    }
	                } else if (key == KeyEvent.VK_S) {
	                    if (!colisionMarcos(circleX, circleY + 20)) {
	                        circleY += 20;
	                    }
	                } else if (key == KeyEvent.VK_A) {
	                    if (!colisionMarcos(circleX - 20, circleY)) {
	                        circleX -= 20;
	                    }
	                } else if (key == KeyEvent.VK_D) {
	                    if (!colisionMarcos(circleX + 20, circleY)) {
	                        circleX += 20;
	                    }
	                    
	                }
	                pantalla.repaint(); 
	            }
	        });
	        paneljuego.add(pantalla);
	    
	   
	        
	    JPanel reinicio = new JPanel();
	    reinicio.setPreferredSize(new Dimension(1000, 100)); 
	    reinicio.setLayout(null);
	    reinicio.setBackground(Color.gray);
	    paneljuego.add(reinicio);
	        
	    JButton btnReinicio = new JButton("Reinicio");
	    btnReinicio.setFont(new Font("Sunny Spells Basic", Font.BOLD, 35));
	    btnReinicio.setBounds(400, 20,200,50);
	    btnReinicio.setBackground(Color.decode("#4447E6"));
	    btnReinicio.setForeground(Color.decode("#FCFBFC"));
	    reinicio.add(btnReinicio);
	    btnReinicio.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	circleX = 70;
                circleY = 70;
                pantalla.repaint();
            }
        });
	    
		
		 
	}
	
	void dibujarCirculo(Graphics g) {
		
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode("#ECFF00"));
        g2d.fillOval(circleX, circleY, 50, 50); 
        
        //muros azules
       
        g2d.setColor(Color.decode("#0100FF"));
		g2d.fillRect(0,580, 1000, 20);
	 
		g2d.setColor(Color.decode("#0100FF"));
		g2d.fillRect(0,0, 1000, 20);
		
		g2d.setColor(Color.decode("#0100FF"));
		g2d.fillRect(0,0, 20, 700);
		
		g2d.setColor(Color.decode("#0100FF"));
		g2d.fillRect(980,0, 20, 700);
		
		
       
       
    }
	
	boolean colisionMarcos(int x, int y) {
       
        if (x <= 20 || x >= 930 || y <= 20 || y >= 560) {
            return true;
        }
        return false;
    }
	
	
	
} 
