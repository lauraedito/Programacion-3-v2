package uwu;



public class Huesped {
	
	    private String nombre;
	    private int edad;
	    private String telefono;
	    private String email;
	    private String tipoDeMembresia;
	    private double descuento;
	    
	    public Huesped(String nombre) {
	    	this.nombre=nombre;
	        
	    }

	    public Huesped(String nombre, int edad, String telefono, String email, String tipoDeMembresia) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.telefono = telefono;
	        this.email = email;
	        this.tipoDeMembresia = tipoDeMembresia;
	    }

	   

	    public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTipoDeMembresia() {
			return tipoDeMembresia;
		}

		public void setTipoDeMembresia(String tipoDeMembresia) {
			this.tipoDeMembresia = tipoDeMembresia;
		}




	    @Override
	    public String toString() {
	        return "Nombre: " + nombre 
	        		+ "\nEdad: " + edad 
	        		+ "\nTeléfono: " + telefono 
	        		+ "\nEmail: " + email 
	        		+ "\nTipo de Membresía: " + tipoDeMembresia;
	    }
	    public double calcularDescuento() {
	        

	        
	        
	        //System.out.print("¿Qué tipo de cliente eres? (VIP / Cliente frecuente / Ninguna): ");
	      //  tipoDeMembresia = scanner.next();

	        if ("VIP".equals(tipoDeMembresia)) {
	            descuento = 0.15; 
	        } else if ("Cliente frecuente".equals(tipoDeMembresia)) {
	            descuento = 0.10; // 10% de descuento
	        } else {
	            descuento = 0.0;
	        }

	       	       

	        return descuento;
	    }

	    
	    
	    
	    
	    
	

}
