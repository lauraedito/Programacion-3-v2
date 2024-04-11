package Teclado;

import javax.swing.SwingUtilities;


public class main {

	public static void main(String[] args) {
		//TecladoDijital ventana = new TecladoDijital();
		//ventana.setVisible(true);
		 SwingUtilities.invokeLater(() -> {
	            new TecladoDijital().setVisible(true);
	        });

	}

}
