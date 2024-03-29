package Juego;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Timer;




public class Memorama extends JFrame {
	
	private  ArrayList<JButton> botones;
    private JButton botonAnterior;
    private int parejasEncontradas;
    Timer timer; 
    JPanel panel;
    
    
		
	public Memorama() {
		this.setSize(700, 700);
		setTitle("Memorama");
		panelM ();
		agregarBotonReinicio();
		
    }
	
	void panelM () {
		panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#DFC5F1"));
		add(panel);
		
		panel.setLayout(new GridLayout(2, 4));
		botones = new ArrayList<>();

		ArrayList<Character> parejas = new ArrayList<>();
	       for (char letra = 'A'; letra <= 'D'; letra++) {
	           parejas.add(letra);
	           parejas.add(letra);
	       }
	       Collections.shuffle(parejas);

	    
	       
	       
	    for (char letra : parejas) {
	        JButton boton = new JButton("");
	        boton.setBackground(Color.PINK);
	        boton.setText(String.valueOf(letra));
	         boton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                botonSeleccionado(boton);
	                
	            }
	        });
	        botones.add(boton);
	        panel.add(boton);
	    }
	 
	   }
	 
	private void botonSeleccionado(JButton boton) {
		
		
		
	    if (botonAnterior == null) {
	        botonAnterior = boton;
	        boton.setEnabled(false);
	        boton.setText(String.valueOf(boton.getText())); 
	    } else {
	        boton.setEnabled(false);
	        boton.setText(String.valueOf(boton.getText())); 
	        if (boton.getText().equals(botonAnterior.getText())) {
	            parejasEncontradas++;
	            if (parejasEncontradas == 4) {
	                JOptionPane.showMessageDialog(this, "¡Ganaste!");
	                reiniciarJuego();
	            }
	            botonAnterior = null; 
	        } else {
	            Timer timer = new Timer(1000, new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    boton.setEnabled(true);
	                    botonAnterior.setEnabled(true);
	                    boton.setText(""); 
	                    botonAnterior.setText("");
	                    botonAnterior = null;
	                }
	            });
	            timer.setRepeats(false);
	            timer.start();
	        }
	    }
	}
	private void agregarBotonReinicio() {
        JButton reiniciarButton = new JButton("Reiniciar");
        reiniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });
        add(reiniciarButton, BorderLayout.NORTH);
    }

    private void reiniciarJuego() {
    	parejasEncontradas = 0;
        ArrayList<Character> parejas = new ArrayList<>();
        for (char letra = 'A'; letra <= 'D'; letra++) {
            parejas.add(letra);
            parejas.add(letra);
        }
        Collections.shuffle(parejas);

        for (int i = 0; i < botones.size(); i++) {
            JButton boton = botones.get(i);
            boton.setEnabled(true);
            boton.setText(String.valueOf(parejas.get(i))); 
        }
    }

    
    

	
	   
	    
	    
	
       
	
}
    
    
    
