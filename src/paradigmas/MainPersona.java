package paradigmas;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	     System.out.println("Ingrese el nombre:");
	        String nombre = scanner.nextLine();

	        System.out.println("Ingrese la edad:");
	        int edad = scanner.nextInt();

	        System.out.println("Ingrese el género (m o f):");
	        char genero = scanner.next().charAt(0);

	        System.out.println("Ingrese el peso (kg):");
	        double peso = scanner.nextDouble();

	        System.out.println("Ingrese la estatura (m):");
	        double estatura = scanner.nextDouble();

	        
	        Persona persona = new Persona(nombre, edad, genero, peso, estatura);

	        
	        System.out.println("\nInformación de la persona:");
	        persona.informacion();

	        scanner.close();
	    }

	

}
