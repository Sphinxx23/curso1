/* Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para
ello, el usuario introducirá por teclado el radio de dicha circunferencia*/
package tema2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ej13 {
	public static void main(String[] args){
		
		//Declaramos variables
		Scanner t = new Scanner (System.in);
		DecimalFormat df =new DecimalFormat("#.####");
		float radio, longit, area;

		//Pedimos datos al usuario
		System.out.println("Introduzca el Radio del circulo ");
		radio = t.nextFloat();

		//Calculos
		longit = 2*radio*(float)Math.PI; //Math pi es el pi con mas decimales y se devuelve en double
		area = (float)Math.pow(radio,2)*3.14F; // Aqui solo uso 3.14 y la F es para pasarlo a float en vez de (float)3.14

		//Salga en pantalla el resultado
		System.out.println("La longitud de circunferencia es " + df.format(longit) + " metros");
		System.out.println("El area del circulo es " + df.format(area) + " metros");
		
	}
}
		