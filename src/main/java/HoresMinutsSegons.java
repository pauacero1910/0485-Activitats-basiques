// Activitat 10 — Hores, minuts i segons

import java.util.Scanner;

public class HoresMinutsSegons {
    public static void main(String[] args) {
        // TODO: llegeix un nombre de segons i mostra:
        //   Hores: ...
        //   Minuts: ...
        //   Segons: ...


        Scanner teclat = new Scanner(System.in);
        int segons = 0 ;
        System.out.println("Nombre de segons: ");
        segons = teclat.nextInt();

        int minuts = segons / 60;
        int hores = minuts / 60;

        System.out.println("Hores: " + hores);
        System.out.println("Minuts: " + minuts);
        System.out.println("Segons: " + segons);

    

    








    }
}
