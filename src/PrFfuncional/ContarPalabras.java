package PrFfuncional;

public class ContarPalabras {

	public static Object[] obtenerLongitud(String frase) {
        
        String[] palabras = frase.split("\\s+");
        
       
        String[][] resultado = new String[palabras.length][2];
        
        
        for (int i = 0; i < palabras.length; i++) {
            resultado[i][0] = palabras[i]; 
            resultado[i][1] = String.valueOf(palabras[i].length()); 
        }
        
       
        return new Object[] {resultado, palabras.length};
    }
    
    public static void main(String[] args) {
        String frase = "El sol es caliente";
        Object[] resultado = obtenerLongitud(frase);
        String[][] palabrasInfo = (String[][]) resultado[0];
        int cantidadPalabras = (int) resultado[1];
        
        
        System.out.println("Palabras\t\tLongitud");
        for (String[] palabraInfo : palabrasInfo) {
            System.out.println(palabraInfo[0] + "\t\t" + palabraInfo[1]);
        }
        
        System.out.println("\nCantidad de palabras en la frase: " + cantidadPalabras);
    }

}
