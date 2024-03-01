package paradigmas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner cal = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        float num1 = cal.nextFloat();
        
        System.out.print("Ingrese el segundo número: ");
        float num2 = cal.nextFloat();
        
        float suma = num1 + num2;
        float resta = num1 - num2;
        float multiplicacion = num1 * num2;
        float division = num1 / num2;
        
        System.out.println("Resultados: ");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
		

	}

}
