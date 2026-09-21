// Activitat 06 — Perímetre i àrea d'un rectangle

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit (enters) i mostra:
        //   Perímetre del rectangle = ...    (costatGran x 2 + costatPetit x 2)
        //   Àrea del rectangle = ...         (costatGran x costatPetit)

         Scanner teclat = new Scanner(System.in);
        int costat_gran = 0 ;
        System.out.println("Costat gran: ");
        costat_gran = teclat.nextInt();

        int costat_petit = 0 ;
        System.out.println("Costat petit: ");
        costat_petit = teclat.nextInt();

        int perímetre_rctangle = costat_gran * 2 + costat_petit * 2;
        int àrea_rectangle = costat_gran * costat_petit;

        System.out.println("perímetre rectangle: " + perímetre_rctangle);
        System.out.println("àrea rectangle: " + àrea_rectangle);


    









    }
}
