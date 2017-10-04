
package voto;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Voto {

    public static void main(String[] args) {
        int ano, voto;
        Calendar cal = GregorianCalendar.getInstance();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        ano = teclado.nextInt();
        voto = cal.get(Calendar.YEAR) - ano;
        if (voto >= 16){
            System.out.println("Pode votar");
        }
        else{
            System.out.println("Nao pode votar");
        }
                
    }
    
}
