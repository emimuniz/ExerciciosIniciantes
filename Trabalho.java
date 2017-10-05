package trabalho;

import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {
        float horas,salarioh,salariot;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite horas trabalhadas: ");
        horas = teclado.nextFloat();
        System.out.print("Digite seu salario em horas: ");
        salarioh = teclado.nextFloat();
        salariot = (horas*salarioh)*20;
        if (horas > 40){
            System.out.println(salariot*5/100+salariot);
        }
        else{
            System.out.println(salariot);
        }
    }
    
}
