
package media;

import java.util.Scanner;


public class Media {

    
    public static void main(String[] args) {
        float n1, n2, n3, media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        n2 = teclado.nextFloat();
        System.out.print("Digite sua terceira nota: ");
        n3 = teclado.nextFloat();
        media = (n1*2+n2*3+n3*5)/10;
        System.out.println("Media Final é: "+media);
    }
    
}
