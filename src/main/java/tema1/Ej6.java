//Cargamos la librería para cargar datos por teclado
package tema1;
import java.util.Scanner; 
public class Ej6 {
	public static void main(String[] args){
		//Inicializamos el uso del teclado
		Scanner t = new Scanner(System.in);
		System.out.println("Pulsa INTRO para ver un triángulo");
		//Esperamos pulsación de INTRO
		t.nextLine();
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("********");
		System.out.println("Pulsa INTRO para ver un cuadrado");
		t.nextLine();
		System.out.println("*******");
		System.out.println("*******");
		System.out.println("*******");
		System.out.println("*******");
		System.out.println("Pulsa INTRO para ver un círculo");
		t.nextLine();
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println(" *******");
		System.out.println("  *****");
	}

}