package GrafoE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Grafo {
	
	List<Nodo> nodos;
    

    Grafo() {
    	this.nodos = new ArrayList<>();
    }

   
    
    
    public void dijkstra(Nodo fuente) {
    	
        Set<Nodo> visitados = new HashSet<>();
        for (Nodo nodo : nodos) {
            if (nodo != fuente) {
                nodo.orden = Integer.MAX_VALUE;
            }
        }
        
        fuente.orden = 0;

        while (true) {
        	
            Nodo nodoActual = null;
            int menorOrden = Integer.MAX_VALUE;

            
            for (Nodo nodo : nodos) {
                if (!visitados.contains(nodo) && nodo.orden < menorOrden) {
                    nodoActual = nodo;
                    menorOrden = nodo.orden;
                }
            }

            if (nodoActual == null) 
            	break; 

            visitados.add(nodoActual);

            
            for (Arista arista : nodoActual.aristas) {
                Nodo vecino = arista.destino;
                int nuevaOrden = nodoActual.orden + arista.peso;
                if (nuevaOrden < vecino.orden) {
                    vecino.orden = nuevaOrden;
                }
            }
        }
    }

    
    public void imprimirOrden(Nodo fuente) {
        dijkstra(fuente);
        for (Nodo nodo : nodos) {
            System.out.println("Nodo: " + nodo.dato + ", camino corto: " + nodo.orden);
        }
    }

}
