// Activitat 05 — Operacions aritmètiques fonamentals

import java.util.Scanner;

public class OperacionsMatematiques {
    public static void main(String[] args) {
        // TODO: llegeix dos enters i mostra suma, resta, producte i divisió:
        //   4 + 2 = 6
        //   4 - 2 = 2
        //   4 * 2 = 8
        //   4 / 2 = 2

         try {

        Scanner teclat = new Scanner(System.in);
        int unitat1 = 0 ;
        System.out.println("1r nombre:");
        unitat1 = teclat.nextInt();

        int unitat2 = 0 ;
        System.out.println("2n nombre:");
        unitat2 = teclat.nextInt();

        int suma = unitat1 - unitat2 ;
        int resta = unitat1 + unitat2 ;
        int multiplicació = unitat1 * unitat2 ;
        int divisió = unitat1 / unitat2 ;
 
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicació: " + multiplicació);
        System.out.println("divisió: " + divisió); 

        }catch(Exception e){
            System.out.println("Error!");
        }




    }
}
