package examen;

public class Vehiculo {
	
	    int velocidadMaxima;
	    String tipo;
	    int numeroRuedas;
	    String marca;
	    String modelo;

	    
	    public Vehiculo(int velocidadMaxima, String tipo, int numeroRuedas, String marca, String modelo) {
	        this.velocidadMaxima = velocidadMaxima;
	        this.tipo = tipo;
	        this.numeroRuedas = numeroRuedas;
	        this.marca = marca;
	        this.modelo = modelo;
	    }

	    
	    public void andar() {
	        System.out.println("El vehículo está andando.");
	    }

	    public void frenar() {
	        System.out.println("El vehículo ha frenado.");
	    }

	    public void girar() {
	        System.out.println("El vehículo está girando.");
	    }

	    public void encender() {
	        System.out.println("El vehículo se ha encendido.");
	    }

	    public void apagar() {
	        System.out.println("El vehículo está apagado apagado.");
	    }
	
	

}
