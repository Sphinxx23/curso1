/*
 Modificar el ejercicio del tema anterior sobre la resolución de la ecuación de segundo grado de
modo que compruebe antes de realizar la raíz cuadrado que en su interior no hay un valor
negativo. En ese caso mostraremos el mensaje “No existen soluciones reales”. También
comprobaremos que el denominador no es cero.
 */
package tema3;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ej11 {
    public static void main(String[] args) {
        //Declaramos variables
		Scanner sc = new Scanner (System.in);
		DecimalFormat df =new DecimalFormat("#.##");
		float a, b, c, posit, negat, biff, prim;
		
		//Pedimos datos al usuario
		System.out.println("Introduzca valor de a, b, c ");
		a = sc.nextFloat();		
		b = sc.nextFloat();		
		c = sc.nextFloat();
		
		//Calculos y bifurcacion
                biff = (float)Math.sqrt(Math.pow(b, 2) - 4*a*c);
                
                if (a==0) {
                    prim=-c/b;
                    System.out.println("Es una ecuacion de primer grado");
                    System.out.println("x= " + prim);
                    } else if (biff > 0 ) {                           
                        posit = (float)(-b + biff) / (2*a);
                        negat = (float)(-b - biff) / (2*a);
		
                        // Resultados en pantalla
                        System.out.println("x1 vale: " + df.format(posit));
                        System.out.println("x2 vale: " + df.format(negat));
                    
                    } else {
                         System.out.println("No existen soluciones reales");
                    }
                }
    }

