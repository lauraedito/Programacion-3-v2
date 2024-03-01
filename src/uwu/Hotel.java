package uwu;

import java.util.Scanner;

public class Hotel {

	    private Habitacion[][] habitaciones;
	    private Huesped[] registroHuespedes;

	    public Hotel() {
	        this.habitaciones = new Habitacion[4][5];
	        this.registroHuespedes = new Huesped[20];
	        inicializarHabitaciones();
	    }

	    private void inicializarHabitaciones() {
	        String[] nombres = {"Jardin privado", "Terraza", "Vista al Alberca", "Vista al Mar"};
	        int[] ocupacionMaxima = {1, 2, 2, 2};
	        double[] precioPorNoche = {1200.0, 1500.0, 1800.0, 2000.0};

	        for (int i = 0; i < habitaciones.length; i++) {
	            for (int j = 0; j < habitaciones[i].length; j++) {
	                String nombreHabitacion = nombres[i] + " " + (j + 1);
	                int ocupacionMaximaHabitacion = ocupacionMaxima[i];
	                double precioPorNocheHabitacion = precioPorNoche[i];

	                habitaciones[i][j] = new Habitacion(nombreHabitacion, ocupacionMaximaHabitacion, precioPorNocheHabitacion);
	            }
	        }
	    }
   
	    	      
	   public void verMatrizHabitaciones() {
	        System.out.println("Matriz de Habitaciones:");

	        for (int i = 0; i < habitaciones.length; i++) {
	            for (int j = 0; j < habitaciones[i].length; j++) {
	                if (habitaciones[i][j] != null) {
	                    System.out.println("Fila: " + i + ", Columna: " + j);
	                    System.out.println(habitaciones[i][j]); // Este método debería imprimir la información de la habitación
	                    System.out.println("-----------------------------");
	                }
	            }
	        }
	    }

	    
	    
	    
	    
	        
	   
	    
	    	            public void verRegistroHuespedes() {
	    	                System.out.println("Registro de Huéspedes:");
	    	                for (Huesped huesped : registroHuespedes) {
	    	                    if (huesped != null) {
	    	                        System.out.println(huesped);
	    	                    }
	    	                }
	    	            }
	    	    
	    	    /*public void buscarHuesped() {
	    	    	Scanner scanner = new Scanner(System.in);
	    	    	
	    	        System.out.println("Ingrese el número de índice del huésped a buscar:");
	    	        int indice = scanner.nextInt();

	    	        if (indice >= 0 && indice < registroHuespedes.length) {
	    	            Huesped huesped = registroHuespedes[indice];
	    	            if (huesped != null) {
	    	                System.out.println("Información del Huésped en el índice " + indice + ":");
	    	                System.out.println(huesped);
	    	            } else {
	    	                System.out.println("No hay un huésped en el índice " + indice + ".");
	    	            }
	    	        } else {
	    	            System.out.println("Índice inválido. Debe ser un número entre 0 y " + (registroHuespedes.length - 1) + ".");
	    	        }
	    	    }
	    	    
	    	    */
	    	 
	    	    
	    	    
	    	    public void reservarHabitacion() {
	    	        Scanner in = new Scanner(System.in);

	    	        System.out.println("Ingrese su edad:");
	    	        int edad = in.nextInt();

	    	        if (edad >= 18) {
	    	            System.out.println("Ingrese su nombre:");
	    	            String nombre = in.nextLine();
	    	            in.nextLine();

	    	            System.out.println("Ingrese la fila de la habitación que desea (1-4):");
	    	            int fila = in.nextInt();
	    	            System.out.println("Ingrese la columna de la habitación que desea (1-5):");
	    	            int columna = in.nextInt();

	    	            if (fila >= 1 && fila <= 4 && columna >= 1 && columna <= 5) {
	    	                Habitacion habitacion = habitaciones[fila - 1][columna - 1];

	    	                if (habitacion != null) {
	    	                	
	    	                	 System.out.println("Ingrese la cantidad de noches que se va a quedar:");
	    	                     int cantidadNoches = in.nextInt();
	    	                	 habitacion.reservar(new Huesped(nombre), cantidadNoches);
	    	                } else {
	    	                    System.out.println("La habitación en la fila " + fila + " y columna " + columna + " no existe.");
	    	                }
	    	            } else {
	    	                System.out.println("Fila o columna inválida. Debe ser un número entre 1 y 4 para la fila, y entre 1 y 5 para la columna.");
	    	            }
	    	        } else {
	    	            System.out.println("Lo siento, solo se permiten reservas para huéspedes mayores de 18 años.");
	    	        }

	    	        
	    	        in.close();
	    	       
	    	    }
	    	    
	    	    
	    	  
	    	    
	    	    public void checkIn() {
	    	        Scanner scanner = new Scanner(System.in);
	    	        System.out.println("Ingrese su nombre:");
	    	        String nombre = scanner.next();

	    	        System.out.println("Ingrese la fila de la habitación que reservó (1-4):");
	    	        int fila = scanner.nextInt();
	    	        System.out.println("Ingrese la columna de la habitación que desea (1-5):");
	    	        int columna = scanner.nextInt();

	    	        if (fila >= 1 && fila <= 4 && columna >= 1 && columna <= 5) {
	    	            Habitacion habitacion = habitaciones[fila - 1][columna - 1];

	    	            if (habitacion != null && habitacion.isReservada() && habitacion.getHuesped().getNombre().equals(nombre)) {
	    	                habitacion.ocupar(habitacion.getHuesped());
	    	                System.out.println("Check-in realizado con éxito para la habitación en la fila " + fila + ", columna " + columna + ".");
	    	            } else {
	    	                System.out.println("La habitación en la fila " + fila + ", columna " + columna + " no está reservada para usted o no existe.");
	    	            }
	    	        } else {
	    	            System.out.println("Fila o columna inválida. Debe ser un número entre 1 y 4 para la fila, y entre 1 y 5 para la columna.");
	    	        }

	    	        // Cerrar el scanner
	    	        scanner.close();
	    	    }
	    	    
	    	    
	    	
	    	    
	    	    public void checkOut() {
	    	        Scanner scanner = new Scanner(System.in);
	    	        System.out.println("Ingrese su nombre:");
	    	        String nombre = scanner.next();

	    	        System.out.println("Ingrese la fila de la habitación que ocupó (1-4):");
	    	        int fila = scanner.nextInt();
	    	        System.out.println("Ingrese la columna de la habitación que ocupó (1-5):");
	    	        int columna = scanner.nextInt();

	    	        if (fila >= 1 && fila <= 4 && columna >= 1 && columna <= 5) {
	    	            Habitacion habitacion = habitaciones[fila - 1][columna - 1];

	    	            if (habitacion != null && habitacion.isOcupada() && habitacion.getHuesped().getNombre().equals(nombre)) {
	    	                habitacion.desocupar();
	    	                System.out.println("Check-out realizado con éxito para la habitación en la fila " + fila + ", columna " + columna + ".");
	    	                
	    	                
	    	                System.out.print("¿Qué tipo de cliente eres? (VIP / Cliente frecuente / Ninguna): ");
	    	                String tipoDeMembresia = scanner.next();
	    	                habitacion.getHuesped().setTipoDeMembresia(tipoDeMembresia);
	    	                double descuento = habitacion.getHuesped().calcularDescuento();

	    	                // Aplica el descuento al calcular el cobro
	    	                double cobroConDescuento = habitacion.calcularCobro() * (1 - descuento);
	    	                System.out.println("Cobro con descuento aplicado: $" + cobroConDescuento);
	    	            
	    	            
	    	            } else {
	    	            	
	    	            	
	    	            	
	    	                System.out.println("La habitación en la fila " + fila + ", columna " + columna + " no está ocupada por usted o no existe.");
	    	            }
	    	        } else {
	    	            System.out.println("Fila o columna inválida. Debe ser un número entre 1 y 4 para la fila, y entre 1 y 5 para la columna.");
	    	        }

	    	        
	    	        scanner.close();
	    	    }
	    	    
	    	    
	    	    
	    	    public void verDisponibilidad() {
	    	        System.out.println("Habitaciones Ocupadas:");
	    	        for (int i = 0; i < habitaciones.length; i++) {
	    	            for (int j = 0; j < habitaciones[i].length; j++) {
	    	                if (habitaciones[i][j] != null && habitaciones[i][j].isOcupada()) {
	    	                    System.out.println("Habitación " + ((i * 5) + j + 1) + " - " + habitaciones[i][j].getNombre());
	    	                }
	    	            }
	    	        }

	    	        System.out.println("\nHabitaciones Desocupadas:");
	    	        for (int i = 0; i < habitaciones.length; i++) {
	    	            for (int j = 0; j < habitaciones[i].length; j++) {
	    	                if (habitaciones[i][j] != null && !habitaciones[i][j].isOcupada()) {
	    	                    System.out.println("Habitación " + ((i * 5) + j + 1) + " - " + habitaciones[i][j].getNombre());
	    	                }
	    	            }
	    	        }
	    	    }

	    






	            
	    
	    
	    
	    


	    
	

}
