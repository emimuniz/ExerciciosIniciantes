
package crescente;

import java.util.Scanner;

public class Crescente {
    
    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        num1 = teclado.nextInt();
        System.out.print("Digite outro valor: ");
        num2 = teclado.nextInt();
        if (num1 < num2){
            System.out.println(num1);
            System.out.println(num2);
            
        }
        else{
            System.out.println(num2);
            System.out.println(num1);
        }
    }
    
}
