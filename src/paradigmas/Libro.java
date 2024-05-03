package paradigmas;

public class Libro {
	private String titulo;
    private String autor;
    private String editorial;
    private int añoPublicacion;
    private String pais;
    
    public Libro(String titulo, String autor, String editorial, int añoPublicacion, String pais) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.pais = pais;
    }
    
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("País: " + pais);
    }
    
    public boolean esBestSeller() {
        
        return añoPublicacion > 2015;
    }

}
