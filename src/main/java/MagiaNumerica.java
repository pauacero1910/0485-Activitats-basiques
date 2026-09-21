// Activitat 03 — Màgia numèrica

import java.util.Scanner;

public class MagiaNumerica {
    public static void main(String[] args) {
        // TODO: llegeix un número del teclat; multiplica'l per 3, suma-li 6,
        //       divideix entre 3 i resta-li el número inicial. Mostra el resultat:
        //   El resultat és 2



        Scanner teclat = new Scanner(System.in);
        int unitats = 0 ;
        System.out.println("Entra el número de unitats:");
        unitats = teclat.nextInt();

        System.out.println("Resultat: " + (((unitats * 3 + 6) / 3) - unitats));









    }
}
