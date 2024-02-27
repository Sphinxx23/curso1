//Cargamos la librería para cargar datos por teclado
package tema1;
import java.util.Scanner; 
public class Ej4 {
	public static void main(String[] args){
		//Inicializamos el uso del teclado
		Scanner t = new Scanner(System.in);
		System.out.println("Pulsa INTRO para continuar");
		//Esperamos pulsación de INTRO
		t.nextLine();
		System.out.println("Gracias por la espera...");
	}

}