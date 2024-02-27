/*Realiza un programa que realice justo lo contrario que el anterior. Es decir pedirá al usuario un
número de segundos y debe devolver cuantos días, horas y minutos son*/
package tema2;
import java.util.Scanner;
public class Ej19{
	public static void main(String[] args){
		//Variables
		int segundos, dCalc, hCalc, mCalc, modD, modH, modM, seg;
		Scanner sc= new Scanner(System.in);
		
		//Datos al usuario
		System.out.println("Indique un numero de segundos");
		segundos=sc.nextInt();
		
		//Calculos
		dCalc= segundos/86400;
		modD=segundos%86400;
		
		hCalc=modD/3600;
		modH=modD%3600;
		
		mCalc=modH/60;
		modM=modH%60;
		
		seg = modM;
		
		//Sacar datos pantalla
		System.out.println("Son " + dCalc + " dias");
		System.out.println("Son " + hCalc + " horas");
		System.out.println("Son " + mCalc + " minutos");
		System.out.println("Son " + seg + " segundos");
	}
}