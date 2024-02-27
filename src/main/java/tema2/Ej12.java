/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y
peras. Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos)
de cada trimestre para cada fruta. La aplicación mostrará el importe total sabiendo que el
precio del kilo de manzanas está fijado en 2.35€ y el kilo de peras está fijado en 1.95€ */

package tema2;
import java.util.Scanner;
public class Ej12 {
	public static void main(String[] args){
		
		//Declaramos variables
		Scanner t = new Scanner (System.in);
		short manzana1, pera1, manzana2, pera2, manzana3, pera3;
		float totmanz, totpera, total;

		//Pedimos datos al usuario
		System.out.println("Kilos de manzanas vendidos en el trimestre 1");
		manzana1 = t.nextShort();
		System.out.println("Kilos de peras vendidos en el trimestre 1");
		pera1 = t.nextShort();

		System.out.println("Kilos de manzanas vendidos en el trimestre 2");
		manzana2 = t.nextShort();
		System.out.println("Kilos de peras vendidos en el trimestre 2");
		pera2 = t.nextShort();

		System.out.println("Kilos de manzanas vendidos en el trimestre 3");
		manzana3 = t.nextShort();
		System.out.println("Kilos de peras vendidos en el trimestre 3");
		pera3 = t.nextShort();

		//Realizamos calculos
		totmanz = (manzana1+manzana2+manzana3)*(float)2.35;
		totpera = (pera1+pera2+pera3)*(float)1.95;
		total = (totmanz+totpera);

		//Mostramos resultado
		System.out.println("El beneficio total es "+ total  + " euros");		



	}
}