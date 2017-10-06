package maior;

import java.util.Scanner;

public class Maior {

   
    public static void main(String[] args) {
        int num1, num2, num3, maior;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        num1 = teclado.nextInt();
        System.out.print("Digite segundo valor: ");
        num2 = teclado.nextInt();
        System.out.print("Digite o terceiro valor: ");
        num3 = teclado.nextInt();
        maior = 0;
        if(num1 > num2){
            maior = num1;
        }
        if(maior < num2){
            maior = num2;
            
        }
        if(maior > num3){
            maior = maior;
        }
        else{
            maior = num3;
        }
        System.out.println("Maior: "+maior);
    }
    
}
