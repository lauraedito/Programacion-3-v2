package ventanaMouse;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaM extends JFrame implements MouseListener {
	
	Random rand = new Random();
	private JPanel panel;
	private String[] colores = {"#1443DA", "#A314DA", "#F473EB", "#4CE7E2", "#E74C6D"};
	
	public VentanaM() {
		this.setSize(700, 700);
		setTitle("Botones Mouse");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (200,200));
		setLayout(null);
		panelMouse ();
		
	}

	void panelMouse () {
		panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#DFC5F1"));
		panel.addMouseListener(this);
		//this.getContentPane().add(panel);
		add(panel);
		
		        
     
       
	}
	private void agregarBoton(MouseEvent e) {
	    
	    int ancho = rand.nextInt(151) + 50; 
	    int alto = rand.nextInt(51) + 50;  


	    JButton boton2 = new JButton("");
	    boton2.setFont(new Font("Oswald", Font.BOLD, 20));
	    boton2.setSize(ancho, alto);

	    String[] colores = {"#1443DA", "#A314DA", "#F473EB", "#4CE7E2", "#E74C6D"};
	    int indiceColor = rand.nextInt(colores.length); 
        Color colorAleatorio = Color.decode(colores[indiceColor]); 
	    boton2.setBackground(colorAleatorio);
	    


	   //aquì
	    
	    int x = e.getX(); //  int x = rand.nextInt(700); 
	    int y = e.getY(); //int y = rand.nextInt(700); 
	    boton2.setBounds(x, y, ancho, alto);

	    
	    boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	Color botonColor = boton2.getBackground();
            	
            	String colorHexadecimal = String.format("#%02x%02x%02x", botonColor.getRed(), botonColor.getGreen(), botonColor.getBlue());
            	boton2.setText(colorHexadecimal);
            	//JOptionPane.showMessageDialog(null, colorHexadecimal);
            	
            	panel.remove(boton2); 
            	
                panel.revalidate();
                panel.repaint();
                
            }
        });
	    
	    
	    
	    
	    panel.add(boton2);
	    //panel.remove(boton2);
	    panel.revalidate(); 
	    panel.repaint();
	     
	}
	
	
	
	@Override
    public void mouseClicked(MouseEvent e) {
		
		agregarBoton( e);
		
        
    }

	    
	    @Override
	    public void mousePressed(MouseEvent e) {}

	    @Override
	    public void mouseReleased(MouseEvent e) {}

	    @Override
	    public void mouseEntered(MouseEvent e) {}

	    @Override
	    public void mouseExited(MouseEvent e) {
	    	 int indiceColor = rand.nextInt(colores.length);
	    	 Color colorAleatorio = Color.decode(colores[indiceColor]);
	    	 panel.setBackground(colorAleatorio);
	    	 
	    	 panel.revalidate(); 
	 	     panel.repaint();
	    }
	
	
	
}
