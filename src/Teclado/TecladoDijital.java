package Teclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Random;

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
		panel.setBackground(Color.decode("#F5F1FB"));
		add(panel);
		
		JPanel pantalla = new JPanel();
		pantalla.setBounds(10, 10, 980,200);
		pantalla.setLayout(null);
		pantalla.setBackground(Color.decode("#E9DCFD"));
		panel.add(pantalla, BorderLayout.NORTH);
		
		JTextField cajateclado = new JTextField();
		cajateclado.setBounds(10, 10, 560, 60);
		pantalla.add(cajateclado);
		
		JLabel timer = new JLabel("Tiempo",0);
		timer.setBounds(580, 10, 390, 50);
		timer.setFont(new Font("Sunny Spells Basic", Font.BOLD, 35));
		pantalla.add(timer);
		 
		//LABEL PA Q APARESCAN LAS PALABRAS
		JLabel palabrasE = new JLabel();
        palabrasE.setBounds(10, 80, 560, 100); 
        palabrasE.setHorizontalAlignment(JLabel.CENTER); 
        palabrasE.setBorder(new LineBorder(Color.decode("#6D0FFF"),4));
        pantalla.add(palabrasE);
        
        Random rand = new Random();
        String[] listaPalabras = {"gato", "perro", "casa", "árbol", "pelota", "computadora", "silla", "mesa", "sol", "luna",
        		"estrella", "montaña", "río", "mar", "cielo", "nube", "flor", "libro", "teléfono", "lápiz", "pluma", "papel",
        		"televisión", "cama", "reloj", "taza", "cuchara", "tenedor", "cuchillo", "zapato", "calcetín", "camisa", "pantalón",
        		"sombrero", "chaqueta", "coche", "bicicleta", "avión", "barco", "tren", "helicóptero", "helado", "pastel", "pizza", 
        		"hamburguesa", "sandía", "manzana", "naranja", "uva", "limón", "fresa", "plátano", "kiwi", "melón", "papaya", 
        		"pera", "piña", "cereza", "ciruela", "durazno", "mango", "cocodrilo", "elefante", "jirafa", "leon", "tigre", "oso",
        		"conejo", "ratón", "ardilla", "gallina", "pato", "cerdo", "vaca", "caballo", "oveja", "mono", "gorila", "gorrión", 
        		"colibrí", "águila", "búho", "león", "delfín", "ballena", "tiburón", "pez", "pulpo", "calamar", "langosta", "cangrejo", 
        		"caracol", "mariposa", "abeja", "araña", "mosquito"};

        int mostar = rand.nextInt(listaPalabras.length); 
        palabrasE.setText(listaPalabras[mostar]); 
        palabrasE.setFont(new Font("Sunny Spells Basic", Font.BOLD, 35));

		JPanel teclado = new JPanel();
		teclado.setBounds(10, 220,980,430);
		teclado.setLayout(null);
		teclado.setBackground(Color.decode("#E9DCFD"));
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
           label.setBorder(new LineBorder(Color.decode("#6D0FFF"),4));
            label.setBounds(x, y, ancho, alto);
            teclado.add(label);
            
            
            x += ancho + espacio;
            if (x + ancho + espacio > teclado.getWidth()) {
                x = 20;
                y += alto + espacio;
            }
        
	}
      //boton para tenrminar / entregra la palabra 
        JLabel teclaEspacio = new JLabel("Espacio",0);
        teclaEspacio.setFont(new Font("Sunny Spells Basic", Font.BOLD, 39));
        teclaEspacio.setForeground(Color.black);
        teclaEspacio.setBorder(new LineBorder(Color.decode("#6D0FFF"),4));
        teclaEspacio.setBounds(250, 350, 200, 70);
        teclado.add(teclaEspacio);
        
        JLabel teclaBorrar = new JLabel("Borrar",0);
        teclaBorrar.setFont(new Font("Sunny Spells Basic", Font.BOLD, 39));
        teclaBorrar.setForeground(Color.black);
        teclaBorrar.setBorder(new LineBorder(Color.decode("#6D0FFF"),4));
        teclaBorrar.setBounds(500, 350, 200, 70);
        teclado.add(teclaBorrar);
        
	}
	
	

}
