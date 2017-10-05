package xadrex;

import java.util.Scanner;

public class Xadrex {

    public static void main(String[] args) {
        int ini, fin, hora;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Inicio do jogo: ");
        ini = teclado.nextInt();
        System.out.print("Final do jogo: ");
        fin = teclado.nextInt();
        if (ini == fin){
            System.out.println("Durou 24horas");
        }
        if(ini > fin){
            System.out.println("Durou "+(24-ini+fin)+"horas");
        }
        else{
            System.out.println("Durou "+(fin - ini)+ "horas");
        }
    }
    
}
