/*Necesitamos una aplicación que calcule la media aritmética de dos notas enteras. Realiza
un ejercicio en Java que solvente dicho problema. Hay que tener en cuenta que la media
puede contener decimales.*/
package tema1;
import java.util.Scanner;
public class Ej10 {
	public static void main(String[] args){
	Scanner t = new Scanner (System.in);

	//Declaramos variables
	byte nota1, nota2;
	float media;

	// Pedimos notas al usuario
	System.out.println("Introduzca la nota 1 ");
	nota1 = t.nextByte();

	System.out.println("Introduzca la nota 2 ");
	nota2 = t.nextByte();

	// Realizamos el calculo
	media = (float)(nota1 + nota2)/2;

	//Mostrar resultado
	System.out.println("Su media es " + media);

	}
}