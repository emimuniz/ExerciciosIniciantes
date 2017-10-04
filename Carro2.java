
package carro2;

import java.util.Scanner;

public class Carro2 {
   
    public static void main(String[] args) {
        float salario,vtotal, vrecebido;
        int qtvendas;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        salario = teclado.nextFloat();
        System.out.print("Digite quantas vendas realizas: ");
        qtvendas = teclado.nextInt();
        System.out.print("Valor total das vendas: ");
        vtotal = teclado.nextFloat();
        vrecebido = salario+qtvendas*60+vtotal*5/100;
        System.out.println("Valor recebido: "+vrecebido);
        
        
    }
    
}
