
package positivonegativo;

import java.util.Scanner;


public class Positivonegativo {

    public static void main(String[] args) {
        float num1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero positivo ou negativo: ");
        num1 = teclado.nextFloat();
        if (num1 > 0){
            System.out.println("Positivo");
        }
        if (num1 < 0){
            System.out.println("Negativo");
        }
        
    }
    
}
