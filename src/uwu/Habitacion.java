package uwu;

import java.util.Scanner;

public class Habitacion {
	

	    private String nombre;
	    private int ocupacionMaxima;
	    private double precioPorNoche;
	    private boolean reservada;
	    private int cantidadNoches;
	    private boolean ocupada;
	    private Huesped huesped;

	    public Habitacion(String nombre, int ocupacionMaxima, double precioPorNoche) {
	        this.nombre = nombre;
	        this.ocupacionMaxima = ocupacionMaxima;
	        this.precioPorNoche = precioPorNoche;
	        this.reservada = false;
	        this.cantidadNoches = 0;
	        this.ocupada = false;
	        this.huesped = null;
	    }

	   
	    	
	    public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getOcupacionMaxima() {
			return ocupacionMaxima;
		}

		public void setOcupacionMaxima(int ocupacionMaxima) {
			this.ocupacionMaxima = ocupacionMaxima;
		}

		public double getPrecioPorNoche() {
			return precioPorNoche;
		}

		public void setPrecioPorNoche(double precioPorNoche) {
			this.precioPorNoche = precioPorNoche;
		}

		public boolean isReservada() {
			return reservada;
		}

		public void setReservada(boolean reservada) {
			this.reservada = reservada;
		}

		public int getCantidadNoches() {
			return cantidadNoches;
		}

		public void setCantidadNoches(int cantidadNoches) {
			this.cantidadNoches = cantidadNoches;
		}

		public boolean isOcupada() {
			return ocupada;
		}

		public void setOcupada(boolean ocupada) {
			this.ocupada = ocupada;
		}

		public Huesped getHuesped() {
			return huesped;
		}


		public void setHuesped(Huesped huesped) {
			this.huesped = huesped;
			
			
		
		}
		
		
		public boolean reservar(Huesped huesped, int cantidadNoches) {
		    if (!ocupada && !reservada && huesped != null && cantidadNoches > 0) {
		        this.huesped = huesped;
		        this.reservada = true;
		        this.ocupada = true; 
		        this.cantidadNoches = cantidadNoches;
		        return true;
		    } else {
		        System.out.println("No se puede realizar la reserva en esta habitación.");
		        return false;
		    }
		}

	
		
		
	    public boolean ocupar(Huesped huesped) {
	        if (reservada && !ocupada && this.huesped == huesped) {
	            this.ocupada = true;
	            System.out.println("Check-in exitoso. La habitación ha sido ocupada.");
	            return true;
	        } else {
	            System.out.println("No se puede realizar el check-in en esta habitación.");
	            return false;
	        }
	    }

	    public boolean desocupar() {
	        if (ocupada) {
	            this.ocupada = false;
	            System.out.println("Check-out exitoso. La habitación ha sido desocupada.");
	            return true;
	        } else {
	            System.out.println("La habitación no está ocupada.");
	            return false;
	        }
	    }
	    
	    public double calcularCobro() {
	        return cantidadNoches * precioPorNoche;
	    }

	    @Override
	    public String toString() {
	        return "Nombre: " + nombre 
	        		+ "\nOcupación Máxima: " + ocupacionMaxima 
	        		+ "\nPrecio por Noche: $" + precioPorNoche 
	        		+ "\nReservada: " + reservada 
	        		+ "\nCantidad de Noches: " + cantidadNoches 
	        		+ "\nOcupada: " + ocupada 
	        		+ "\nHuesped:\n" + huesped;
	    }
	


}
