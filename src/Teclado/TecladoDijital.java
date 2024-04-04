package Teclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TecladoDijital extends JFrame{
	
	public TecladoDijital() {
		this.setSize(1000, 700);
		setTitle("Teclado");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null);
		
		crear();
	}
	
	void crear () {
		JPanel panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLayout(null);
		panel.setBackground(Color.lightGray);
		add(panel);
		
		JPanel pantalla = new JPanel();
		pantalla.setBounds(10, 10, 980,250);
		pantalla.setLayout(null);
		pantalla.setBackground(Color.white);
		add(pantalla);
		panel.add(pantalla, BorderLayout.NORTH);
		
		
		
		JTextField cajateclado = new JTextField();
		cajateclado.setBounds(10, 10, 760, 60);
		pantalla.add(cajateclado);
		 
		
		
		
		//timer 
		//palabras que va a escribir
		
		
		
		JPanel teclado = new JPanel();
		teclado.setBounds(10, 270,980,360);
		teclado.setLayout(null);
		teclado.setBackground(Color.white);
		add(teclado);
		panel.add(teclado, BorderLayout.SOUTH);
		
		
        String[] qwerty = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P",
                                  "A", "S", "D", "F", "G", "H", "J", "K", "L","ñ",
                                   "Z", "X", "C", "V", "B", "N", "M"};
        int x = 20; 
        int y = 20; 
        int ancho = 90; 
        int alto = 90; 
        int espacio = 15; 
        
        for (String letras : qwerty) {
            JLabel label = new JLabel(letras,0);
            label.setFont(new Font("Sunny Spells Basic", Font.BOLD, 35));
            label.setForeground(Color.black);
            label.setBorder(new LineBorder(Color.pink,4));
            label.setBounds(x, y, ancho, alto);
            teclado.add(label);
            
            
            x += ancho + espacio;
            if (x + ancho + espacio > teclado.getWidth()) {
                x = 20;
                y += alto + espacio;
            }
        

		 
		
		
	}
        
	}
	
	

}
