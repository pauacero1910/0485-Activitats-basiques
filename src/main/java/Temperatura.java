// Activitat 07 — Convertir Fahrenheit a Celsius

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        // TODO: llegeix una temperatura en graus Fahrenheit (número real)
        //       i mostra-la en graus Celsius:
        //   temperatureC = ((temperatureF - 32) * 5) / 9

        Scanner teclat = new Scanner(System.in);
        double temperatura_fahrenheit = 0;
        System.out.println("temperatura fahrenheit: ");
        temperatura_fahrenheit = teclat.nextDouble();

        double temperatura_celsius = ((temperatura_fahrenheit - 32) * 5) / 9;

        System.out.println("temperatura celsius: " + temperatura_celsius);

    }
}
