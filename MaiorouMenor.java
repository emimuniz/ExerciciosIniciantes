package maioroumenor;

import java.util.Scanner;

public class MaiorouMenor {

    public static void main(String[] args) {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        valor = teclado.nextInt();
        if (valor > 10){
            System.out.println("É MAIOR QUE 10!");
        }
        if (valor < 10){
            System.out.println("NÃO É MAIOR QUE 10!");
        }
        
        
    }
    
}
