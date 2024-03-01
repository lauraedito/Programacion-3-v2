package paradigmas;
import java.util.Scanner;
public class Conversor {

	public static void main(String[] args) {
		Scanner converir = new Scanner(System.in);
        double medida;
        
        System.out.print("Ingrese la medida: ");
        medida = converir.nextDouble();
        
        System.out.println("Conversiones: ");
        System.out.println("Convertido a Kilómetros: " + medida / 1000 + " km");
        System.out.println("Convertido a Metros: " + medida + " m");
        System.out.println("Convertido a Centímetros: " + medida * 100 + " cm");
        System.out.println("Convertido a Pulgadas: " + medida * 39.37 + " in");
	

	}

}
