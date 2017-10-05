package empresa;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        float salario,vendas;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do seu salario: ");
        salario = teclado.nextFloat();
        System.out.print("Digite o valor das vendas: ");
        vendas = teclado.nextFloat();
        if (vendas <= 1500){
            System.out.println("Salario: "+(salario+vendas*3/100));
        }
        else{
            System.out.println("Salario: "+(salario+vendas*5/100));
        }
        
    }
    
}
