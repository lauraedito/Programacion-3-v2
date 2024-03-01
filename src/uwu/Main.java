package uwu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hotel hotel = new Hotel();
		Scanner in = new Scanner(System.in);
		
		hotel.verMatrizHabitaciones();
        int opcion;

        do {
            System.out.println("\nMenú Principal:");
            
            System.out.println("1. Ver registro de huéspedes");
            System.out.println("2. Buscar un huésped");
            System.out.println("3. Reservar habitación");
            System.out.println("4. Check in");
            System.out.println("5. Check out");
            System.out.println("6. Ver disponibilidad de habitaciones");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = in.nextInt();
            in.nextLine(); 
            
            

            switch (opcion) {
                case 1:
                	
                	
                    hotel.verRegistroHuespedes();
                    break;
                case 2:
             //       hotel.buscarHuesped();
                    break;
                case 3:
                  hotel.reservarHabitacion();
                    break;
                case 4:
                  hotel.checkIn();
                    break;
                case 5:
                  hotel.checkOut();
                    break;
                case 6:
                    hotel.verDisponibilidad();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
            

        } while (opcion != 7);

        in.close(); 
		
		
		
		
        
	   

		
		

	}

}
