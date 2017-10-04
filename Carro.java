package carro;

import java.util.Scanner;

public class Carro {

   
    public static void main(String[] args) {
        float valor, percentual, imposto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o valor do carro: ");
        valor = teclado.nextFloat();
        percentual = valor*28/100;
        imposto = valor*45/100;
        System.out.println("Valor do carro: "+valor);
        System.out.println("Valor financinando: "+(valor+percentual+imposto));
    }
    
}
