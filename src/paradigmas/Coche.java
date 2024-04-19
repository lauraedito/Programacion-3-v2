package paradigmas;

public class Coche {
	
	 String marca;
	 String modelo;
	 String color;
	 String traccion;
	 String motor;
	 boolean encendido;
	 boolean girando;
	 boolean avanzando;
	 boolean retrocediendo;
	 
	 

	    
	 public Coche(String marca, String modelo, String color, String traccion, String motor) {
	 this.marca = marca;
	 this.modelo = modelo;
	 this.color = color;
	 this.traccion = traccion;
	 this.motor = motor;
	 this.encendido = false;
	 this.girando = false;
	 this.avanzando = false;
	 this.retrocediendo = false;
	 
	 }

	    
	 public void encender() {
	     encendido = true;
	 }

	 public void apagar() {
	     encendido = false;
	 }

	 public void girar() {
	     girando = true;
	 }

	 public void detenerGiro() {
	     girando = false;
	 }

	 public void avanzar() {
	     if (encendido && !retrocediendo) {
	         avanzando = true;
	     }
	 }

	 public void retroceder() {
	     if (encendido && !avanzando) {
	         retrocediendo = true;
	     }
	 }

	 public void detenerMovimiento() {
	    avanzando = false;
	    retrocediendo = false;
	 }
	


}
