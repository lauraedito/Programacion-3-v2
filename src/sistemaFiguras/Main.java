package sistemaFiguras;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		 System.out.println("Ingrese la base del rectángulo:");
	     double baseRectangulo = scanner.nextDouble();
	     System.out.println("Ingrese la altura del rectángulo:");
	     double alturaRectangulo = scanner.nextDouble();

	        
	     Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
	     System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
	     System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
	     
	     
	     System.out.println("Ingrese el radio: ");
	     double radio = scanner.nextDouble();
	     Circulo circulo = new Circulo (radio);
	     
	     System.out.println("Área del circulo es: " + circulo.calcularArea());
	     System.out.println("Perímetro del circulo es: " + circulo.calcularPerimetro());
        
        
        
        
        
        
        
        scanner.close();

	}

}
