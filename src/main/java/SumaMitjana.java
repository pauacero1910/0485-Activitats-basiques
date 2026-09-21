// Activitat 08 — Suma i mitjana de 4 enters

import java.util.Scanner;

public class SumaMitjana {
    public static void main(String[] args) {
        // TODO: llegeix 4 enters i mostra:
        //   Suma = ...
        //   Mitjana = ...      (recorda que la mitjana pot tenir decimals)


        Scanner teclat = new Scanner(System.in);

        int primer_nombre = 0 ;
        System.out.println("Primer nombre: ");
        primer_nombre = teclat.nextInt();

        int segon_nombre = 0 ;
        System.out.println("Segon nombre: ");
        segon_nombre = teclat.nextInt();

        int tercer_nombre = 0 ;
        System.out.println("Tercer nombre: ");
        tercer_nombre = teclat.nextInt();

        int quart_nombre = 0 ;
        System.out.println("Quart nombre: ");
        quart_nombre = teclat.nextInt();

        int suma = primer_nombre + segon_nombre + tercer_nombre + quart_nombre;
        double mitjana = suma / 4.0;

        System.out.println("Suma = " + suma);
        System.out.println("Mitjana = " + mitjana);

    }
}
