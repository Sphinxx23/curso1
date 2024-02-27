/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        jugarAhorcado("JAVA", 6);
    }

    public static void jugarAhorcado(String palabraSecreta, int intentos) {
        StringBuilder palabraActual = new StringBuilder("_".repeat(palabraSecreta.length()));
        Scanner scanner = new Scanner(System.in);

        while (intentos > 0 && palabraActual.toString().contains("_")) {
            mostrarEstadoJuego(palabraActual.toString(), intentos);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            if (adivinarLetra(palabraSecreta, palabraActual, letra)) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. Pierdes un intento.");
                intentos--;
            }
        }
       

        if (intentos > 0) {
            System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
        } else {
            System.out.println("Lo siento, te has quedado sin intentos. La palabra era: " + palabraSecreta);
        }
    }

    public static boolean adivinarLetra(String palabraSecreta, StringBuilder palabraActual, char letra) {
        boolean acierto = false;

        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraActual.setCharAt(i, letra);
                acierto = true;
            }
        }

        return acierto;
    }

    public static void mostrarEstadoJuego(String palabraActual, int intentosRestantes) {
        System.out.println("Palabra actual: " + palabraActual);
        System.out.println("Intentos restantes: " + intentosRestantes);
    }
}

