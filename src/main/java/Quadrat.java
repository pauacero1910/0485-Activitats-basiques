// Activitat 04 — Perímetre i àrea d'un quadrat

import java.util.Scanner;

public class Quadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat (enter) i mostra:
        //   Perímetre del quadrat = ...      (costat x 4)
        //   Àrea del quadrat = ...           (costat x costat)



        Scanner teclat = new Scanner(System.in);
        int costat = 0 ;
        System.out.println("Costat: ");
        costat = teclat.nextInt();
        
        System.out.println("Perímetre del quadrat= " + costat * 4);
        System.out.println("Àrea del quadrat= " + costat * costat);









    }
}
