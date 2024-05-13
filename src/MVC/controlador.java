package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class controlador {
	  private vista view;
	  
	  public controlador (vista view) {
	        this.view = view;
	        this.view.setLoginListener(new LoginListener());
	  }

	  class LoginListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String usuario = view.getUsername();
	            String contrasenia = view.getPassword();

	            
	            if (model.validar(usuario, contrasenia)) {
	                view.iniciarHolaPanel();
	                System.out.println("bien");
	            } else {
	                System.out.println("mal");
	                
	            }
	        }
	    }
	
	  public static void main(String[] args) {
	        vista view = new vista();
	        controlador controller = new controlador(view);
	        view.setVisible(true);
	    }

	    
	    
	    
	    

}








