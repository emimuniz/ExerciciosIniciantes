
package troca;

import java.util.Scanner;

public class Troca {

    public static void main(String[] args) {
        int A,B;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Troca de Valores");
        System.out.print("A: ");
        A = teclado.nextInt();
        System.out.print("B: ");
        B = teclado.nextInt();
        B = A - B;
        A = A - B;
        B = A + B;
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        
        
        
                
     
    }
    
}
