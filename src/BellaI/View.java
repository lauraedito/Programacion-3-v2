package BellaI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
	
	 private JTextField usernameField;
	 private JPasswordField passwordField;
	 private JButton loginButton;
	 
	 public View() {
	        setTitle("Login");
	        setSize(300, 150);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        JPanel panel = new JPanel();
	        usernameField = new JTextField(15);
	        passwordField = new JPasswordField(15);
	        loginButton = new JButton("Login");

	        panel.add(new JLabel("Username:"));
	        panel.add(usernameField);
	        panel.add(new JLabel("Password:"));
	        panel.add(passwordField);
	        panel.add(loginButton);

	        add(panel);
	    }

	    public String getUsername() {
	        return usernameField.getText();
	    }

	    public String getPassword() {
	        return new String(passwordField.getPassword());
	    }

	    public void addLoginListener(ActionListener listener) {
	        loginButton.addActionListener(listener);
	    }

	    public void displayErrorMessage(String errorMessage) {
	        JOptionPane.showMessageDialog(this, errorMessage, "Login Error", JOptionPane.ERROR_MESSAGE);
	    }



}
