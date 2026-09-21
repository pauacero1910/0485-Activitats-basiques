
import java.util.Scanner;

// Activitat 09 — Preu a pagar amb descompte
// Nota: els decimals s'escriuen amb punt (4.5), no amb coma.
public class PreuAPagar {
    public static void main(String[] args) {
        // TODO: llegeix les unitats (enter), el preu unitari (real) i el
        //       descompte en % (real), i mostra:
        //   El valor a pagar serà: ... euros

        Scanner teclat = new Scanner (System.in);
        int unitats = 0;
        System.out.println("unitats: ");
        unitats = teclat.nextInt(); 

        int preu = 0;
        System.out.println("preu unitari: ");
        preu = teclat.nextInt();

        int descompte = 0;
        System.out.println("descompte: ");
        descompte = teclat.nextInt();

        int preu_total= unitats * preu;

        int descompte_total = (preu_total * descompte) / 100 ;

        int pagar = preu_total - descompte_total ;

        System.out.println("el valor a pagar serà: " + pagar + " euros");





    }
}
