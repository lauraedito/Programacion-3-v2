package paradigmas;

import java.util.Scanner;

public class NumeroVocal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        System.out.println("Digite la palabra:");
        String palabra  = in.next();
        
        int vocales=0;
        for(int i = 0;i < palabra.length();i++) {
        	char letra = Character.toLowerCase(palabra.charAt(i));
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        System.out.println("Tienes " + vocales + " vocales");
        
	}

}
