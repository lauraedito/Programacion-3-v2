
public class Arbol {
	
	/* Atributos o elementos*/
    private Nodo raiz;
    private int altura, cantidad, peso;
    
    /* Contructores */
    public Arbol( int valor ) {
        this.raiz = new Nodo( valor );
    }
 
    public Arbol( Nodo raiz ) {
        this.raiz = raiz;
    }
 
    /* Setters y Getters */
    public Nodo getRaiz() {
        return raiz;
    }
 
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    private void addNodo( Nodo nodo, Nodo raiz ) {
        /* 2.- Partiendo de la ra�z preguntamos: Nodo == null ( o no existe ) ? */
        if ( raiz == null ) {
            /* 3.- En caso afirmativo X pasa a ocupar el lugar del nodo y ya 
             * hemos ingresado nuestro primer dato.*/
            this.setRaiz(nodo);
        }
        else {
            /* 4.- En caso negativo preguntamos: X < Nodo */
            if ( nodo.getValor() < raiz.getValor() ) {
                /* 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 * que acabamos de preguntar y repetimos desde el paso 2 
                 * partiendo del Nodo al que acabamos de visitar */
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nodo);
                    raiz.getHojaIzquierda().setPadre(raiz);//asignar el nodo padre al nodo
                }
                else {
                    addNodo( nodo , raiz.getHojaIzquierda());
                }
            }
            else {
                /* 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 * cual hicimos con el caso anterior repetimos desde el paso 2
                 * partiendo de este nuevo Nodo.*/
                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                    raiz.getHojaDerecha().setPadre(raiz);//
                }
                else {
                    addNodo( nodo, raiz.getHojaDerecha());
                }
            }
        }
    }
 
    public void addNodo( Nodo nodo ) {//metodo principal agregar nodo
        this.addNodo( nodo , this.raiz );
       
    }
    /*---------------------RECORRIDO INORDEN----------------------*/
    private void recorridoInorden(Nodo nodo){
    	if(nodo.getHojaIzquierda()!= null){
    		recorridoInorden(nodo.getHojaIzquierda());
    	}
    	System.out.print(nodo.getValor()+" ");
    	
    	if(nodo.getHojaDerecha()!= null){
    		recorridoInorden(nodo.getHojaDerecha());
    	}
    }
    
    public void inorden(){
    	recorridoInorden(this.raiz);
    }
    
    /*---------------------RECORRIDO PREORDEN----------------------*/
    private void recorridoPreorden(Nodo nodo){
        if(nodo != null){
            System.out.print(nodo.getValor()+" "); 
            recorridoPreorden(nodo.getHojaIzquierda()); 
            recorridoPreorden(nodo.getHojaDerecha()); 
        }
    }
    public void preorden(){
        recorridoPreorden(this.raiz);
    }
    
    
    
    
    /*---------------------RECORRIDO POSTORDEN----------------------*/
    private void recorridoPostorden(Nodo nodo){
        if(nodo != null){
            recorridoPostorden(nodo.getHojaIzquierda()); // Recorrer el subárbol izquierdo
            recorridoPostorden(nodo.getHojaDerecha()); // Recorrer el subárbol derecho
            System.out.print(nodo.getValor()+" "); // Visitar el nodo actual
        }
    }

    public void postorden(){
        recorridoPostorden(this.raiz);
    }

    
    /*---------------------NIVEL O ALTURA----------------------*/
    private void altura(Nodo visitado, int nivel) {
        if (visitado != null) {
        	System.out.println("\nnivel:"+nivel + " visitado: "
        						+visitado.getValor());
        	altura(visitado.getHojaIzquierda(), nivel + 1);
        	
            if (nivel > altura) {
                altura = nivel;
            }
            altura(visitado.getHojaDerecha() , nivel + 1);
        }
    }

    public int altura() {
        altura = 0;
        altura(this.raiz, 0);
        return altura;
    }

    /*---------------------PESO----------------------*/
    int contador = 0;
    private void peso(Nodo visitado, int nivel) {
    	if (visitado != null) {
    		
        	peso(visitado.getHojaIzquierda(), nivel + 1);
        		
        	peso(visitado.getHojaDerecha() , nivel + 1);
           
        	contador++;
        	System.out.println("Contador: " + contador);
            }
        }

    public int peso() {
        peso = 0;
        peso(this.raiz, 0);
        return contador;
    }

    /*---------------------BUSQUEDA DE UN NODO----------------------*/
    /*Consiste en encontrar determinado dato dentro del �rbol, recorriendo cada uno de los nodos. 
     * La b�squeda de un nodo comienza en el nodo ra�z y sigue estos pasos:
		1.- El dato buscado se compara con el dato del nodo ra�z.
		2.- Si el dato buscado es mayor que el dato ra�z, la b�squeda se reanuda en el sub�rbol derecha.
		Si el dato buscado es menor que el dato ra�z, la b�squeda se reanuda con el sub�rbol izquierdo.
		3.- Si los datos son iguales, la b�squeda se detiene y se muestra un mensaje que diga:
		"El nodo X si existe en el arbol.", en caso contrario decir que "No existe el nodo".*/
   

	

    
    public boolean removeNodo( int datoEliminar) {
        /*buscar el nodo a eliminar*/
    	Nodo nodo;
    	
    	if(){//si encuentra el nodo, lo elimina.
    		/* Creamos variables para saber si tiene hijos izquierdo y derecho */
            boolean tieneNodoDerecha = (nodo.getHojaDerecha() != null) ? true : false;/*IF TERNARIO*/
            boolean tieneNodoIzquierda = nodo.getHojaIzquierda() != null ? true : false;
         
            /* Verificamos los 3 casos diferentes y llamamos a la funci�n correspondiente */
         
            /* Caso 1: No tiene hijos */
            if (!tieneNodoDerecha && !tieneNodoIzquierda) {/*! negacion - NOT*/
                return removeNodoCaso1( nodo );
            }
         
            /* Caso 2: Tiene un hijo a la derecha y el otro no */
            if ( tieneNodoDerecha && !tieneNodoIzquierda ) {
                return removeNodoCaso2( nodo );
            }
         
            /* Caso 2: Tiene un hijo a la izquierda y el otro no */
            if ( !tieneNodoDerecha && tieneNodoIzquierda ) {
                return removeNodoCaso2( nodo );
            }
         
            /* Caso 3: Tiene ambos hijos */
            if ( tieneNodoDerecha && tieneNodoIzquierda ) {
                return removeNodoCaso3( nodo );
            }
    	}
        return false;
    }
    
    private boolean removeNodoCaso1( Nodo nodo ) {
        /* lo que hay que hacer es borrar el nodo y establecer el apuntador de su padre a 
         * nulo.
     	Guardemos los hijos del padre temporalmente para saber cu�l de sus hijos hay que 
         * eliminar*/
        Nodo hijoIzquierdo = nodo.getPadre().getHojaIzquierda();
        Nodo hijoDerecho = nodo.getPadre().getHojaDerecha();
     
        if ( hijoIzquierdo == nodo ) {
        	System.out.println("borrar Nodo");
            nodo.getPadre().setHojaIzquierda( null );//"ELIMINAMOS EL NODO".
            nodo.setPadre(null);
            return true;
        }
     
        if ( hijoDerecho == nodo) {
            nodo.getPadre().setHojaDerecha( null );//"ELIMINAMOS EL NODO".
            return true;
        }
     
        return false;
    }
    
    private boolean removeNodoCaso2( Nodo nodo ) {
        /* Borrar el Nodo y el sub�rbol que ten�a pasa a ocupar su lugar.
    	Guardemos los hijos del padre temporalmente para saber cu�l de sus hijos hay que 
         * eliminar*/
        Nodo hijoIzquierdo = nodo.getPadre().getHojaIzquierda();
        Nodo hijoDerecho = nodo.getPadre().getHojaDerecha();
        System.out.println("hijoIzquierdo:"+hijoIzquierdo);
        System.out.println("hijoDerecho:"+hijoDerecho);
        
        /*Buscamos el hijo existente del nodo que queremos eliminar*/
        Nodo hijoActual = nodo.getHojaIzquierda() != null ? 
               nodo.getHojaIzquierda() : nodo.getHojaDerecha();
        System.out.println("hijoActual:"+hijoActual);
        System.out.println("Padre:"+nodo.getPadre());
        
        if ( hijoIzquierdo == nodo ) {
            nodo.getPadre().setHojaIzquierda( hijoActual );
     
            /* Eliminando todas las referencias hacia el nodo */
            hijoActual.setPadre(nodo.getPadre());
            nodo.setHojaDerecha(null);
            nodo.setHojaIzquierda(null);
            nodo = null;//eliminar nodo
            
            return true;
        }
     
        if ( hijoDerecho == nodo) {
            nodo.getPadre().setHojaDerecha( hijoActual );
     
            /* Eliminando todas las referencias hacia el nodo */
            hijoActual.setPadre(nodo.getPadre());
            nodo.setHojaDerecha(null);
            nodo.setHojaIzquierda(null);
            System.out.println("HojaDerecha:"+nodo.getHojaDerecha());
            System.out.println("HojaIzquierda:"+nodo.getHojaIzquierda());
            System.out.println("Nodo antes eliminar:"+ nodo);
            nodo = null;//eliminar nodo
            System.out.println("Nodo despues eliminar:"+ nodo);
            
     
            return true;
        } 
     
        return false;
    }
    
    private boolean removeNodoCaso3( Nodo nodo ) {
        /* Tomar el hijo izquierdo del Nodo que queremos eliminar */
        Nodo nodoMasALaIzquierda = recorrerIzquierda( nodo.getHojaIzquierda() );
        
        if ( nodoMasALaIzquierda != null ) {
            /*Reemplazamos el valor del nodo que queremos eliminar por el nodo que 
             * encontramos*/
            nodo.setValor( nodoMasALaIzquierda.getValor() );
            /*Eliminar este nodo de las formas que conocemos ( caso 1, caso 2 )*/
            removeNodo( nodoMasALaIzquierda );
            return true;
        }
        return false;
    }
     
    /* Recorrer de forma recursiva hasta encontrar el nodo m�s a la derecha */
    private Nodo recorrerIzquierda(Nodo nodo) {
        if (nodo.getHojaDerecha() != null) {
            return recorrerIzquierda( nodo.getHojaDerecha());
        }
        return nodo;
    }
    
	public static void main(String[] args) {
		Nodo n1 = new Nodo(4);
		Nodo n2 = new Nodo(12);
		Nodo n3 = new Nodo(9);
		
		Arbol arbolito = new Arbol(6);
		arbolito.addNodo(new Nodo (3));
		arbolito.addNodo(new Nodo (10));
		arbolito.addNodo(new Nodo (5));
		arbolito.addNodo(n1);
		arbolito.addNodo(n2);
		arbolito.addNodo(n3);
	
		System.out.println("INORDEN: ");arbolito.inorden();
		
		arbolito.removeNodo(10);
		
		System.out.println("\n INORDEN: ");arbolito.inorden();
		
//		System.out.println("\nAltura: "+ arbolito.altura());
		
		//System.out.println("\nPeso: "+ arbolito.peso());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
