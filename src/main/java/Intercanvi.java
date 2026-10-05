// Activitat 11 — Intercanvi de dues variables

import java.util.Scanner;

public class Intercanvi {
    public static void main(String[] args) {
        // TODO: llegeix dos enters (a i b), intercanvia'ls fent servir una
        //       variable auxiliar i mostra'ls després de l'intercanvi:
        //   a = ...
        //   b = ...

        Scanner teclat = new Scanner(System.in);
        int a = 0 ;
        System.out.println("A: ");
        a = teclat.nextInt();

        int b = 0 ;
        System.out.println("B: ");
        b = teclat.nextInt();

        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
