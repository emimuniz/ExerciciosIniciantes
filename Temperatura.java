
package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        int temperatura, Celcius;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva a temperatura °C: ");
        temperatura = teclado.nextInt();
        Celcius =  (temperatura*9/5)+32;
        System.out.println(temperatura+"°C = "+Celcius+"F");
                
    }
    
}
