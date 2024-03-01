package paradigmas;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		float area, base, altura;
		
		System.out.println("ingrese la base de triangulo: ");
		base = in.nextFloat();

        System.out.print("Ingresa la altura del triangulo: " );
        altura = in.nextFloat();

        area = (base*altura)/2;

        System.out.println("El área del triangulo es:" + area );


	}

}
