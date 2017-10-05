package maiorvalor;

import java.util.Scanner;

public class Maiorvalor {

    public static void main(String[] args) {
       int num1, num2;
       Scanner teclado = new Scanner(System.in);
       System.out.print("Digite um numero: ");
       num1 = teclado.nextInt();
       System.out.print("Digite segundo numero: ");
       num2 = teclado.nextInt();
       if (num1 > num2){
           System.out.println("Maior: "+num1);
       }
       else{
           System.out.println("Maior: "+num2);
       }
    }
    
}
