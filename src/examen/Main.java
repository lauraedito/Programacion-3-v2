package examen;

import java.util.Scanner;

public class Main {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        
	        do {
	            System.out.println("1. Consultar Coche");
	            System.out.println("2. Consultar Avión");
	            System.out.println("3. Consultar Lancha");
	            System.out.println("4. Consultar Moto");
	            System.out.println("5. Salir");
	            System.out.print("Seleccione una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    consultarCoche();
	                    break;
	                case 2:
	                    consultarAvion();
	                    break;
	                case 3:
	                    consultarLancha();
	                    break;
	                case 4:
	                    consultarMoto();
	                    break;
	                case 5:
	                    System.out.println("Salir");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (opcion != 5);
	    }

	    
	    public static void consultarCoche() {
	        Coche coche = new Coche(200, "Toyota", "Corolla");
	        System.out.println("Velocidad Máxima: " + coche.velocidadMaxima);
	        System.out.println("Tipo: " + coche.tipo);
	        System.out.println("Número de Ruedas: " + coche.numeroRuedas);
	        System.out.println("Marca: " + coche.marca);
	        System.out.println("Modelo: " + coche.modelo);
	        coche.andar();
	        coche.frenar();
	        coche.girar();
	        coche.encender();
	        coche.apagar();
	    }

	    public static void consultarAvion() {
	        Avion avion = new Avion(800, "kdb", "707");
	        System.out.println("Velocidad Máxima: " + avion.velocidadMaxima);
	        System.out.println("Tipo: " + avion.tipo);
	        System.out.println("Número de Ruedas: " + avion.numeroRuedas);
	        System.out.println("Marca: " + avion.marca);
	        System.out.println("Modelo: " + avion.modelo);
	        avion.andar();
	        avion.frenar();
	        avion.girar();
	        avion.encender();
	        avion.apagar();
	    }

	    public static void consultarLancha() {
	        Lancha lancha = new Lancha(72, "italica", "modelo2");
	        System.out.println("Velocidad Máxima: " + lancha.velocidadMaxima);
	        System.out.println("Tipo: " + lancha.tipo);
	        System.out.println("Número de Ruedas: " + lancha.numeroRuedas);
	        System.out.println("Marca: " + lancha.marca);
	        System.out.println("Modelo: " + lancha.modelo);
	        lancha.andar();
	        lancha.frenar();
	        lancha.girar();
	        lancha.encender();
	        lancha.apagar();
	    }

	    public static void consultarMoto() {
	        Moto moto = new Moto(167, "Honda", "modelo9");
	        System.out.println("Velocidad Máxima: " + moto.velocidadMaxima);
	        System.out.println("Tipo: " + moto.tipo);
	        System.out.println("Número de Ruedas: " + moto.numeroRuedas);
	        System.out.println("Marca: " + moto.marca);
	        System.out.println("Modelo: " + moto.modelo);
	        moto.andar();
	        moto.frenar();
	        moto.girar();
	        moto.encender();
	        moto.apagar();
	        
	    }
	
	    
}
