package paradigmas;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
Scanner esfera = new Scanner(System.in);
        
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = esfera.nextDouble();
        
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        
        System.out.println("Longitud de circunferencia: " + longitud);
        
        System.out.println("Área del círculo: " + area);
        System.out.println("Volumen de la esfera: " + volumen);

	}

}
