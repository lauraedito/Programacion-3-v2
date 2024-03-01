//Laura Edith Osorio Maldonado

package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;



public class Ventana extends JFrame{
	public Ventana() {
		this.setSize(1000, 700);
		setTitle("Ingresar");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (200,200));
		setLayout(null);
		//crear();
		//crearPanel2();
		crearPanel3();
	}
	
	void crear () {
		JPanel panel = new JPanel();
		
		panel.setSize(this.getWidth()/2,this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.pink);
		this.getContentPane().add(panel);
		
		
		JLabel etiqueta = new JLabel("BIENVENIDO");
		etiqueta.setBounds(230, 10, this.getWidth(), 30);
		/*etiqueta.setFont(new Font("Agency FB", Font.BOLD,20));
		etiqueta.setBackground(Color.white);
		etiqueta.setLocation(150,10);
		etiqueta.setSize(220,40);
		etiqueta.setOpaque(true);
		*/
		
		panel.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel("Ingrese su usuario: ", SwingConstants.CENTER);
		etiqueta2.setBounds(10, 55, 120, 30);
		etiqueta2.setOpaque(true);
		etiqueta2.setBackground(Color.white);
		panel.add(etiqueta2);
		
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(10, 100, 170, 35);
		panel.add(cajaTexto);
		
		
		JLabel etiqueta3 = new JLabel("Contraseña: ", SwingConstants.CENTER);
		etiqueta3.setBounds(10, 155, 90, 30);
		etiqueta3.setOpaque(true);
		etiqueta3.setBackground(Color.white);
		panel.add(etiqueta3);
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(10, 200, 170, 35);
		panel.add(contrasena);
		
		JButton boton = new JButton("Acceder");
		boton.setBounds(10, 250, 120, 30);
		panel.add(boton);
		
		//////
		JPanel registro = new JPanel();
		
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(this.getWidth()/2,0);
		registro.setLayout(null);
		registro.setBackground(Color.lightGray);
		//this.getContentPane().add(registro);
		this.add(registro);
		//this.repaint();
		
		JLabel etiquetaR = new JLabel("REGISTRO", SwingConstants.CENTER);
		etiquetaR.setBounds(0, 10, registro.getWidth(),30);
		registro.add(etiquetaR);
		
		JLabel nombre = new JLabel("Nombre completo: ", SwingConstants.CENTER);
		nombre.setBounds(10, 55, 120, 30);
		nombre.setOpaque(true);
		nombre.setBackground(Color.white);
		registro.add(nombre);
		
		JTextField cajaNombre = new JTextField();
		cajaNombre.setBounds(10, 100, 300, 35);
		registro.add(cajaNombre);
		
		
		JCheckBox gusto1 = new JCheckBox ("estudiante");
		gusto1.setBounds(10, 150, 300, 35);
		registro.add(gusto1);
		
		JCheckBox gusto2 = new JCheckBox ("con empleo");
		gusto2.setBounds(10, 195, 300, 35);
		registro.add(gusto2);
		
		JRadioButton type = new JRadioButton("mujer");
		type.setBounds(10, 240, 300, 35);
		registro.add(type);
		
		JRadioButton type1 = new JRadioButton("hombre");
		type1.setBounds(10, 285, 300, 35);
		registro.add(type1);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(type);
		grupo.add(type1);
		//
		JLabel elejirLabel = new JLabel("Escriba sobre usted :");
		elejirLabel.setBounds(10, 330, 300,30);
		registro.add(elejirLabel);
		
		JTextArea tex = new JTextArea(10,10);
		tex.setBounds(10,360,350,100); 
		registro.add(tex);
		
		//
		JLabel etiquetaColonias = new JLabel("Elija su colonia: ");
		etiquetaColonias.setBounds(10, 460, 350, 30);
		etiquetaColonias.setOpaque(false);
		etiquetaColonias.setBackground(Color.white);
		registro.add(etiquetaColonias);
		
		
		
		String opciones []= {"Loma linda", "Calafia","Diana Laura"};
		JComboBox btnOp = new JComboBox(opciones);
		btnOp.setBounds(10, 490, 170, 30);
		registro.add(btnOp);
		
		JButton registroBtn = new JButton("Acceder" );
		registroBtn.setBounds(10, 540, 120, 30);
		registro.add(registroBtn);
		
		JMenuBar barra = new JMenuBar();
		JMenu lista1 = new JMenu("Archivo");
		
		JMenuItem opcion1 = new JMenuItem("Abrir");
		JMenuItem opcion2 = new JMenuItem("Nuevo");
		
		barra.add(lista1);
		lista1.add(opcion1);
		lista1.add(opcion2);
		
		this.setJMenuBar(barra);
		this.add(registro);
		
	}
	
	void crearPanel2(){
		JPanel panel2 = new JPanel();
		
		panel2.setSize(this.getWidth(),this.getHeight());
		panel2.setLocation(0,0);
		panel2.setLayout(null);
		panel2.setBackground(Color.pink);
		this.getContentPane().add(panel2);
		
		
		
		String[][] datos = {
			    {"1", "Juan", "Ingeniería Informática", "001"},
			    {"2", "María", "Medicina", "002"},
			    {"3", "Luis", "Derecho", "003"},
			    {"4", "Ana", "Administración de Empresas", "004"},
			    {"5", "Carlos", "Psicología", "005"},
			    {"6", "Laura", "Arquitectura", "006"},
			    {"7", "Pedro", "Ingeniería Civil", "007"},
			    {"8", "Sofía", "Economía", "008"},
			    {"9", "Miguel", "Biología", "009"},
			    {"10", "Elena", "Periodismo", "010"},
			    {"11", "David", "Matemáticas", "011"},
			    {"12", "Carmen", "Química", "012"},
			    {"13", "José", "Arte", "013"},
			    {"14", "Isabel", "Historia", "014"},
			    {"15", "Pablo", "Física", "015"},
			    {"16", "Rocío", "Filosofía", "016"},
			    {"17", "Fernando", "Educación", "017"},
			    {"18", "Natalia", "Música", "018"},
			    {"19", "Antonio", "Turismo", "019"},
			    {"20", "Eva", "Sociología", "020"},
			    {"21", "Manuel", "Geografía", "021"},
			    {"22", "Ana María", "Ingeniería Eléctrica", "022"}
			};

		
		String[] columnas = {"Nº", "Nombre", "Carrera", "ID"};
	    JTable tabla = new JTable(datos, columnas);
	    tabla.setBounds(10, 10, 600, 350); 
	    panel2.add(tabla);
		
		
	}
	
	void crearPanel3(){
		JPanel panel2 = new JPanel();
		
		panel2.setSize(this.getWidth(),this.getHeight());
		panel2.setLocation(0,0);
		panel2.setLayout(null);
		panel2.setBackground(Color.decode("#090983"));
		this.getContentPane().add(panel2);
		
		JLabel etiquetaUser = new JLabel("User Login",0);
		etiquetaUser.setFont(new Font("Agency FB", Font.BOLD,35));
		etiquetaUser.setForeground(Color.white);
		//etiquetaUser.setBackground(Color.WHITE);
		etiquetaUser.setBounds(350,135 , 300, 50);
		//etiquetaUser.setOpaque(false);
		panel2.add(etiquetaUser);
		
		JLabel cuenta = new JLabel("My Account",0);
		cuenta.setFont(new Font("Agency FB", Font.BOLD,35));
		cuenta.setForeground(Color.decode("#FFDF6D"));
		cuenta.setBounds(350,185 , 300, 50);
		panel2.add(cuenta);
		
		
		JLabel etiquetaEnter1 = new JLabel("Enter Your Username",0);
		etiquetaEnter1.setFont(new Font("Agency FB", Font.BOLD,20));
		etiquetaEnter1.setForeground(Color.white);
		etiquetaEnter1.setBounds(260,240 , 300, 30);
		panel2.add(etiquetaEnter1);
		
		JTextField BoxUserName = new JTextField();
		BoxUserName.setBounds(345, 280, 300, 35);
		panel2.add(BoxUserName);
		
		
		//img
		JLabel imag = new JLabel ("");
		imag.setIcon(new ImageIcon(getClass().getResource("usuario.png")));
		imag.setBounds(300, 280, 35, 35 );
		imag.setOpaque(true);
		imag.setBackground(Color.WHITE);
		panel2.add(imag);
		
		JLabel img2 = new JLabel ("");
		img2.setIcon(new ImageIcon(getClass().getResource("passw.png")));
		img2.setBounds(300, 380, 35, 35 );
		img2.setOpaque(true);
		img2.setBackground(Color.WHITE);
		panel2.add(img2);
		
		JLabel etiquetaPass = new JLabel("Enter Your password",0);
		etiquetaPass.setFont(new Font("Agency FB", Font.BOLD,20));
		etiquetaPass.setForeground(Color.white);
		etiquetaPass.setBounds(260, 345, 300, 35);
		panel2.add(etiquetaPass);
		
		JPasswordField contrasenia = new JPasswordField();
		contrasenia.setBounds(345, 380, 300, 35);
		panel2.add(contrasenia);
		
		JButton login = new JButton("Login");
		login.setForeground(Color.black);
		login.setFont(new Font("Agency FB", Font.BOLD,35));
		login.setBackground(Color.decode("#FFDF6D"));
		login.setBounds(420, 440, 150, 60);
		panel2.add(login);
		
		
		JLabel etiqueta = new JLabel(" ");
		etiqueta.setBounds(230, 10, this.getWidth(), 30);
		etiqueta.setBackground(Color.decode("#000066"));
		etiqueta.setBounds(150, 130, 700, 400);
		etiqueta.setOpaque(true);
		panel2.add(etiqueta);
		
		JLabel askAcount = new JLabel("Don't have a account?",0);
		askAcount.setBounds(430, 540,140, 30);
		askAcount.setForeground(Color.WHITE);
		askAcount.setFont(new Font("Agency FB", Font.BOLD,20));
		panel2.add(askAcount);
		
		JButton singUp = new JButton("Sing Up");
		singUp.setForeground(Color.black);
		singUp.setFont(new Font("Agency FB", Font.BOLD,30));
		singUp.setBackground(Color.decode("#FFDF6D"));
		singUp.setBounds(440, 585, 120, 45);
		panel2.add(singUp);
		
	}

}
