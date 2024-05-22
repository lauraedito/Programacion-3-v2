package BellaI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controller implements ActionListener  {
	
	 

	 @Override
     public void actionPerformed(ActionEvent e) {
         String correo = view.getUsername(); 
         String contraseña = view.getPassword(); 

        
         if (model.autenticarUsuario(correo, contraseña)) { 
             JOptionPane.showMessageDialog(view, "¡Inicio de sesión exitoso!");
         } else {
             view.displayErrorMessage("Correo o contraseña inválidos.");
         }
     }
}
