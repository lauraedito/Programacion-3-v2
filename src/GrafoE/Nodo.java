package GrafoE;
import java.util.ArrayList;
import java.util.List;


public class Nodo {
	
	 int dato;
	 List<Arista> aristas;
	 int orden;
	 
	    Nodo(int dato) {
	        this.dato = dato;
	        this.aristas = new ArrayList<>();
	        this.orden = -1; 
	    }

	 
	 public void agregarArista(Nodo destino, int peso) {
	        Arista nuevaArista = new Arista(this,destino, peso);
	        aristas.add(nuevaArista);
	    }

}
