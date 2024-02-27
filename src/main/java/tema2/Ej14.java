/*Dado un polinomio de segundo grado:
ax² + bx +c = 0
Crea un programa que pida los coeficientes a, b y c, después calcula las dos soluciones de la
ecuación de segundo grado. Los coeficientes pueden ser números reales.*/
package tema2;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ej14 {
	public static void main(String[] args){
		
		//Declaramos variables
		Scanner sc = new Scanner (System.in);
		DecimalFormat df =new DecimalFormat("#.###");
		float a, b, c, posit, negat;
		
		//Pedimos datos al usuario
		System.out.println("Introduzca valor de a ");
		a = sc.nextFloat();
		System.out.println("Introduzca valor de b");
		b = sc.nextFloat();
		System.out.println("Introduzca valor de c");
		c = sc.nextFloat();
		
		//Calculos
		posit = (float)(-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		negat = (float)(-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		
		// Resultados en pantalla
		System.out.println("x1 vale: " + df.format(posit));
		System.out.println("x2 vale: " + df.format(negat));
	}
}