public class Nodo {
	
	 /* Declaraciones de variables o elementos */
    private int valor;
 
    private Nodo padre;
    private Nodo hojaIzquierda;
    private Nodo hojaDerecha;
 
    /* Constructor */
    public Nodo(int valor) {
        this.valor = valor;
        this.padre= null;
        this.hojaIzquierda=null;
        this.hojaDerecha=null;
    }
 
    /* Setters y Getters */
    public void setValor(int valor) {
        this.valor = valor;
    }
 
    public int getValor() {
        return valor;
    }
 
    public Nodo getPadre() {
        return padre;
    }
 
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
 
    public Nodo getHojaIzquierda() {
        return hojaIzquierda;
    }
 
    public void setHojaIzquierda(Nodo hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }
 
    public Nodo getHojaDerecha() {
        return hojaDerecha;
    }
 
    public void setHojaDerecha(Nodo hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
}
