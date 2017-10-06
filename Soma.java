package soma;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        int num1, num2, num3, maior, maior2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        num1 = teclado.nextInt();
        System.out.print("Digite segundo valor: ");
        num2 = teclado.nextInt();
        System.out.print("Digite terceiro valor: ");
        num3 = teclado.nextInt();
        maior = 0;
        maior2 = 0;
        if(num1 > num2){
            maior = num1;
        }
        if(num2 > num1){
            maior = num2;
        }
        if(maior > num3){
            maior = maior;
        }
        else{
            maior = num3;
        }
        
        if(maior > num1){
            maior2 = num1;
        }
        if(maior > num2){
            maior2 = num2;
        }
        if(maior2 > num3){
            maior2 = num3;
        }
        if(maior2 < num1){
            maior2 = num1;
        }
        System.out.println("Soma: "+(maior+maior2));
                
        
        
}
    
}
