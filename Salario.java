
package exlivro;

import java.util.Scanner;

public class Exlivro {

    public static void main(String[] args) {
        float salario, salario2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        salario = teclado.nextFloat();
        salario2 = salario*15/100;
        System.out.println("Seu salario: "+salario);
        System.out.println("Seu novo salario: "+(salario+salario2));
        
       }
    }

