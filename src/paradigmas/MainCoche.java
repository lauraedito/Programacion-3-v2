package paradigmas;

public class MainCoche {

	public static void main(String[] args) {
		 Coche coche = new Coche("Toyota", "Corolla", "Rojo", "Trasera", "Gasolina");
		 coche.encender();
	        coche.avanzar();
	        System.out.println("El coche está avanzando: " + coche.avanzando);

	        


	}

}
