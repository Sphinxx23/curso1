//Cargamos la librería para cargar datos por teclado
package tema1;
import java.util.Scanner; 
public class Ej5 {
	public static void main(String[] args){
		//Inicializamos el uso del teclado
		Scanner t = new Scanner(System.in);
		System.out.println("Pulsa INTRO para ver tu nombre");
		//Esperamos pulsación de INTRO
		t.nextLine();
		System.out.println("Te llamas Raúl");
	}

}