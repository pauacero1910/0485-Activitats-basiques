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

        int hores = segons / 3600;
        int minuts = (segons % 3600) / 60;
        int segonsRestants = segons % 60;

        System.out.println("Hores: " + hores);
        System.out.println("Minuts: " + minuts);
        System.out.println("Segons: " + segonsRestants);

    }
}
