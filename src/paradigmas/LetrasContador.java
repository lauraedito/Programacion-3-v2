package paradigmas;
import java.util.Scanner;

public class LetrasContador {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        System.out.println("Digite la palabra:");
        String palabras  = in.next();
        
        int letras=0;
        for(int i = 0;i < palabras.length();i++) {
        
		if(Character.isLetter(palabras.charAt(i))) {
			letras++;
			
		}

	}
        System.out.println("Tienes "+ letras +" letras");
        
   }
}