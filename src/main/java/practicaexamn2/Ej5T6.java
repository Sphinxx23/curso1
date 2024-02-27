/*
 Diseñar el juego de acierta la contraseña. 
Un usuario introduce una cadena y otro debe adivinarla. 
Cuando realice más de 3 intentos le daremos una pista (el número de caracteres), 
cuando lleve 3 más le daremos la otra pista (los dos últimos caracteres de la contraseña) a 
partir de aquí le mostraremos mayor o menor alfabéticamente.
 */
package practicaexamn2;

import java.util.Scanner;

public class Ej5T6 {

    public static String pista1(String contra) {
        StringBuilder sb = new StringBuilder();
        sb.append("El numero de letras de la contraseña es: " + contra.length());
        return sb.toString();
    }

    public static String pista2(String contra, String auxStr) {
        StringBuilder sb = new StringBuilder();
        int auxInt;
        sb.append("La contraseña que estas intentando adivinar esta ");

        auxInt = contra.compareToIgnoreCase(auxStr);

        sb.append(auxInt < 0 ? " antes " : " despues ");

        sb.append(" en el diccionario que el intento que acabas de realizar");
        return sb.toString();
    }
    public static String pista3(String contra){
        StringBuilder sb= new StringBuilder();  
        sb.append("Las ultimas dos letras de la contraseña son ");
        sb.append(contra.substring(contra.length()-2));        
        return sb.toString();
    }

    public static void juego(String contra) {
        Scanner sc = new Scanner(System.in);
        String cntrIntento;
        int cont = 0;

        System.out.println("Intenta adivinar la contraseña");
        cntrIntento = sc.nextLine();

        while (!cntrIntento.equalsIgnoreCase(contra)) {

            System.out.println("Intento erroneo");
            cont++;

            if (cont == 4) {
                System.out.println(pista1(contra));

            } else if (cont == 8) {
                System.out.println(pista3(contra));
                System.out.println(pista2(contra, cntrIntento));
            } else if (cont > 7) {
                System.out.println(pista2(contra, cntrIntento));
            }

            System.out.println("Intenta adivinar la contraseña");
            cntrIntento = sc.nextLine();

        }

        System.out.println("Enhorabuena has acertado la contraseña");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contra;

        System.out.println("Introduzca la contraseña a adivinar");
        contra = sc.nextLine();

        juego(contra);
    }
}
