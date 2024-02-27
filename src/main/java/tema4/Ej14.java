/*
 Realizar el juego de “número secreto”. El ordenador generará un número aleatorio entre [1,100], y pedirá al usuario que lo adivine.
El ordenador debe dar al usuario pistas del tipo “mayor” o “menor” por pantalla.
El proceso termina cuando el usuario acierta o se rinde (introduce un número negativo).
 */
package tema4;
import java.util.Scanner;
public class Ej14 {
    public static void main(String[] args) {
        //variables
        int rand, p;
        Scanner sc=new Scanner(System.in);
        
        //Genrerar el num random
        rand=(int)(Math.random()*(100-1)+1);
        System.out.println(rand); //para las pruebas del ejercicio, luego borrar
        
        do{
            System.out.println("adivina el numero entre el 1-100, si introduces un numero negativo, te has rendido");
            p=sc.nextInt();
            if (p>100||p==0){
                System.out.println("El numero se sale de los parametros");
            }else if(p>rand){
                System.out.println("El numero es más pequeño");           
            }else if(p<rand&&p>0){
                System.out.println("El numero es mayor");   
            }else if(p==rand){
                System.out.println("Has acertado el numero!!!!"); 
            }
        }while(p>=0);
        System.out.println("Te has rendido");       
    }
}
