package Examen2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Factura extends JFrame{
	
	public Factura() {
		this.setSize(700, 800);
		setTitle("Factura");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null);
		
		crear();
	}
	void crear () {
		JPanel panel = new JPanel();
		
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setLayout(null);
		panel.setBackground(Color.white);
		add(panel);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0,700, 90);
		panel2.setLayout(null);
		panel2.setBackground(Color.decode("#006599"));
		panel.add(panel2);
		
		
		JLabel etiqueta = new JLabel("Factura en java - NetBeans - ArrayList y POO");
		etiqueta.setBounds(20, 20, 800 , 30);
		etiqueta.setForeground(Color.white); 
		etiqueta.setFont(new Font("Arial", Font.BOLD,20));
		panel2.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel("[Sin base de datos]");
		etiqueta2.setBounds(20, 50, 700 , 30);
		etiqueta2.setForeground(Color.white);
		etiqueta2.setFont(new Font("Arial", Font.PLAIN,17));
		panel2.add(etiqueta2);
		
		
		JLabel datos = new JLabel("Datos del cliente");
		datos.setBounds(20, 100, 700 , 30);
		datos.setFont(new Font("Arial", Font.PLAIN,15));
		panel.add(datos);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBounds(10, 100,680, 150);
		panelDatos.setLayout(null);
		panelDatos.setBackground(Color.decode("#EFF1F2"));
		panel.add(panelDatos);
		
		JLabel documento = new JLabel("Documento:");
		documento.setBounds(20,20, 100 , 30);
		documento.setFont(new Font("Arial", Font.PLAIN,15));
		panelDatos.add(documento);
		JTextField cajadocumento = new JTextField();
		cajadocumento.setBounds(150, 20, 130, 30);
		panelDatos.add(cajadocumento);
		
		
		JLabel nombres = new JLabel("Nombres:");
		nombres.setBounds(340,20, 100 , 30);
		nombres.setFont(new Font("Arial", Font.PLAIN,15));
		panelDatos.add(nombres);
		JTextField cajadNombres = new JTextField();
		cajadNombres.setBounds(430, 20, 200, 30);
		panelDatos.add(cajadNombres);
		
		JLabel direccion = new JLabel("Direccion:");
		direccion.setBounds(40,70, 100 , 30);
		direccion.setFont(new Font("Arial", Font.PLAIN,15));
		panelDatos.add(direccion);
		JTextField cajaDireccion = new JTextField();
		cajaDireccion.setBounds(150,70, 130, 30);
		panelDatos.add(cajaDireccion);
		
		JLabel telefono = new JLabel("Teléfono:");
		telefono.setBounds(340,70, 100 , 30);
		telefono.setFont(new Font("Arial", Font.PLAIN,15));
		panelDatos.add(telefono);
		JTextField cajadTelefono = new JTextField();
		cajadTelefono.setBounds(430, 70, 200, 30);
		panelDatos.add(cajadTelefono);
		
		
		
		JPanel panelDatosFactura = new JPanel();
		panelDatosFactura.setBounds(10, 270,680, 90);
		panelDatosFactura.setLayout(null);
		panelDatosFactura.setBackground(Color.decode("#EFF1F2"));
		panel.add(panelDatosFactura);
		
		JLabel datosFactura = new JLabel("Datos de factura");
		datosFactura.setBounds(20, 5, 700 , 30);
		datosFactura.setFont(new Font("Arial", Font.PLAIN,15));
		panelDatosFactura.add(datosFactura);
		
		JLabel numFactura = new JLabel("Nº Factura:");
		numFactura.setBounds(20,30, 100 , 30);
		numFactura.setFont(new Font("Arial", Font.PLAIN,15));
		panelDatosFactura.add(numFactura);
		
		JLabel num = new JLabel("1");
		num.setBounds(120,30, 100 , 30);
		num.setFont(new Font("Arial", Font.BOLD,15));
		panelDatosFactura.add(num);
		
		JLabel fecha = new JLabel("Fecha:");
		fecha.setBounds(340,30, 100 , 30);
		fecha.setFont(new Font("Arial", Font.PLAIN,15));
		panelDatosFactura.add(fecha);
		
		JLabel num2 = new JLabel("2021/05/21");
		num2.setBounds(420,30, 100 , 30);
		num2.setFont(new Font("Arial", Font.BOLD,15));
		panelDatosFactura.add(num2);
		
		JPanel panelListadoFactura = new JPanel();
		panelListadoFactura.setBounds(10, 380,680, 50);
		panelListadoFactura.setLayout(null);
		panelListadoFactura.setBackground(Color.decode("#EFF1F2"));
		panel.add(panelListadoFactura);
		
		
		
		JLabel listado = new JLabel("Ver listado de facturas");
		listado.setBounds(20,10, 200 , 30);
		listado.setFont(new Font("Arial", Font.PLAIN,15));
		panelListadoFactura.add(listado);
		
		JButton aniadir = new JButton("Añadir");
		aniadir.setBounds(430,10, 100 , 30);
		aniadir.setFont(new Font("Arial", Font.PLAIN,15));
		aniadir.setBackground(Color.green);
		panelListadoFactura.add(aniadir);
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.setBounds(550,10, 100 , 30);
		eliminar.setFont(new Font("Arial", Font.PLAIN,15));
		eliminar.setBackground(Color.red);
		panelListadoFactura.add(eliminar);
		
		
		
		JPanel panelListadoFacturas = new JPanel();
		panelListadoFacturas.setBounds(10, 435,680, 100);
		panelListadoFacturas.setLayout(new BorderLayout());
		
		panelListadoFacturas.setBackground(Color.decode("#EFF1F2"));
		panel.add(panelListadoFacturas);
		
		String[][] listadoDeFacturas = {
			    {"Agua", "2", "500", "1000.0"},
			    {"Cereal", "5", "1000", "5000.0"},
			    {"Leche", "2", "300", "600.0"},
			    
			};

		
		String[] columnas = {"Producto", "Cantidad", "Valor", "Sub Total"};
	    JTable tabla = new JTable(listadoDeFacturas, columnas);
	    JScrollPane scrollPane = new JScrollPane(tabla);  
	    panelListadoFacturas.add(scrollPane, BorderLayout.CENTER);
	    
	    JLabel subTotal = new JLabel("Sub Total:");
	    subTotal.setBounds(30,550, 200 , 30);
	    subTotal.setFont(new Font("Arial", Font.PLAIN,15));
		panel.add(subTotal);
		
		JLabel num3 = new JLabel("6600.0");
		num3.setBounds(130,550, 200 , 30);
		num3.setFont(new Font("Arial", Font.BOLD,15));
		panel.add(num3);
		
		JLabel descuento = new JLabel("% Descuento:");
		descuento.setBounds(30,590, 200 , 30);
		descuento.setFont(new Font("Arial", Font.PLAIN,15));
		panel.add(descuento);
		
		JTextField cajaDescuento = new JTextField();
		cajaDescuento.setBounds(160,590, 60 , 30);
		panel.add(cajaDescuento);
		
		JCheckBox box = new JCheckBox ("");
		box.setBounds(240,590, 20 , 20);
		panel.add(box);
		
		JLabel valor = new JLabel("Valor descontado:");
		valor.setBounds(330,590, 150 , 30);
		valor.setFont(new Font("Arial", Font.PLAIN,15));
		panel.add(valor);
		
		JLabel num4 = new JLabel("330.0");
		num4.setBounds(490,590, 200 , 30);
		num4.setFont(new Font("Arial", Font.BOLD,15));
		panel.add(num4);
		
		JLabel iva = new JLabel("IVA 19%:");
		iva.setBounds(30,630, 200 , 30);
		iva.setFont(new Font("Arial", Font.PLAIN,15));
		panel.add(iva);
		
		JLabel num5 = new JLabel("1254.0");
		num5.setBounds(130,630, 200 , 30);
		num5.setFont(new Font("Arial", Font.BOLD,15));
		panel.add(num5);
		
		
		JLabel totalFactura = new JLabel("Total Factura:");
		totalFactura.setBounds(30,670, 200 , 30);
		totalFactura.setFont(new Font("Arial", Font.PLAIN,15));
		panel.add(totalFactura);
		
		JLabel num6 = new JLabel("1254.0");
		num6.setBounds(150,670, 200 , 30);
		num6.setFont(new Font("Arial", Font.BOLD,15));
		panel.add(num6);
		
		JButton boton = new JButton("Finalizar factura");
        boton.setBounds(350,700, 130 , 25); 
        boton.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(boton);
        
        JButton boton2 = new JButton("Limpiar");
        boton2.setBounds(500,700, 130 , 25); 
        boton2.setFont(new Font("Arial", Font.PLAIN, 12));
        panel.add(boton2);
        
        JPanel panel3 = new JPanel();
		panel3.setBounds(0, 780,700, 10);
		panel3.setBackground(Color.decode("#006599"));
		panel.add(panel3);
        
	}

}
