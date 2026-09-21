// Activitat 12 — Monedes mínimes

import java.util.Scanner;

public class MonedesMinimes {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims i mostra quantes monedes de
        //       cada tipus calen (200, 100, 50, 20, 10, 5, 2, 1), una per línia.
        //       Per a l'entrada 123:
        //   0 monedes de 2 euros
        //   1 monedes d'1 euro
        //   0 monedes de 50 cèntims
        //   1 monedes de 20 cèntims
        //   0 monedes de 10 cèntims
        //   0 monedes de 5 cèntims
        //   1 moneda de 2 cèntims
        //   1 moneda de 1 cèntims

        Scanner teclat = new Scanner(System.in);
        int centims = 0 ;
        System.out.println("Entra el número de cèntims:");
        centims = teclat.nextInt();

        int monedes2euros = centims / 200;
        centims = centims % 200;
        System.out.println(monedes2euros + " monedes de 2 euros");
        
        int monedes1euro = centims / 100;
        centims = centims % 100;
        System.out.println(monedes1euro + " monedes d'1 euro");

        int monedes50 = centims / 50;
        centims = centims % 50;
        System.out.println(monedes50 + " monedes de 50 cèntims");
        
        int monedes20 = centims / 20;
        centims = centims % 20;
        System.out.println(monedes20 + " monedes de 20 cèntims");

        int monedes10 = centims / 10;
        centims = centims % 10;
        System.out.println(monedes10 + " monedes de 10 cèntims");

        int monedes5 = centims / 5;
        centims = centims % 5;
        System.out.println(monedes5 + " monedes de 5 cèntims");

        int monedes2 = centims / 2;
        centims = centims % 2;
        System.out.println(monedes2 + " monedes de 2 cèntims");

        int monedes1 = centims / 1;
        System.out.println(monedes1 + " monedes de 1 cèntim");

    }
}
