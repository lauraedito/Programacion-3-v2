package Memorama2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 

public class Memorama_2 extends JFrame {
	private List<String> letras = new ArrayList<>();
    private JButton primerBotonSeleccionado;
    private JButton segundoBotonSeleccionado;
    private Timer timer;
    private JPanel buttonPanel;
    private int contadorPartidas = 0;
    private JLabel etiquetaContador;
    
	public Memorama_2() {
		this.setSize(700, 700);
		setTitle("Memorama");
		crear ();
	}
	
	void crear () {
		letras.add("A");
        letras.add("A");
        letras.add("B");
        letras.add("B");
        letras.add("C");
        letras.add("C");
        letras.add("D");
        letras.add("D");
        
        Collections.shuffle(letras);

		JPanel panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLocation(0,0);
		panel.setBackground(Color.gray);
		add(panel);
		
		
		panel.setLayout(new BorderLayout()); 
	    JButton buttonReiniciar = new JButton("Reiniciar");
	    buttonReiniciar.setBackground(Color.decode("#EAA1FC"));
	    buttonReiniciar.setPreferredSize(new Dimension(200, 50));
	    Font fuente = new Font("Arial", Font.BOLD, 30);
	    buttonReiniciar.setFont(fuente);
	    buttonReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });
        panel.add(buttonReiniciar, BorderLayout.NORTH);

        JPanel panelSur = new JPanel(new GridLayout(1, 1));
        panel.add(panelSur, BorderLayout.SOUTH);
        etiquetaContador = new JLabel("Partidas: " + contadorPartidas);
        etiquetaContador.setHorizontalAlignment(JLabel.CENTER);
        panelSur.add(etiquetaContador);
        
	    
		
		
		buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 4));
       
        for (int i = 0; i < letras.size(); i++) {
            JButton button = new JButton("");
            Font fuente2 = new Font("Arial", Font.BOLD, 50);
            button.setFont(fuente2);
            button.setBackground(Color.decode("#F3D4FA"));
            button.setPreferredSize(new Dimension(150, 150));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //manejarClicBoton((JButton) e.getSource());
                	manejarClicBoton(button);
                }
            });
            buttonPanel.add(button);
           // button.setText(letras.get(i));
        }

        panel.add(buttonPanel, BorderLayout.CENTER);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ocultarLetras();
            }
        });
        
     	
	}
	
	
	int parejasEncontradas = 0;
	private void manejarClicBoton(JButton button) {
        if (primerBotonSeleccionado == null) {
            primerBotonSeleccionado = button;
            mostrarLetra(button);
        	} else if (segundoBotonSeleccionado == null && button != primerBotonSeleccionado) {
            segundoBotonSeleccionado = button;
            mostrarLetra(button);

            
            if (primerBotonSeleccionado.getText().equals(segundoBotonSeleccionado.getText())) {
                primerBotonSeleccionado.setEnabled(false);
                segundoBotonSeleccionado.setEnabled(false);
                primerBotonSeleccionado = null;
                segundoBotonSeleccionado = null;
                parejasEncontradas++;
                if (parejasEncontradas == 4) {
                    JOptionPane.showMessageDialog(this,"Ganaste!!!!");
                    reiniciarJuego();
                }
                
            } else {
                timer.start();
            }
        }
    }

    private void mostrarLetra(JButton button) {
    	button.setText(letras.get(buttonPanel.getComponentZOrder(button)));
    }

    private void ocultarLetras() {
        primerBotonSeleccionado.setText("");
        segundoBotonSeleccionado.setText("");
        primerBotonSeleccionado = null;
        segundoBotonSeleccionado = null;
        timer.stop();
    }

    private void reiniciarJuego() {
    	contadorPartidas++;

        Collections.shuffle(letras);
        primerBotonSeleccionado = null;
        segundoBotonSeleccionado = null;
        for (Component component : buttonPanel.getComponents()) {
            JButton button = (JButton) component;
            button.setText("");
            button.setEnabled(true);
        }
        etiquetaContador.setText("Partidas: " + contadorPartidas);

    }
		
		
}
