/*Se va a adquirir un préstamo para comprar una casa que tiene un valor de ‘h’ y una tasa de interés
de i (i debe de estar entre 0 y 100) a un plazo de ‘n’ años . Calcule la cuota respectiva a partir de la
siguiente fórmula y muestre la salida con dos decimales:*/
package tema2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ej16{
	public static void main (String[] args){
	
	// Variables
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.##");
	byte n, i;
	float h, r, mNum, mDen, m;
	
	//Datos al usuario
	System.out.println("Introduzca valor de la casa");
	h= sc.nextFloat();
	System.out.println("Introduzca tasa de interes 0-100");
	i = sc.nextByte();
	System.out.println("Introduzca cantidad de años");
	n = sc.nextByte();
	
	//Calculos
	r = (float)i/(100*12);
	mNum = h*r;
	mDen = 1-(float)Math.pow(1+r,-12*n);
	m = mNum/mDen;
	
	//Salida Pantalla
	System.out.println("El total es " + df.format(m));
	
	}
}