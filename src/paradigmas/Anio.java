package paradigmas;

import java.util.Scanner;

public class Anio {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Por favor digite el año a evaluar:");
        int anio = in.nextInt();
        
        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
	}

}
