//Laura Edith Osorio Maldonado

package ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
		// crear();
		//crearPanel2();
		//crearPanel3();
		//crearIntereses();
		 dibujo ();
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
	
	void crearIntereses (){
		this.setSize(500, 700);
		
		JPanel panelInteres= new JPanel();
		
		panelInteres.setSize(this.getWidth(),this.getHeight());
		panelInteres.setLocation(0,0);
		panelInteres.setLayout(null);
		panelInteres.setBackground(Color.WHITE);
		add(panelInteres, BorderLayout.CENTER);
		
		
		//texto de interes
		JLabel etiquetaInteres = new JLabel("Interés");
		
		etiquetaInteres.setFont(new Font("Georgia", Font.BOLD,20));
		etiquetaInteres.setForeground(Color.decode("#FE0200"));
		etiquetaInteres.setBounds(40, 10, 100, 20);
		panelInteres.add(etiquetaInteres, BorderLayout.NORTH);
		
		
		
		JPanel interes = new JPanel();
		interes.setBounds(40, 50, 405,300);
		
		interes.setLayout(null);
		interes.setBackground(Color.decode("#A1FBA3"));
		this.getContentPane().add(interes);
		panelInteres.add(interes, BorderLayout.NORTH); 
		
		JLabel etiquetaCapital = new JLabel("Capital: ");
		etiquetaCapital.setFont(new Font("Calibri", Font.BOLD,15));
		etiquetaCapital.setForeground(Color.black);
		etiquetaCapital.setBounds(50,50, 100, 20);
		interes.add(etiquetaCapital);
		
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(160 ,50, 200, 30);
		interes.add(cajaTexto);
		
		/////
		JLabel etiquetaTiempo = new JLabel("Tiempo: ");
		etiquetaTiempo.setFont(new Font("Calibri", Font.BOLD,15));
		etiquetaTiempo.setForeground(Color.black);
		etiquetaTiempo.setBounds(50,100, 100, 20);
		interes.add(etiquetaTiempo);
		
		JTextField cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(160 ,100, 200, 30);
		interes.add(cajaTexto2);
		
		JLabel etiquetaTasa = new JLabel("Tasa de interés: ");
		etiquetaTasa.setFont(new Font("Calibri", Font.BOLD,15));
		etiquetaTasa.setForeground(Color.black);
		etiquetaTasa.setBounds(50,150, 150, 20);
		interes.add(etiquetaTasa);
		
		JTextField cajaTexto3 = new JTextField();
		cajaTexto3.setBounds(160 ,150, 200, 30);
		interes.add(cajaTexto3);
		
		
		JPanel resultados = new JPanel();
		resultados.setBounds(40, 400, 405,220);
		resultados.setLayout(null);
		resultados.setBackground(Color.decode("#FC9493"));
		this.getContentPane().add(resultados);
		panelInteres.add(resultados, BorderLayout.SOUTH);
		
		//
		
		JLabel etiquetaResultadoInteres = new JLabel("Interés: ");
		etiquetaResultadoInteres.setFont(new Font("Calibri", Font.BOLD,15));
		etiquetaResultadoInteres.setForeground(Color.black);
		etiquetaResultadoInteres.setBounds(50,60, 150, 20);
		resultados.add(etiquetaResultadoInteres);
		
		JTextField cajaTextoResultado = new JTextField();
		cajaTextoResultado.setBounds(160 ,60, 200, 30);
		resultados.add(cajaTextoResultado);
		
		JLabel etiquetaResultadoMonto = new JLabel("Interés: ");
		etiquetaResultadoMonto.setFont(new Font("Calibri", Font.BOLD,15));
		etiquetaResultadoMonto.setForeground(Color.black);
		etiquetaResultadoMonto.setBounds(50,140, 150, 20);
		resultados.add(etiquetaResultadoMonto);
		
		JTextField cajaResultadoMonto = new JTextField();
		cajaResultadoMonto.setBounds(160 ,140, 200, 30);
		resultados.add(cajaResultadoMonto);


	}
	
	void dibujo () {
		JPanel panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLocation(0,0);
		panel.setLayout(null);
		panel.setBackground(Color.decode("#B3EEFE"));
		this.getContentPane().add(panel);
	}
	
	/*
	public void paint(Graphics g){
		super. paint(g);
		Graphics2D g2d =(Graphics2D) g;
		g2d.drawArc(100,100,100,200,45,180);
		g2d.setColor(Color.black);
		g2d.drawLine(0,0,500,500);
		
		g2d.drawOval( 50,50,80,80);
		
		int xS[]= {225,150,300,225};
		int yS[]= {50,150,150,50};
		g2d.drawPolyline(xS,xS,ABORT);
		
		g2d.drawRoundRect(250,350,200,200,25,25);
		g2d.setColor(Color.BLUE);
		g2d.drawString("Buenas Noches",500,200);
		
		g2d.fillArc(500, 100, 200, 200, 95, 200);
		
		g2d.fillOval(170,240,90,90);
		
		int xS2[]= {225,180,330,225};
		int yS2[]= {90,180,180,80};
		
		g2d.fillPolygon(xS2, yS2,4);
		
		try {
			BufferedImage imagen = ImageIO.read(new File("src/ayuda.png"));
			g2d.drawImage(imagen, 200, 100, null);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
*/
	
	/*//casita con rejas
	public void paint(Graphics g){
		super. paint(g);
		Graphics2D g2d =(Graphics2D) g;
		
		g2d.setColor(Color.decode("#AC6B10"));
		g2d.fillRect(0, 320, 1000, 34);
		
		g2d.setColor(Color.decode("#AC6B10"));
		g2d.fillRect(0, 400, 1000, 34);
		
		g2d.setColor(Color.decode("#CB8E45"));
	    int numPalos = 15; 
	    int alturaCerca = 200; 
	    int espacioEntrePalos = 50; 
	     
	     for (int i = 0; i < numPalos; i++) {
	         int x = 50 + i * 80; 
	         int y = 500 - alturaCerca; 
	         g2d.fillRect(x, y, 35, alturaCerca);
	     }
		
		g2d.setColor(Color.GRAY);
	    g2d.fillRect(370, 30, 50, 70);
		
		 g2d.setColor(Color.decode("#A70B0A"));
	     int[] xTecho = {100, 300, 500};
	     int[] yTecho = {100, 50, 100};
	     g2d.fillPolygon(xTecho, yTecho, 3);
	     
	       
	        //casa
	     g2d.setColor(Color.decode("#FCFFD0"));
	     g2d.fillRect(100, 100, 400, 400);
	     
	     g2d.setColor(Color.decode("#6E76E5"));
	     g2d.fillRect(160, 150, 80, 90);
	     
	      // puerta 
	     g2d.setColor(Color.decode("#D86200"));
	     g2d.fillRect(240, 300, 120, 200);
	     
	     
	     
	    //circulo
	     g2d.setColor(Color.decode("#5B452D"));
	     g2d.fillOval(329, 400, 15, 15); 
	     
	     
	     
		//pasto
	     g2d.setColor(Color.decode("#089A00"));
	     g2d.fillRect(0, 500, 1000, 200);
	     
	     g2d.setColor(Color.decode("#0ED403"));
	     g2d.fillRect(0, 550, 1000, 400);
	     
	     g2d.setColor(Color.decode("#F2ECB1"));
	     g2d.fillRect(0, 600, 1000, 400);
	     
	     g2d.setColor(Color.decode("#754B09"));
	     g2d.fillRect(0, 650, 1000, 400);
	     
	     //banqueta
	     g2d.setColor(Color.GRAY);
	     g2d.fillRect(50, 480, 500, 20);
		
	     
	     
		
	}
	*/
	
	
	public void paint(Graphics g){
		super. paint(g);
		Graphics2D g2d =(Graphics2D) g;
		
		//piso cafe
		g2d.setColor(Color.decode("#EB9772"));
		g2d.fillRect(0, 655, 1010, 40);
		
		//lineas
		g2d.setColor(Color.black);
		g2d.fillRect(0, 655, 1010, 5);
		
		
		//piso cafe claro
		g2d.setColor(Color.decode("#F8C6C0"));
		g2d.fillRect(0, 640, 1010, 15);
		
		//lineas
		g2d.setColor(Color.black);
		g2d.fillRect(0, 637, 1010, 3);
		
		//arbusto
		g2d.setColor(Color.black);
		g2d.drawOval( 50,585,35,55);
		g2d.setColor(Color.decode("#52D871"));
		g2d.fillOval(50, 585, 34, 54);
		
		//marco del cubo marron pequenio
		g2d.setColor(Color.black);
	    g2d.fillRoundRect(49, 299, 53, 53,10,10);
	    //este es el cubo marron
		g2d.setColor(Color.decode("#FF9062"));
	    g2d.fillRoundRect(51, 301, 49, 49,10,10);
	    
	    //puntitos negros
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(55, 305, 4, 4);
	    //puntitos negros
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(90, 305, 4, 4);
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(55, 340, 4, 4);
	    //puntitos negros
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(90, 340, 4, 4);
	    
	    //marco del cubo marron pequenio que esta junto con otro
	  	g2d.setColor(Color.black);
	  	g2d.fillRoundRect(200, 100, 53, 53,10,10);
	  	//este es el cubo marron
	  	g2d.setColor(Color.decode("#FF9062"));
	  	g2d.fillRoundRect(202, 102, 49, 49,10,10);
	  	//puntitos
	  	g2d.setColor(Color.BLACK);
	    g2d.fillOval(207, 105, 4, 4);
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(241, 105, 4, 4);
	    //puntidos de abajo
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(207, 140, 4, 4);
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(241, 140, 4, 4);
	  	
	    //cuadrado2 de al lado
	  	g2d.setColor(Color.black);
	  	g2d.fillRoundRect(253, 100, 53, 53,10,10);
	  	//este es el cubo marron
	  	g2d.setColor(Color.decode("#FF9062"));
	  	g2d.fillRoundRect(255, 102, 49, 49,10,10);
	    //cubo derecha
	  	g2d.setColor(Color.black);
	  	g2d.fillRoundRect(900, 153, 53, 53,10,10);
	  	//este es el cubo marron
	  	g2d.setColor(Color.decode("#FF9062"));
	  	g2d.fillRoundRect(902, 155, 49, 49,10,10);
	  	g2d.setColor(Color.BLACK);
	  	//puntitos de la derecha
	    g2d.fillOval(907, 160, 4, 4);
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(940, 160, 4, 4);
	  	g2d.setColor(Color.BLACK);
	    g2d.fillOval(907, 194, 4, 4);
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(940, 194, 4, 4);
	  	
	  	
	  	
	  	
	  	//puntitos
	  	g2d.setColor(Color.BLACK);
	    g2d.fillOval(259, 105, 4, 4);
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(295, 105, 4, 4);
	  	g2d.setColor(Color.BLACK);
	    g2d.fillOval(259, 140, 4, 4);
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(295, 140, 4, 4);
	  	
	  	//sombra negra del rectangulo azul
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(447, 420, 30, 220,10,10);
	    //marco negro del rectangulo azul
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(295, 387, 157, 253,10,10);
	    //rectangulo azul
	    g2d.setColor(Color.decode("#84C0FF"));
	    g2d.fillRoundRect(299, 389, 149, 245,10,10);
		//sombra azul del rectangulo azul
	    g2d.setColor(Color.decode("#188FDF"));
	    g2d.fillRoundRect(442, 389, 6, 245,10,10);
	    
	    g2d.setColor(Color.decode("#188FDF"));
	    g2d.fillRoundRect(296, 630, 149, 6,10,10);
	    //circulos
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(305, 395, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(308, 397, 15, 15);
	    
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(423, 395, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(425, 397, 15, 15);
	    
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(423, 610, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(425, 613, 15, 15);
	    
	    
	    
	    //sombra negra del cuadrado cafe
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(338, 510, 30, 130,10,10);
	    //marco negro del cuadrado beige que esta a un lado del arbusto
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(189, 484, 155, 155,10,10);
	    //cuadrado relleno
	    g2d.setColor(Color.decode("#FFC3B8"));
	    g2d.fillRoundRect(192, 487, 149, 149,10,10);
	    //sombra cafe de cuadro relleno
	    g2d.setColor(Color.decode("#E69875"));
	    g2d.fillRoundRect(335, 487, 6, 149,10,10);
	    g2d.setColor(Color.decode("#E69875"));
	    g2d.fillRoundRect(191, 630, 149, 6,10,10);
	    //circulos
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(199, 490, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(201, 492, 15, 15);
	    
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(315, 490, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(317, 492, 15, 15);
	    
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(199, 610, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(201, 613, 15, 15);
	    
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(315, 610, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(317, 613, 15, 15);
	    
	    
		
	    //marco negro del rectangulo verdeoscuro
	    g2d.setColor(Color.black);
	    g2d.fillRect(582, 505, 103, 132);
	    //verde oscuro
	    g2d.setColor(Color.decode("#1F831A"));
	    g2d.fillRect(585, 513, 95, 125);
	    
	    //
	    //verde claro palitos
	    g2d.setColor(Color.decode("#4DDA69"));
	    g2d.fillRect(589, 513, 3, 125);
	    //palito2
	    g2d.setColor(Color.decode("#4DDA69"));
	    g2d.fillRect(598, 513, 7, 125);
	    
	    g2d.setColor(Color.decode("#4DDA69"));
	    g2d.fillRect(610, 513, 2, 125);
	    
	    g2d.setColor(Color.decode("#4DDA69"));
	    g2d.fillRect(640, 513, 4, 125);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRect(647, 513, 7, 125);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRect(659, 513, 2, 125);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRect(669, 513, 9, 125);
	    
	    
	    
	    
	    //rectangulo que va arriba del otro
	    g2d.setColor(Color.black);
	    g2d.fillRect(576, 500, 115, 50);
	    
	    g2d.setColor(Color.decode("#1F831A"));
	    g2d.fillRect(579, 504, 109, 43);
	    
	    //palitos short
	    g2d.setColor(Color.decode("#4DDA69"));
	    g2d.fillRect(587, 504, 3, 43);
	    //palito2
	    g2d.setColor(Color.decode("#4DDA69"));
	    g2d.fillRect(596, 504, 7, 43);
	    
	    g2d.setColor(Color.decode("#4DDA69"));
	    g2d.fillRect(608, 504, 2, 43);
	    
	    g2d.setColor(Color.decode("#4DDA69"));
	    g2d.fillRect(638, 504, 4, 43);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRect(645, 504, 7, 43);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRect(657, 504, 2, 43);
	    
	    g2d.setColor(Color.black);
	    g2d.fillRect(667, 504, 9, 43);
	    
	    
	    //cuadrado verde
	  //sombra negra
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(940, 510, 30, 130,10,10);
	    //marco negro del cuadrado beige que esta a un lado del arbusto
	    g2d.setColor(Color.black);
	    g2d.fillRoundRect(790, 484, 157, 155,10,10);
	    //cuadrado relleno
	    g2d.setColor(Color.decode("#51D96B"));
	    g2d.fillRoundRect(792, 487, 152, 149,10,10);
	    //sombra verde de cuadro relleno
	    g2d.setColor(Color.decode("#1D451A"));
	    g2d.fillRoundRect(790, 630,154,6,10,10);
	    g2d.setColor(Color.decode("#1D451A"));
	    g2d.fillRoundRect(938, 484,6,150,10,10);
	    
	    //circulos
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(918, 490, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(920, 492, 15, 15);
	    
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(795, 490, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(797, 492, 15, 15);
	    
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(918, 610, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(920, 613, 15, 15);
	    
	    g2d.setColor(Color.BLACK);
	    g2d.fillOval(795, 610, 20, 20);
	    g2d.setColor(Color.decode("#BABDC2"));
	    g2d.fillOval(797, 613, 15, 15);
	    
	   /* 
	    try {
	        BufferedImage imagen = ImageIO.read(new File("src/header-mario.png"));
	        g2d.drawImage(imagen, 200, 100, null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    */
	    
	}
	  
}
