package tema1;
import java.util.Scanner;
public class Ej8 {
	public static void main(String[] args){
		Scanner t = new Scanner (System.in);
		String name;

		//Pedimos datos al usuario
		System.out.println("Indique Su Nombre");
		name = t.nextLine();

		System.out.println("Bienvenido " +  name);
	}
}