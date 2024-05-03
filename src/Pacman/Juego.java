package Pacman;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Juego extends JFrame{
	
	private int circleX = 60;
    private int circleY = 60;
   
    private Ellipse2D.Double[] cir;
    int indiceLunetaComida;
    private int contadorLunetas = 0;
    JLabel contador;
    
    
    
    private final Rectangle[] paredes = {
    		new Rectangle(150, 20, 30, 150),
    		new Rectangle(150, 140, 300, 30),
    		new Rectangle(150, 300, 30, 150),
    		new Rectangle(150, 300, 300, 30),
    		new Rectangle(150, 450, 300, 30),
    		new Rectangle(550, 300, 200, 30),
    		new Rectangle(550, 120, 30, 190),
    		new Rectangle(550, 120, 340, 30),
    		new Rectangle(720, 240, 30, 60),
    		new Rectangle(860, 120, 30, 200),
    		new Rectangle(550, 440, 340, 30),
    		new Rectangle(700, 440, 30, 130)

    };
    
  
	public Juego() {
		this.setSize(1000, 700);
		setTitle("Pacman");
		
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null);
		cir = new Ellipse2D.Double[] {
	            new Ellipse2D.Double(75, 150, 20, 20),
	            new Ellipse2D.Double(75, 200, 20, 20),
	            new Ellipse2D.Double(75, 250, 20, 20),
	            new Ellipse2D.Double(75, 300, 20, 20),
	            new Ellipse2D.Double(75, 350, 20, 20),
	            new Ellipse2D.Double(75, 400, 20, 20),
	            new Ellipse2D.Double(75, 450, 20, 20),
	            new Ellipse2D.Double(75, 450, 20, 20),
	            new Ellipse2D.Double(75, 500, 20, 20),
	            new Ellipse2D.Double(150, 520, 20, 20),
	            new Ellipse2D.Double(200, 520, 20, 20),
	            new Ellipse2D.Double(250, 520, 20, 20),
	            new Ellipse2D.Double(300, 520, 20, 20),
	            new Ellipse2D.Double(350, 520, 20, 20),
	            new Ellipse2D.Double(400, 520, 20, 20),
	            new Ellipse2D.Double(450, 520, 20, 20),
	            new Ellipse2D.Double(500, 520, 20, 20),
	            new Ellipse2D.Double(550, 520, 20, 20),
	            new Ellipse2D.Double(600, 520, 20, 20),
	            new Ellipse2D.Double(650, 520, 20, 20),
	            new Ellipse2D.Double(150, 220, 20, 20),
	            new Ellipse2D.Double(200, 220, 20, 20),
	            new Ellipse2D.Double(250, 220, 20, 20),
	            new Ellipse2D.Double(300, 220, 20, 20),
	            new Ellipse2D.Double(350, 220, 20, 20),
	            new Ellipse2D.Double(400, 220, 20, 20),
	            new Ellipse2D.Double(450, 220, 20, 20),
	            new Ellipse2D.Double(200, 70, 20, 20),
	            new Ellipse2D.Double(250, 70, 20, 20),
	            new Ellipse2D.Double(300, 70, 20, 20),
	            new Ellipse2D.Double(350, 70, 20, 20),
	            new Ellipse2D.Double(400, 70, 20, 20),
	            new Ellipse2D.Double(450, 70, 20, 20),
	            new Ellipse2D.Double(500, 70, 20, 20),
	            new Ellipse2D.Double(550, 70, 20, 20),
	            new Ellipse2D.Double(600, 70, 20, 20),
	            new Ellipse2D.Double(650, 70, 20, 20),
	            new Ellipse2D.Double(700, 70, 20, 20),
	            new Ellipse2D.Double(750, 70, 20, 20),
	            new Ellipse2D.Double(800, 70, 20, 20),
	            new Ellipse2D.Double(850, 70, 20, 20),
	            new Ellipse2D.Double(900, 70, 20, 20),
	            new Ellipse2D.Double(920, 150, 20, 20),
	            new Ellipse2D.Double(920, 200, 20, 20),
	            new Ellipse2D.Double(920, 250, 20, 20),
	            new Ellipse2D.Double(920, 300, 20, 20),
	            new Ellipse2D.Double(920, 350, 20, 20),
	            new Ellipse2D.Double(920, 400, 20, 20),
	            new Ellipse2D.Double(920, 450, 20, 20),
	            new Ellipse2D.Double(920, 500, 20, 20),
	            new Ellipse2D.Double(750, 520, 20, 20),
	            new Ellipse2D.Double(800, 520, 20, 20),
	            new Ellipse2D.Double(850, 520, 20, 20),
	        };
		indiceLunetaComida = verificarComida();
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
	                contadorLunetas = 0;
	                indiceLunetaComida = verificarComida();
	                pantalla.repaint(); 
	            }
	        });
	        paneljuego.add(pantalla);
	    
	   
	        
	    JPanel reinicio = new JPanel();
	    reinicio.setPreferredSize(new Dimension(1000, 100)); 
	    reinicio.setLayout(null);
	    reinicio.setBackground(Color.gray);
	    paneljuego.add(reinicio);
	    //
	    contador = new JLabel("Lunetas comidas: " + contadorLunetas);
	    contador.setFont(new Font("Sunny Spells Basic", Font.BOLD, 20));
	    contador.setBounds(20, 20, 200, 50);
	    reinicio.add(contador);

	        
	    JButton btnReinicio = new JButton("Reinicio");
	    btnReinicio.setFont(new Font("Sunny Spells Basic", Font.BOLD, 35));
	    btnReinicio.setBounds(400, 20,200,50);
	    btnReinicio.setBackground(Color.decode("#4447E6"));
	    btnReinicio.setForeground(Color.decode("#FCFBFC"));
	    reinicio.add(btnReinicio);
	    btnReinicio.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	circleX = 60;
                circleY = 60;
                cir = new Ellipse2D.Double[] {
        	            new Ellipse2D.Double(75, 150, 20, 20),
        	            new Ellipse2D.Double(75, 200, 20, 20),
        	            new Ellipse2D.Double(75, 250, 20, 20),
        	            new Ellipse2D.Double(75, 300, 20, 20),
        	            new Ellipse2D.Double(75, 350, 20, 20),
        	            new Ellipse2D.Double(75, 400, 20, 20),
        	            new Ellipse2D.Double(75, 450, 20, 20),
        	            new Ellipse2D.Double(75, 450, 20, 20),
        	            new Ellipse2D.Double(75, 500, 20, 20),
        	            new Ellipse2D.Double(150, 520, 20, 20),
        	            new Ellipse2D.Double(200, 520, 20, 20),
        	            new Ellipse2D.Double(250, 520, 20, 20),
        	            new Ellipse2D.Double(300, 520, 20, 20),
        	            new Ellipse2D.Double(350, 520, 20, 20),
        	            new Ellipse2D.Double(400, 520, 20, 20),
        	            new Ellipse2D.Double(450, 520, 20, 20),
        	            new Ellipse2D.Double(500, 520, 20, 20),
        	            new Ellipse2D.Double(550, 520, 20, 20),
        	            new Ellipse2D.Double(600, 520, 20, 20),
        	            new Ellipse2D.Double(650, 520, 20, 20),
        	            new Ellipse2D.Double(150, 220, 20, 20),
        	            new Ellipse2D.Double(200, 220, 20, 20),
        	            new Ellipse2D.Double(250, 220, 20, 20),
        	            new Ellipse2D.Double(300, 220, 20, 20),
        	            new Ellipse2D.Double(350, 220, 20, 20),
        	            new Ellipse2D.Double(400, 220, 20, 20),
        	            new Ellipse2D.Double(450, 220, 20, 20),
        	            new Ellipse2D.Double(200, 70, 20, 20),
        	            new Ellipse2D.Double(250, 70, 20, 20),
        	            new Ellipse2D.Double(300, 70, 20, 20),
        	            new Ellipse2D.Double(350, 70, 20, 20),
        	            new Ellipse2D.Double(400, 70, 20, 20),
        	            new Ellipse2D.Double(450, 70, 20, 20),
        	            new Ellipse2D.Double(500, 70, 20, 20),
        	            new Ellipse2D.Double(550, 70, 20, 20),
        	            new Ellipse2D.Double(600, 70, 20, 20),
        	            new Ellipse2D.Double(650, 70, 20, 20),
        	            new Ellipse2D.Double(700, 70, 20, 20),
        	            new Ellipse2D.Double(750, 70, 20, 20),
        	            new Ellipse2D.Double(800, 70, 20, 20),
        	            new Ellipse2D.Double(850, 70, 20, 20),
        	            new Ellipse2D.Double(900, 70, 20, 20),
        	            new Ellipse2D.Double(920, 150, 20, 20),
        	            new Ellipse2D.Double(920, 200, 20, 20),
        	            new Ellipse2D.Double(920, 250, 20, 20),
        	            new Ellipse2D.Double(920, 300, 20, 20),
        	            new Ellipse2D.Double(920, 350, 20, 20),
        	            new Ellipse2D.Double(920, 400, 20, 20),
        	            new Ellipse2D.Double(920, 450, 20, 20),
        	            new Ellipse2D.Double(920, 500, 20, 20),
        	            new Ellipse2D.Double(750, 520, 20, 20),
        	            new Ellipse2D.Double(800, 520, 20, 20),
        	            new Ellipse2D.Double(850, 520, 20, 20),
        	        };
                comerLuneta();
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
		
		
		//paredes
		
		g2d.setColor(Color.decode("#0100FF"));
        for (Rectangle pared : paredes) {
            g2d.fill(pared);
        }
		
        
        g2d.setColor(Color.decode("#BA8C9C")); 

        
        
        
        for (int i = 0; i < cir.length; i++) {
            if (cir[i] != null && cir[i].intersects(circleX, circleY, 50, 50)) {
                cir[i] = null; 
                
            }
        }

       //dibja lun
        g2d.setColor(Color.decode("#BA8C9C"));
        for (Ellipse2D.Double circle : cir) {
            if (circle != null) {
                g2d.fill(circle);
            }
        }
        
       
       
    }
	
	boolean colisionMarcos(int x, int y) {
		
		Rectangle col = new Rectangle(x, y, 50, 50);
       
        if (x <= 20 || x >= 930 || y <= 20 || y >= 560) {
            return true;
        }
        
        for (Rectangle pared : paredes) {
            if (col.intersects(pared)) {
                return true;
            }
        }
        
        return false;
    }
	
	
	private int verificarComida() {
	    for (int i = 0; i < cir.length; i++) {
	        if (cir[i] != null && cir[i].contains(circleX + 25, circleY + 25)) {
	            return i; 
	        }
	    }
	    return -1;
	}




	void comerLuneta() {
		
        if (indiceLunetaComida != -1) {
            cir[indiceLunetaComida] = null; 
            // meter un contadr
            contadorLunetas++;
            
        }
       
        
    
        }

		
		
		
		
	

} 
