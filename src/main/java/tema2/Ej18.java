/*Realiza un programa en Java que permita la conversión de días, horas y minutos a segundos. El
programa pedirá estos tres valores y mostrará por pantalla el número de segundos tras realizar la
conversión.*/
package tema2;
import java.util.Scanner;
public class Ej18{
	public static void main(String[] args){
		//Variables
		int dias, horas, minutos, dCalc, hCalc, mCalc, total;
		Scanner sc= new Scanner(System.in);
		
		//Datos al usuarioo
		System.out.println("Introduzca numero de Dias");
		dias= sc.nextInt();
		System.out.println("Introduzca numero de Horas");
		horas= sc.nextInt();
		System.out.println("Introduzca numero de Minutos");
		minutos= sc.nextInt();
		
		//Calculos
		dCalc= dias*86400;
		hCalc=horas*3600;
		mCalc=minutos*60;
		total = dCalc + hCalc + mCalc;
		
		//Salida pantalla
		System.out.println("El total de segundos en los dias indicados son " + dCalc);
		System.out.println("El total de segundos en las horas indicados son " + hCalc);
		System.out.println("El total de segundos en los minutos indicados son " + mCalc);
		System.out.println("El total de segundos en general es " + total);
	}
}