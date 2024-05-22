package BellaI;


import java.sql.SQLException;

public class Main {
	
	 public static void main(String[] args) {
		 String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_Bella Italia";
	     String usuario = "freedb_Edith";
	     String contraseña = "rs@ZRHWKFX@!PV4";
	     
	     try {
	            Models model = new Models(url, usuario, contraseña);
	            View view = new View();
	            Controller controller = new Controller(view, model);

	            view.setVisible(true);
	        } catch (SQLException e) {
	            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
	        }
	    }
	}
