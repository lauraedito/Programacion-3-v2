package proyectoFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.imprimirMatriz();
        boolean bucle = true;
        Scanner in = new Scanner(System.in);

        while (bucle) {
            System.out.println("Hotel Geeko:\n" 
            				+ "1- Ver registro de huéspedes \n" 
            				+ "2- Buscar un huésped\n"
            				+ "3- Reservar habitación\n" 
            				+ "4- Check-in\n" 
            				+ "5- Check-out\n" 
            				+ "6- Ver disponibilidad de habitaciones\n" 
            				+ "7- Salir");

            while (!in.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero para la opción: ");
                in.next(); 
            }
            int opcion = in.nextInt();
            in.nextLine(); 

            switch (opcion) {
                case 1:
                    hotel.verRegistroHuespedes();
                    break;

                case 2:
                    hotel.buscarHuespedPorNombre();
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

                case 7:
                    bucle = false;
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }

        in.close();
    }
}
