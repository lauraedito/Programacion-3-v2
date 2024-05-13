package PrFfuncional;

import java.util.ArrayList;
import java.util.List;

public class progFuncional2 {

	public static List<Integer> numerosPares(List<Integer> lista) {
        List<Integer> pares = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        return pares;
    }

    public static int sumarElementos(List<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll(" ", "").toLowerCase();
        StringBuilder p = new StringBuilder(cadena).reverse();
        return cadena.equals(p.toString());
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(40);
        numeros.add(21);
        numeros.add(32);
        numeros.add(4);
        
        String palindromo = "Arriba la birra";
        String noPalindromo = "Hola mundo";

        System.out.println("Números pares: " + numerosPares(numeros));
        System.out.println("Suma de elementos: " + sumarElementos(numeros));
        System.out.println("¿Es Palíndromo? " + "{"+palindromo+"}" +" " + esPalindromo(palindromo) );
        System.out.println("¿Es Palíndromo? " + "{" +noPalindromo +"}"+ " " + esPalindromo(noPalindromo) );
    }
}
