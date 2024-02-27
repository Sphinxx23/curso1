/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos;
import java.util.Scanner;

public class HundirBarcos {
    static char[][] tablero;
    static int tamanoTablero;
    static int barcosRestantes;

    // Método principal para jugar
    public static void main(String[] args) {
        inicializarJuego(5, 3);
        inicializarTablero();
        colocarBarcos();
        jugar();
    }

    // Método para inicializar el juego
    public static void inicializarJuego(int tamano, int barcos) {
        tamanoTablero = tamano;
        barcosRestantes = barcos;
        tablero = new char[tamanoTablero][tamanoTablero];
        
    }

    // Método para inicializar el tablero
    public static void inicializarTablero() {
        for (int i = 0; i < tamanoTablero; i++) {
            for (int j = 0; j < tamanoTablero; j++) {
                tablero[i][j] = '~';  // '~' representa el agua
            }
        }
    }

    // Método para colocar los barcos en posiciones aleatorias
    public static void colocarBarcos() {
        for (int i = 0; i < barcosRestantes; i++) {
            int fila = (int) (Math.random() * tamanoTablero);
            int columna = (int) (Math.random() * tamanoTablero);

            // Verificar si la casilla ya está ocupada por otro barco
            while (tablero[fila][columna] == 'B') {
                fila = (int) (Math.random() * tamanoTablero);
                columna = (int) (Math.random() * tamanoTablero);
            }

            tablero[fila][columna] = 'B';  // 'B' representa un barco
        }
    }

    // Método principal para jugar
    public static void jugar() {
        Scanner scan = new Scanner(System.in);

        while (barcosRestantes > 0) {
            mostrarTablero();
            System.out.print("Ingresa la fila: ");
            int fila = scan.nextInt();
            System.out.print("Ingresa la columna: ");
            int columna = scan.nextInt();

            if (fila < 0 || fila >= tamanoTablero || columna < 0 || columna >= tamanoTablero) {
                System.out.println("Coordenadas inválidas. Intenta de nuevo.");
                continue;
            }

            verificarImpacto(fila, columna);
        }

    
        mostrarTablero();
        System.out.println("¡Felicidades! Hundiste todos los barcos.");
    }

    // Método para verificar si hubo un impacto y actualizar el tablero
    public static void verificarImpacto(int fila, int columna) {
        if (tablero[fila][columna] == 'B') {
            System.out.println("¡Impacto! Hundiste un barco.");
            tablero[fila][columna] = 'X';  // 'X' representa un impacto
            barcosRestantes--;
        } else if (tablero[fila][columna] == 'X') {
            System.out.println("Ya habías impactado en esta posición. Intenta de nuevo.");
        } else {
            System.out.println("Agua. No hay barco en esta posición.");
            tablero[fila][columna] = 'O';  // 'O' representa un intento fallido
        }
    }

    // Método para mostrar el estado actual del tablero
    public static void mostrarTablero() {
        System.out.println("Tablero:");
        for (int i = 0; i < tamanoTablero; i++) {
            for (int j = 0; j < tamanoTablero; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

