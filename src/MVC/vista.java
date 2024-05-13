package MVC;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class vista extends JFrame {
	private JPanel loginPanel;
    private JTextField usuariotxt;
    private JPasswordField cajacontrasenia;
    private JButton btn;
    

	
	
	public vista() {
        setTitle("Login");
        
        setSize(400, 400);
        setLocationRelativeTo(null);

        loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBackground(Color.decode("#EBD9FF"));

        JLabel usuario = new JLabel("Usuario");
        usuario.setBounds(170, 70, 80, 20);
        loginPanel.add(usuario);
        
        usuariotxt = new JTextField();
        usuariotxt.setBounds(125, 100, 150, 20);
        loginPanel.add(usuariotxt);

        JLabel contrasenia = new JLabel("contraseña");
        contrasenia.setBounds(160, 140, 80, 20);
        loginPanel.add(contrasenia);

        cajacontrasenia = new JPasswordField();
        cajacontrasenia.setBounds(125, 180, 150, 20);
        loginPanel.add(cajacontrasenia);

        btn = new JButton("Entrar");
        btn.setBounds(155, 240, 80, 20);
        loginPanel.add(btn);

        getContentPane().add(loginPanel);
        
        
 
        
    }

    public String getUsername() {
        return usuariotxt.getText();
    }

    public String getPassword() {
        return new String(cajacontrasenia.getPassword());
    }

    public void setLoginListener(ActionListener listener) {
    	btn.addActionListener(listener);
    
	}
    
    
    public void iniciarHolaPanel() {
        JPanel holaPanel = new JPanel();
        holaPanel.setLayout(null);
        holaPanel.setBackground(Color.WHITE);
        
        JLabel etiqueta = new JLabel("¡Hola!");
        etiqueta.setBounds(160, 100, 80, 20);
        getContentPane().add(holaPanel);
        holaPanel.setVisible(true);
    }
    
    
    
    


}
