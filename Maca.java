package maca;

import java.util.Scanner;

public class Maca {

    public static void main(String[] args) {
        float quantidade;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de maça: ");
        quantidade = teclado.nextFloat();
        if (quantidade >= 12){
            System.out.println("Valor a pagar: "+(quantidade*1.00));
        }
        if (quantidade < 12 ){
            System.out.printf("Valor a pagar: %.2f \n",(quantidade*1.30));
        }
    }
    
}
