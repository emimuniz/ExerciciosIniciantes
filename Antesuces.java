package antesuces;

import java.util.Scanner;

public class Antesuces {

    public static void main(String[] args) {
        int num1,sucessor, antecessor;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = teclado.nextInt();
        sucessor = num1 + 1;
        antecessor = num1 - 1;
        System.out.println("O numero digitado foi: "+num1);
        System.out.println("O sucessor é: "+sucessor+ " e o antecessor: "+antecessor);    
        
        
    }
    
}
