package area;

import java.util.Scanner;

public class Area {

    
    public static void main(String[] args) {
        float base,altura,area;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva a base do retangulo: ");
        base = teclado.nextFloat();
        System.out.print("Escreva a altura do retagulo: ");
        altura = teclado.nextFloat();
        area = base*altura;
        System.out.println("A area do retangulo: "+area);
    }
    
}
