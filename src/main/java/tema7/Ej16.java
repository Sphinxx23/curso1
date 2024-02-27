/*
 Diseñar un programa que pida al usuario letras de abecedario una a una (mayúscula o
minúscula), almacene en un tabla irregular y después muestre por pantalla un triángulo como
el que aparece en el ejemplo, el programa finalizará cuando el usuario introduzca un ‘#’. Este
es un ejemplo del tipo: “casos de prueba acotados por caso de prueba especial” del
PROGRAMAME”.
 */
package tema7;

import java.util.Scanner;

public class Ej16 {

    public static char pedirCracter(String msg) {
        Scanner sc = new Scanner(System.in);
        char caract;
        System.out.println(msg);
        caract = sc.nextLine().charAt(0);

        return caract;
    }

    public static char[][] tablaACaracterUsu(char caracterUsuario) {
        char[][] tablaIrreg;
        int carInicial, carFinal, resta;
        char auxx, aux2;

        carFinal = caracterUsuario;

        if (Character.isLowerCase(caracterUsuario)) {
            carInicial = 'a';
            auxx = 'a';
        } else {
            carInicial = 'A';
            auxx = 'A';
        }

        resta = carFinal - carInicial + 1;
        tablaIrreg = new char[resta][];

        for (int i = 0; i < tablaIrreg.length; i++) {
            tablaIrreg[i] = new char[resta];
            aux2 = auxx;
            for (int j = 0; j < tablaIrreg[i].length; j++) {
                tablaIrreg[i][j] = aux2;
                aux2++;
            }
            resta--;
        }
        return tablaIrreg;
    }

    public static String devuelveMatriz(char[][] array) {
        StringBuilder sb = new StringBuilder();
        char aux;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                aux = array[i][j];
                sb.append(aux).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        char caracter;
        char tabla[][];

        do {
            caracter = pedirCracter("Introduce una letra mayuscula o minuscula, introduce # para finalizar");
            if (caracter == '#') {
                System.out.println("Fin de programa");

            } else if (Character.isLetter(caracter)) {

                tabla=tablaACaracterUsu(caracter);
                System.out.println(devuelveMatriz(tabla));

            } else {
                System.out.println("Error de caracter introducido");

            }

        } while (caracter != '#');

    }
}
