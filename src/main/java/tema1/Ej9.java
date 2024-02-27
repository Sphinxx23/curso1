package tema1;
import java.util.Scanner;
public class Ej9 {
	public static void main(String[] args){
		Scanner t = new Scanner (System.in);
		byte resta;
		short actual, nac;		

		//Pedimos datos al usuario
		System.out.println("Indique El Año Actual");
		 actual = t.nextShort();

		System.out.println("Indique Su Año de Nacimiento");
		 nac = t.nextShort();

		//Realizamos el cálculo
		resta = (byte)(actual - nac);

		System.out.println("Usted tiene " + resta + " años");
	}
}