package tema1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ej7 {
	public static void main(String[] args){
		Scanner t = new Scanner (System.in);

	//PEDIMOS DATOS AL USUARIO
		System.out.println("Indique cantidad de dinero");
		float din = t.nextFloat();

	// Para cambiar la cantidad de decimales
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("Total21%: " + df.format(din * 1.21) + " euros");
		System.out.println("Total 10% : " + df.format(din * 1.1) + " euros");
		System.out.println("Total 4%: " + df.format(din * 1.04) + " euros");
	}
}