package paradigmas;

public class Persona {
	
	 private String nombre;
	 private int edad;
	 private char genero;
	 private double peso;
	 private double estatura;

	    
	 public Persona(String nombre, int edad, char genero, double peso, double estatura) {
	     this.nombre = nombre;
	     this.edad = edad;
	     this.genero = genero;
	     this.peso = peso;
	     this.estatura = estatura;
	 }

	    
	 public void informacion() {
	     System.out.println("Nombre: " + nombre +
	     "Edad: " + edad + "años" +
	     "Género: " + genero +
	     "Peso: " + peso + " kg"+
	     "Estatura: " + estatura + " m");
	  }

}
