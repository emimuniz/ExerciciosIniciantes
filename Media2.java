
package media2;

import java.util.Scanner;


public class Media2 {

    
    public static void main(String[] args) {
        float n1, n2, media;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite sua primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        n2 = teclado.nextFloat();
        media = (n1+n2)/2;
        if (media >= 6){
            System.out.println("Aprovado");
        }
        if (media < 6){
            System.out.println("Reprovado");
    }
      
        System.out.println("Media Final = "+media);
    }
}
