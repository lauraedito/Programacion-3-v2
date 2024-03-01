package paradigmas;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int a = 0, b= 0, c= 0;
		
		System.out.println("ingrese el primer numero: ");
		a = in.nextInt();

        System.out.print("Ingrese el segundo numero: " );
        b = in.nextInt();
        
        if (a == b){
        	System.out.println("Los numeros son iguales: ");
        }else if (a<b){
        	System.out.println("el numero menor es: " + a);
        }else {
        	System.out.println("el numero nemor es: " + b);
        }

	}

}
