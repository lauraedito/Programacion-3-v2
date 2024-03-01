package paradigmas;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int a = 0, b= 0, c= 0,d=0, e=0,f=0;
		
		System.out.println("ingrese el primer numero: ");
		a = in.nextInt();

        System.out.print("Ingrese el segundo numero: " );
        b = in.nextInt();
        
        System.out.print("Ingrese el tercer numero: " );
        c = in.nextInt();
        
        System.out.print("Ingrese el cuarto numero: " );
        d = in.nextInt();
        System.out.print("Ingrese el quinto numero: " );
        e = in.nextInt();

        f= (a+b+c+d+e)/5;

        System.out.println("El promedio es: " + f );
	}

}
