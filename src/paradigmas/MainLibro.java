package paradigmas;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese la editorial del libro:");
        String editorial = scanner.nextLine();
        
        System.out.println("Ingrese el año de publicación del libro:");
        int añoPublicacion = scanner.nextInt();

        scanner.nextLine();
        
        System.out.println("Ingrese el país de publicación del libro:");
        String pais = scanner.nextLine();

        
        Libro libro = new Libro(titulo, autor, editorial, añoPublicacion, pais);
        
        System.out.println("\nInformación del libro:");
        libro.mostrarInformacion();

        
        if (libro.esBestSeller()) {
            System.out.println("Este libro es un best-seller.");
        } else {
            System.out.println("Este libro no es un best-seller.");
        }
	}

}
