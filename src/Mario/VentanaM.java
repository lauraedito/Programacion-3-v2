package Mario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaM extends JFrame{
	
	public VentanaM() {
		this.setSize(800, 700);
		setTitle("Ingresar");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (200,200));
		setLayout(null);
		dibujoPanel();
		
	}
	
	void dibujoPanel () {
		JPanel panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#0665C0"));
		this.getContentPane().add(panel);
	}
	
	public void paint(Graphics g){
		super. paint(g);
		Graphics2D g2d =(Graphics2D) g;
		// dibujos
		
		//piso cafe
		g2d.setColor(Color.decode("#CF9E5F"));
		g2d.fillRect(0, 605, 800, 90);
		//piso verde
		g2d.setColor(Color.decode("#0FC714"));
		g2d.fillRect(0, 585, 800, 20);
		
		
		//nubesrtr
	  	g2d.setColor(Color.decode("#EDF2FE"));
	  	g2d.fillRoundRect(130, 463,200,40,40,40);
		//circulo iz 
		g2d.setColor(Color.decode("#C6E3E7"));
	    g2d.fillOval(0, 230, 150, 150);
	    //cuerpo del circulo
	    g2d.setColor(Color.decode("#C6E3E7"));
	  	g2d.fillRect(0, 300, 150, 286);
	    
	  	//nube
	  	g2d.setColor(Color.decode("#EDF2FE"));
	  	g2d.fillRoundRect(530, 300,200,40,40,40);
	  	
	    //nube
	  	g2d.setColor(Color.decode("#EDF2FE"));
	  	g2d.fillRoundRect(630, 257,130,40,40,40);
	  	
	    //nubegb
	  	g2d.setColor(Color.decode("#EDF2FE"));
	  	g2d.fillRoundRect(200, 420,200,40,40,40);
	    //circulo centro 
	  	g2d.setColor(Color.decode("#C6E3E7"));
	  	g2d.fillOval(330, 230, 150, 150);
	  	//cuerpo del circulo
	  	g2d.setColor(Color.decode("#C6E3E7"));
	  	g2d.fillRect(330, 300, 150, 286);
	   
	  	
	  	
	    //circulo drcha
	  	g2d.setColor(Color.decode("#C6E3E7"));
	  	g2d.fillOval(480, 160, 150, 150);
	  	//cuerpo del circulo
	  	g2d.setColor(Color.decode("#C6E3E7"));
	  	g2d.fillRect(480, 244, 150, 342);
	  	
	  	g2d.setColor(Color.decode("#EDF2FE"));
	  	g2d.fillRoundRect(-20, 300,140,40,40,40);
	  	
	    //nube
	  	g2d.setColor(Color.decode("#EDF2FE"));
	  	g2d.fillRoundRect(450, 420,220,40,40,40);
	  	
	    //circulo drcha azul os
	  	g2d.setColor(Color.decode("#77B3D8"));
	  	g2d.fillOval(530, 350, 200, 200);
	  	//cuerpo
	  	g2d.fillRect(530, 462, 200, 125);
	  	
	    //circulo centro azul os
	  	g2d.setColor(Color.decode("#77B3D8"));
	  	g2d.fillArc(330, 460, 200, 200, 0, 180);
	  	//cuerpo
	  	g2d.fillRect(331, 541, 200, 45);
	  	//nube
	  	g2d.setColor(Color.decode("#EDF2FE"));
	  	g2d.fillRoundRect(150, 350,220,40,40,40);
	  	
	  	g2d.setColor(Color.decode("#77B3D8"));
	  	//medio circulo
	  	g2d.fillArc(-100, 460, 200, 200, 0, 180);
	  	//cuerpo
	  	g2d.fillRect(0, 541, 100, 45);
		
	  	//tuboazul
	  	g2d.setColor(Color.black);
	  	g2d.fillRect(380, 496, 98, 90);
	  	
	  	g2d.setColor(Color.decode("#4E4B97"));
	  	g2d.fillRect(383, 496, 89, 86);
	  	
	  	//rayitas
	  	g2d.setColor(Color.decode("#6E69B1"));
	  	g2d.fillRect(389, 496, 10, 86);
	  	
	  	g2d.setColor(Color.decode("#EDF7F9"));
	  	g2d.fillRect(400, 496, 15, 86);
	  	
	  	g2d.setColor(Color.decode("#8884D3"));
	  	g2d.fillRect(415, 496, 16, 86);
	  	
	  	g2d.setColor(Color.decode("#6F6CB6"));
	  	g2d.fillRect(432, 496, 12, 86);
	  	
	  	g2d.setColor(Color.decode("#6F6CB6"));
	    g2d.fillRect(455, 496,2, 86);
	    // tapa tubo
	    g2d.setColor(Color.black);
	  	g2d.fillRect(374, 450, 110, 52);
	  	
	  	g2d.setColor(Color.decode("#4E4B97"));
	  	g2d.fillRect(376, 453, 106, 46);
	  	//rayas tapa
	  	g2d.setColor(Color.decode("#6E69B1"));
	  	g2d.fillRect(387, 453, 10, 46);
	  	
	  	g2d.setColor(Color.decode("#EDF7F9"));
	  	g2d.fillRect(398, 453, 15, 46);
	  	
	  	g2d.setColor(Color.decode("#8884D3"));
	  	g2d.fillRect(413, 453, 16, 46);
	  	
	  	g2d.setColor(Color.decode("#6F6CB6"));
	  	g2d.fillRect(429, 453, 12,46);
	  	
	  	g2d.setColor(Color.decode("#6F6CB6"));
	    g2d.fillRect(453, 453,2,46);
	  	
	    //circulo/lunas
	    g2d.setColor(Color.decode("#EEF5FF"));
	    g2d.fillOval(100, 253, 20, 35);
	    
	    g2d.setColor(Color.decode("#EEF5FF"));
	    g2d.fillOval(100, 393, 20, 35);
	    
	    g2d.setColor(Color.decode("#EEF5FF"));
	    g2d.fillOval(40, 428, 20, 35);
		
	    g2d.setColor(Color.decode("#EEF5FF"));
	    g2d.fillOval(400, 263, 20, 35);
	    
	    g2d.setColor(Color.decode("#EEF5FF"));
	    g2d.fillOval(370, 298, 20, 35);
	    
	    g2d.setColor(Color.decode("#EEF5FF"));
	    g2d.fillOval(370, 390, 20, 35);
	}

}
