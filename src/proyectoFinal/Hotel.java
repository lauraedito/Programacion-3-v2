package proyectoFinal;

import java.util.Scanner;

public class Hotel {
	private Habitacion[][] matriz;
	private Huesped[] registroHuespedes;

	public Hotel() {
		matriz = new Habitacion[4][5];
		registroHuespedes = new Huesped[50];
		inicializarMatriz();
	}

	public void inicializarMatriz() {
		matriz[0][0] = new Habitacion("Jardín privado", 1, 1200);
		matriz[0][1] = new Habitacion("Jardín privado", 1, 1200);
		matriz[0][2] = new Habitacion("Jardín privado", 1, 1200);
		matriz[0][3] = new Habitacion("Jardín privado", 1, 1200);
		matriz[0][4] = new Habitacion("Jardín privado", 1, 1200);

		matriz[1][0] = new Habitacion("Terraza", 2, 1500);
		matriz[1][1] = new Habitacion("Terraza", 2, 1500);
		matriz[1][2] = new Habitacion("Terraza", 2, 1500);
		matriz[1][3] = new Habitacion("Terraza", 2, 1500);
		matriz[1][4] = new Habitacion("Terraza", 2, 1500);

		matriz[2][0] = new Habitacion("Vista al Alberca", 2, 1800);
		matriz[2][1] = new Habitacion("Vista al Alberca", 2, 1800);
		matriz[2][2] = new Habitacion("Vista al Alberca", 2, 1800);
		matriz[2][3] = new Habitacion("Vista al Alberca", 2, 1800);
		matriz[2][4] = new Habitacion("Vista al Alberca", 2, 1800);

		matriz[3][0] = new Habitacion("Vista al Mar", 2, 2000);
		matriz[3][1] = new Habitacion("Vista al Mar", 2, 2000);
		matriz[3][2] = new Habitacion("Vista al Mar", 2, 2000);
		matriz[3][3] = new Habitacion("Vista al Mar", 2, 2000);
		matriz[3][4] = new Habitacion("Vista al Mar", 2, 2000);
	}

	public void imprimirMatriz() {
		System.out.println("Habitaciones con Precios:");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				Habitacion habitacion = matriz[i][j];
				if (habitacion != null) {
					System.out.printf("Fila: %d, Columna: %d - Nombre: %s, Precio: %.2f%n", i, j,
							habitacion.getNombre(), habitacion.getPrecioNoche());
				}
			}
		}
	}

	public void verRegistroHuespedes() {
		for (Huesped huesped : registroHuespedes) {
			if (huesped != null) {
				System.out.println(huesped.toString());
			}
		}
	}

	public void buscarHuespedPorNombre() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del huésped que desea buscar: ");
		String nombreABuscar = scanner.nextLine();

		boolean encontrado = false;

		for (Huesped huesped : registroHuespedes) {
			if (huesped != null && huesped.getNombreHuesped().equalsIgnoreCase(nombreABuscar)) {
				System.out.println(huesped.toString());
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Huesped no encontrado.");
		}
	}

	public void reservarHabitacion() {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Ingrese la edad del huésped: ");
	    int edadHuesped = scanner.nextInt();

	    if (edadHuesped < 18) {
	        System.out.println("El huésped debe ser mayor de 18 años para reservar una habitación.");
	        return;
	    }

	    scanner.nextLine(); 
	    System.out.println("Ingrese el nombre del huésped: ");
	    String nombreHuesped = scanner.nextLine();

	    System.out.println("Ingrese el teléfono del huésped: ");
	    String telefonoHuesped = scanner.nextLine();

	    System.out.println("Ingrese el email del huésped: ");
	    String emailHuesped = scanner.nextLine();

	    System.out.println("Ingrese el tipo de membresía del huésped (VIP, Cliente frecuente, Regular): ");
	    String tipoMembresiaHuesped = scanner.nextLine();

		scanner.nextLine(); 
		System.out.println("Ingrese la cantidad de noches a reservar: ");
		int cantidadNoches = scanner.nextInt();

		System.out.println("Habitaciones disponibles:");
		verDisponibilidad();
		System.out.println("Ingrese la fila de la habitación a reservar: ");
		int fila = scanner.nextInt();
		System.out.println("Ingrese el número de columna de la habitación a reservar: ");
		int columna = scanner.nextInt();

		
		Huesped nuevoHuesped = new Huesped(nombreHuesped, edadHuesped, telefonoHuesped, emailHuesped, tipoMembresiaHuesped);

	    if (matriz[fila][columna].reservar(nuevoHuesped,cantidadNoches)) {
	        agregarHuespedAlRegistro(nuevoHuesped);

	        System.out.println("Reserva exitosa para " + nombreHuesped + ".");
	    } else {
	        System.out.println("No se pudo realizar la reserva.");
	    }
	}

	private void agregarHuespedAlRegistro(Huesped huesped) {
		for (int i = 0; i < registroHuespedes.length; i++) {
			if (registroHuespedes[i] == null) {
				registroHuespedes[i] = huesped;
				break;
			}
		}
	}

	private void mostrarHabitacionesOcupadasPorHuesped(Huesped huesped) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j].isOcupada() && matriz[i][j].getHuesped() == huesped) {
					System.out.println("Fila: " + i + ", Columna: " + j);
				}
			}
		}
	}

	public void checkIn() {
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese el nombre del huésped que realizará el check-in: ");
		String nombreHuesped = in.nextLine().toLowerCase(); 

		
		Huesped huesped = null;
		for (Huesped h : registroHuespedes) {
			if (h != null && h.getNombreHuesped().toLowerCase().equals(nombreHuesped)) {
				huesped = h;
				break;
			}
		}

		if (huesped != null) {
			System.out.println("Habitaciones disponibles:");
			mostrarDisponibilidad();

			System.out.println("Ingrese el número de fila de la habitación: ");
			int fila = in.nextInt();
			System.out.println("Ingrese el número de columna de la habitación: ");
			int columna = in.nextInt();

			
			if (matriz[fila][columna].isReservada() && matriz[fila][columna].getHuesped() == huesped) {
				
				boolean exitoso = matriz[fila][columna].ocupar();

				if (exitoso) {
					System.out.println("Check-in exitoso para " + huesped.getNombreHuesped());
				} else {
					System.out.println("No se pudo realizar el check-in. La habitación no está reservada.");
				}
			} else {
				System.out.println("La habitación no está reservada por " + huesped.getNombreHuesped());
			}
		} else {
			System.out.println("Huésped no encontrado.");
		}
	}

	public void checkOut() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre del huésped que realizará el check-out: ");
		String nombreHuesped = scanner.nextLine();

		
		Huesped huesped = buscarHuespedPorNombre(nombreHuesped);

		if (huesped != null) {
			System.out.println("Habitaciones ocupadas por " + huesped.getNombreHuesped() + ":");
			mostrarHabitacionesOcupadasPorHuesped(huesped);

			System.out.println("Ingrese el número de fila de la habitación a desocupar: ");
			int fila = scanner.nextInt();
			System.out.println("Ingrese el número de columna de la habitación a desocupar: ");
			int columna = scanner.nextInt();

			if (matriz[fila][columna].isOcupada() && matriz[fila][columna].getHuesped() == huesped) {
				
				boolean exitoso = matriz[fila][columna].desocupar();

				if (exitoso) {
					double costoNoche = matriz[fila][columna].getPrecioNoche();
					double descuento = huesped.descuento(costoNoche);
					int cantidadNoches = matriz[fila][columna].getCantidadNoches(); 
																					
					double costoFinal = (costoNoche * cantidadNoches) - descuento;

					System.out.println("Check-out exitoso para " + huesped.getNombreHuesped());
					System.out.println("Noches reservadas: " + cantidadNoches);
					System.out.println("Costo por noche: " + costoNoche);
					System.out.println("Descuento aplicado: " + descuento);
					System.out.println("Costo final: " + costoFinal);
				} else {
					System.out.println("No se pudo realizar el check-out. La habitación no está ocupada.");
				}
			} else {
				System.out.println("La habitación no está ocupada por " + huesped.getNombreHuesped());
			}
		}
	}

	public void verDisponibilidad() {
		mostrarDisponibilidad();
	}

	private void mostrarDisponibilidad() {
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            Habitacion habitacion = matriz[i][j];
	            if (habitacion != null) {
	                if (!habitacion.isReservada() && !habitacion.isOcupada()) {
	                    System.out.println("Habitación libre - Fila: " + i + ", Columna: " + j);
	                } else if (habitacion.isReservada() && !habitacion.isOcupada()) {
	                    System.out.println("Habitación reservada - Fila: " + i + ", Columna: " + j);
	                } else if (habitacion.isOcupada()) {
	                    System.out.println("Habitación ocupada - Fila: " + i + ", Columna: " + j);
	                }
	            }
	        }
	    }
	}

	private Huesped buscarHuespedPorNombre(String nombre) {
		for (Huesped huesped : registroHuespedes) {
			if (huesped != null && huesped.getNombreHuesped().equalsIgnoreCase(nombre)) {
				return huesped;
			}
		}
		return null;
	}
}
