package paradigmas;

public class Rectangulo {

	
		
	    double base;
	    double altura;

	    
	    public Rectangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    
	    public double obtenerArea() {
	        return base * altura;
	    }

	    
	    public double obtenerPerimetro() {
	        return 2 * (base + altura);
	    }
	

	

}
