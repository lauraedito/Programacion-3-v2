package GrafoE;

public class Main {

	public static void main(String[] args) {
		
	        Grafo grafo = new Grafo();

	         
	        Nodo nodo1 = new Nodo(1);
	        Nodo nodo2 = new Nodo(2);
	        Nodo nodo3 = new Nodo(3);
	        Nodo nodo4 = new Nodo(4);
	        Nodo nodo5 = new Nodo(5);
	        Nodo nodo6 = new Nodo(6);

	        
	        nodo1.agregarArista(nodo6, 2);
	        nodo1.agregarArista(nodo4, 2);
	        nodo1.agregarArista(nodo2, 7);
	        nodo4.agregarArista(nodo2, 4);
	        nodo2.agregarArista(nodo5, 1);
	        nodo2.agregarArista(nodo3, 4);
	        nodo6.agregarArista(nodo2, 1);
	        nodo3.agregarArista(nodo5, 3);
	        nodo6.agregarArista(nodo3, 3);
	        
	       
	        grafo.nodos.add(nodo1);
	        grafo.nodos.add(nodo2);
	        grafo.nodos.add(nodo3);
	        grafo.nodos.add(nodo4);
	        grafo.nodos.add(nodo5);
	        grafo.nodos.add(nodo6);
	        
	        
	        
	        Nodo nodoFuente = nodo1;
	        grafo.imprimirOrden(nodoFuente); 


	}

}
