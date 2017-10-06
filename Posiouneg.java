package posiouneg;

import java.util.Scanner;

public class Posiouneg {

    public static void main(String[] args) {
        int num1; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        num1 = teclado.nextInt();
        if (num1 == 0){
            System.out.println("O valor é igual a ZERO");
        }
            
        if (num1 > 0){
            System.out.println("O valor é POSITIVO");
        }
        else{
            System.out.println("O valor é NEGATIVO");
        }
    }
    
}
