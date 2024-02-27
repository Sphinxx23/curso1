package tema2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ej11 {
	public static void main(String[] args){
		//Declaramos variables
		Scanner t = new Scanner (System.in);
		byte nota1, nota2, nota3;
		float media;
		DecimalFormat df =new DecimalFormat("#.##");
	
		// Pedimos notas al usuario
		System.out.println("Introduzca la nota 1 ");
		nota1 = t.nextByte();	
		System.out.println("Introduzca la nota 2 ");
		nota2 = t.nextByte();	
		System.out.println("Introduzca la nota 3 ");
		nota3 = t.nextByte();
	
		// Realizamos el calculo
		media = (float)(nota1 + nota2 + nota3)/3;		
	
		//Mostrar resultado
		System.out.println("Su media es " + df.format(media));

	}
}