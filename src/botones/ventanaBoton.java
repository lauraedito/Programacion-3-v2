package botones;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ventanaBoton extends JFrame{
	
	Random rand = new Random();
	
	public ventanaBoton() {
		this.setSize(700, 700);
		setTitle("Botones");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (200,200));
		setLayout(null);
		panelBoton ();
		
	}
	
	void panelBoton () {
		JPanel panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#EBE5FD"));
		this.getContentPane().add(panel);
		
		JButton boton = new JButton("Presioname");
        boton.setBounds(270, 300, 200, 50); 
        boton.setBackground(Color.decode("#562774"));
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Oswald", Font.BOLD, 20));
        panel.add(boton);
        
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	agregarBoton(panel);
                 
            }
        });
        
        
    
        
	}
	
	private void agregarBoton(JPanel panel) {
	    
	    int ancho = rand.nextInt(151) + 50; 
	    int alto = rand.nextInt(51) + 50;  


	    JButton boton2 = new JButton("Hola");
	    boton2.setFont(new Font("Oswald", Font.BOLD, 20));
	    boton2.setSize(ancho, alto);

	    String[] colores = {"#1443DA", "#A314DA", "#F473EB", "#4CE7E2", "#E74C6D"};
	    int indiceColor = rand.nextInt(colores.length); 
        Color colorAleatorio = Color.decode(colores[indiceColor]); 
	    boton2.setBackground(colorAleatorio);
	    


	   
	    
	    int x = rand.nextInt(panel.getWidth() - ancho); 
	    int y = rand.nextInt(panel.getHeight() - alto); 
	    boton2.setBounds(x, y, ancho, alto);

	    //
	    boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, boton2.getText());
            	Color botonColor = boton2.getBackground();
            	
            	String colorHexadecimal = String.format("#%02x%02x%02x", botonColor.getRed(), botonColor.getGreen(), botonColor.getBlue());
            	boton2.setText(colorHexadecimal);
            	JOptionPane.showMessageDialog(null, colorHexadecimal);
            }
        });
	    //
	    
	    
	    
	    panel.add(boton2);
	    panel.revalidate(); 
	    panel.repaint();
	}

	
	

}
