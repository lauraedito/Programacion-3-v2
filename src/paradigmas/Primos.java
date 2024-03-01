package paradigmas;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int numero;
	        boolean esPrimo = true;
	        Scanner in = new Scanner(System.in);

	        do {
	            System.out.print("Ingresa un número entero positivo: ");
	            numero = in.nextInt();
	            if (numero > 100) {
	                System.out.println("Solo numeros del 1 al 100.");
	            }
	        } while (numero <= 0 || numero > 100);

	        if (numero == 1) {
	            esPrimo = false;
	        } else {
	            for (int i = 2; i <= numero / 2; ++i) {
	                if (numero % i == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }
	        }

	        if (esPrimo)
	            System.out.println(numero + " es un número primo.");
	        else
	            System.out.println(numero + " no es un número primo.");
    }
}
