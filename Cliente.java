package cliente;

import java.util.Scanner;

public class Cliente {

  
    public static void main(String[] args) {
        float conta, saldo, debito, credito, saldoatual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite numero da sua conta: ");
        conta = teclado.nextFloat();
        System.out.print("Digite o saldo da conta: ");
        saldo = teclado.nextFloat();
        System.out.print("Digite o valor do debito: ");
        debito = teclado.nextFloat();
        System.out.print("Digite o valor do credito: ");
        credito = teclado.nextFloat();
        saldoatual = saldo - debito + credito;
        if (saldo >= 0){
            System.out.println("Saldo Positivo");
        }
        else{
             System.out.println("Saldo Negativo");
        }
           System.out.println("Saldo Atual: "+saldoatual);
    }
    
}
