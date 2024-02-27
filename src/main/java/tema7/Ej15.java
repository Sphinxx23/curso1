/*
 Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas
(números enteros) del primer, segundo y tercer trimestre de un grupo (leer todas las notas de
cada trimestre a la vez y luego splitear). Debemos mostrar al final la nota media del grupo por
cada trimestre (con decimales), y la media del alumno (con decimales) que se encuentra en la
posición pos (dicha posición se leerá por teclado). Se deben validar todas las entradas.
 */
package tema7;

import java.util.Scanner;

public class Ej15 {

    public static String pedirCadena(String msg) {
        String cadena;
        Scanner sc = new Scanner(System.in);

        System.out.println(msg);
        cadena = sc.nextLine();

        return cadena;
    }

    public static String[] splitLenghtCadena(String msggg, String msg) {
        String[] arraString;
        String cadena;
        do {
            cadena=pedirCadena(msggg);
            arraString = cadena.split(" ");
            if (arraString.length != 5) {
                System.out.println(msg);
            }
        } while (arraString.length != 5);

        return arraString;
    }

    public static void cuboNotas(int[][][] cubo, int grupo, int evaluacion, String[] cadSplit) {
       int contSplit=0;
        for (int i = 0; i < cubo.length; i++) {
            cubo[i][evaluacion][grupo] =Integer.parseInt(cadSplit[contSplit]);
            contSplit++;
        }
    }
    
    public static void mediaEvaluaciones (int[][][]cubo, int grupos, int trimestres, int alumnos){
       
        float suma, media, cont;
        for (int gru = 0; gru < grupos; gru++) {
            for (int trim = 0; trim < trimestres; trim++) {
                cont=0;
                suma=0;
                for (int al = 0; al < cubo.length; al++) {
                    suma=suma+cubo[al][trim][gru];
                    cont++;
                }
                media=suma/cont;
                System.out.println("La media del trimestre " + (trim+1) + " del grupo " + (gru+1) + " es: " + media);
            }
            
        }
    }
    
    public static void mediaAlumno (int[][][]cubo, int grupo, int alumno){
        float suma=0, media, cont=0;
        grupo=grupo-1;
        alumno=alumno-1;
        
        for (int trimestres = 0; trimestres < cubo[alumno].length; trimestres++) {
            suma=suma+cubo[alumno][trimestres][grupo];
            cont++;
        }
        media=suma/cont;
        System.out.println("La media del alumno numero " + (alumno+1) + " del grupo " + (grupo+1) + " es: " + media);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenaNotas;
        int grupNumTot, grupAlumn, alumnNum;
        int[][][] cubo;
        String[]cadSplit;

        System.out.println("Introduce el numero total de grupos ");
        grupNumTot = sc.nextInt();
        cubo = new int[5][3][grupNumTot];

        for (int grupo = 0; grupo < grupNumTot; grupo++) {
            for (int evaluacion = 0; evaluacion < 3; evaluacion++) {             
                cadSplit=splitLenghtCadena("Introduce las notas de la " + (evaluacion + 1) + " evaluacion de los 5 alumnos, separadas por espacios", "Error, tu cadena contiene mas de 5 notas");
                cuboNotas(cubo, grupo, evaluacion, cadSplit);
            }
        }
        mediaEvaluaciones(cubo, grupNumTot, 3, 5);
        
        System.out.println("Introduzca el grupo y el alumno del cual quieres consultar su media ");
        grupAlumn=sc.nextInt();
        alumnNum=sc.nextInt();
        mediaAlumno(cubo, grupAlumn, alumnNum);
        
    }
}
