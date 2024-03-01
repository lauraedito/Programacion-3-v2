package paradigmas;

import java.util.Scanner;

public class Letra {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        
	        System.out.println("Digite la letra:");
	        char letra = in.next().charAt(0);
	        
	        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
	            System.out.println("Es una vocal.");
	        } else {
	            System.out.println("No es vocal.");
	        }
	    }

}
