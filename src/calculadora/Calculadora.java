package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Calculadora extends JFrame{
	
	public Calculadora() {
		//this.setSize(515, 600);
		setTitle("Calculadora");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (200,200));
		setLayout(null);
		crear ();
		//crearCalculadora();
		
	}
	
	void crear () {
		JPanel panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#252428"));
		this.getContentPane().add(panel);
		
		JLabel pantalla = new JLabel(" 0");
		pantalla.setFont(new Font("Arial", Font.PLAIN, 35));
		pantalla.setBounds( 20, 30, 460, 100);
	
		pantalla.setBackground(Color.decode("#e6e6fa"));

		pantalla.setOpaque(true);
		panel.add(pantalla);
		
		 JButton boton1 = new JButton("C");
		 boton1.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton1.setBounds(20, 150, 50, 50);
		 boton1.setBackground(Color.decode("#5b0fa3"));
		 boton1.setOpaque(true);
		 boton1.setForeground(Color.decode("#cdb1e7"));
		 panel.add(boton1);
		    
		 JButton botonb = new JButton("<-");
		    
		 botonb.setBounds(75, 150, 45, 50);
		 botonb.setBackground(Color.decode("#837e8c"));
		 botonb.setOpaque(true);
		 panel.add(botonb);
		    
		 JButton boton2 = new JButton("()");
		 boton2.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton2.setBounds(140, 150, 100, 50);
		 boton2.setBackground(Color.decode("#837e8c"));
		 boton2.setOpaque(true);
		 panel.add(boton2);
		    
		 JButton boton3 = new JButton("%");
		 boton3.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton3.setBounds(260, 150, 100, 50);
		 boton3.setBackground(Color.decode("#837e8c"));
		 boton3.setOpaque(true);
		 panel.add(boton3);

		 JButton boton4 = new JButton("/");
		 boton4.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton4.setBounds(380, 150, 100, 50);
		 boton4.setBackground(Color.decode("#837e8c"));
		 boton4.setOpaque(true);
		 panel.add(boton4);

		 JButton boton5 = new JButton("7");
		 boton5.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton5.setBounds(20, 230, 100, 50);
		 boton5.setBackground(Color.decode("#837e8c"));
		 boton5.setOpaque(true);
		 panel.add(boton5);

		 JButton boton6 = new JButton("8");
		 boton6.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton6.setBounds(140, 230, 100, 50);
		 boton6.setBackground(Color.decode("#837e8c"));
		 boton6.setOpaque(true);
		 panel.add(boton6);

		 JButton boton7 = new JButton("9");
		 boton7.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton7.setBounds(260, 230, 100, 50);
		 boton7.setBackground(Color.decode("#837e8c"));
		 boton7.setOpaque(true);
		 panel.add(boton7);

		 JButton boton8 = new JButton("x");
		 boton8.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton8.setBounds(380, 230, 100, 50);
		 boton8.setBackground(Color.decode("#837e8c"));
		 boton8.setOpaque(true);
		 panel.add(boton8);

		 JButton boton9 = new JButton("4");
		 boton9.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton9.setBounds(20, 310, 100, 50);
		 boton9.setBackground(Color.decode("#837e8c"));
		 boton9.setOpaque(true);
		 panel.add(boton9);

		 JButton boton10 = new JButton("5");
		 boton10.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton10.setBounds(140, 310, 100, 50);
		 boton10.setBackground(Color.decode("#837e8c"));
		 boton10.setOpaque(true);
		 panel.add(boton10);

		 JButton boton11 = new JButton("6");
		 boton11.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton11.setBounds(260, 310, 100, 50);
		 boton11.setBackground(Color.decode("#837e8c"));
		 boton11.setOpaque(true);
		 panel.add(boton11);

		 JButton boton12 = new JButton("-");
		 boton12.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton12.setBounds(380, 310, 100, 50);
		 boton12.setBackground(Color.decode("#837e8c"));
		 boton12.setOpaque(true);
		 panel.add(boton12);

		 JButton boton13 = new JButton("1");
		 boton13.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton13.setBounds(20, 390, 100, 50);
		 boton13.setBackground(Color.decode("#837e8c"));
		 boton13.setOpaque(true);
		 panel.add(boton13);

		 JButton boton14 = new JButton("2");
		 boton14.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton14.setBounds(140, 390, 100, 50);
		 boton14.setBackground(Color.decode("#837e8c"));
		 boton14.setOpaque(true);
		 panel.add(boton14);

		 JButton boton15 = new JButton("3");
		 boton15.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton15.setBounds(260, 390, 100, 50);
		 boton15.setBackground(Color.decode("#837e8c"));
		 boton15.setOpaque(true);
		 panel.add(boton15);

		 JButton boton16 = new JButton("+");
		 boton16.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton16.setBounds(380, 390, 100, 50);
		 boton16.setBackground(Color.decode("#837e8c"));
		 boton16.setOpaque(true);
		 panel.add(boton16);

		 JButton boton17 = new JButton("^");
		 boton17.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton17.setBounds(20, 470, 100, 50);
		 boton17.setBackground(Color.decode("#837e8c"));
		 boton17.setOpaque(true);
		 panel.add(boton17);

		 JButton boton18 = new JButton("0");
		 boton18.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton18.setBounds(140, 470, 100, 50);
		 boton18.setBackground(Color.decode("#837e8c"));
		 boton18.setOpaque(true);
		 panel.add(boton18);

		 JButton boton19 = new JButton(".");
		 boton19.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton19.setBounds(260, 470, 100, 50);
		 boton19.setBackground(Color.decode("#837e8c"));
		 boton19.setOpaque(true);
		 panel.add(boton19);
		    
		    

		 JButton boton20 = new JButton("=");
		 boton20.setFont(new Font("Arial", Font.PLAIN, 20));
		 boton20.setBounds(380, 470, 100, 50);
		 boton20.setBackground(Color.decode("#5b0fa3"));
		 boton20.setOpaque(true);
		 boton20.setForeground(Color.decode("#cdb1e7"));
		 panel.add(boton20);
		
		JMenuBar barra = new JMenuBar();
		JMenu lista1 = new JMenu("Herramientas");
		
		JMenuItem opcion1 = new JMenuItem("Historial");
		JMenuItem opcion2 = new JMenuItem("Ayuda");
		
		barra.add(lista1);
		lista1.add(opcion1);
		lista1.add(opcion2);
		
		this.setJMenuBar(barra);
		this.add(panel);
	}
	void crearCalculadora() {
		
		this.setSize(500, 650);
		
		JPanel calculadora = new JPanel();
		calculadora.setSize(this.getWidth(),this.getHeight());
		calculadora.setLocation(0,0);
		calculadora.setLayout(new BorderLayout());
		calculadora.setBackground(Color.black);
		this.add(calculadora);

		JLabel input = new JLabel("20.00",4); 
		input.setOpaque(true); 
		input.setBackground(Color.white); 
		input.setFont(new Font("SignPainter", Font.BOLD, 40)); 
		calculadora.add(input, BorderLayout.NORTH);

		JPanel botones = new JPanel(); 
		botones.setLayout(new GridLayout(4,3)); 
		botones.setBackground(Color.red); 
		calculadora.add(botones, BorderLayout.CENTER );

		String btn_texts[]= {"9","8", "7","6","5","4","3","2","1","0","."};
		for(int i = 0; i< btn_texts.length; i++) {
			botones.add(new JButton(btn_texts[i]));
			
		
		}
		
		JPanel acciones = new JPanel();
		acciones.setLayout(new GridLayout(6,1)); 
		acciones.setBackground(Color.green); 
		calculadora.add(acciones, BorderLayout.EAST);

		String actions_texts[]= {"+","-","*","/","=", "CE"};
		for(int i = 0; i< actions_texts.length; i++) {
			acciones.add(new JButton(actions_texts[i]));
			
			
		}

		
		
			
		
		
	}


}

