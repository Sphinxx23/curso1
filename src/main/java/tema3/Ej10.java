/*
 Realizar un programa que simule el juego de la “ruleta rusa”. Para ello, generaremos un
número aleatorio entre [1,6] y le mostraremos al usuario mensajes del tipo: “¿Quieres
dispararte el primer tiro?”, ¿Quieres dispararte el segundo tiro? …”. A medida que el usuario
se vaya disparando doblaremos el dinero ganado por él, partiendo inicialmente de 1000€. Si
coincide el tiro con el número aleatorio el usuario muere y lo pierde todo. Siempre podrá
retirarse en cualquiera de las preguntas de disparo.
NOTA: Puedes darle más tensión al programa, introduciendo un retardo desde que contesta a
la pregunta hasta que se dispara el tiro el usuario (averigua cómo añadir este retardo en el
programa, pero se hace con un Thread.sleep()).
 */
package tema3;
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        int num1, p1, p2, p3, p4, p5, p6;
       
        //datos al usuario
        System.out.println("Quieres jugar a un juego por 1000 euros?\n\n Pulsa cualquier tecla para jugar");
        sc.nextLine();
        
        //bifurcaciones
        num1=(int)(Math.random()*6+1);
        
        if (num1==1) {
            System.out.println("Has muerto");
        } else {
            System.out.println("Usted ha ganado ya 1000 euros. ¿Desea continuar jugando? Introduzca 1 (SI) o 2(NO) ");
            p1=sc.nextInt();
            if (p1==1) {
                if (num1==2) {
                    System.out.println("Has muerto");
                } else {
                    System.out.println("Usted ha duplicado. ¿Desea continuar jugando? Introduzca 1 (SI) o 2(NO) ");
                    p2=sc.nextInt();
                    if (p2==1) {
                        if (num1==3) {
                            System.out.println("Has muerto");
                        } else {
                            System.out.println("Usted ha duplicado. ¿Desea continuar jugando? Introduzca 1 (SI) o 2(NO) ");
                            p3=sc.nextInt();
                            if (p3==1) {
                                if (num1==4) {
                                   System.out.println("Has muerto"); 
                                } else {
                                    System.out.println("Usted ha duplicado. ¿Desea continuar jugando? Introduzca 1 (SI) o 2(NO) ");
                                    p4=sc.nextInt();
                                    if (p4==1) {
                                        if (num1==5) {
                                            System.out.println("Has muerto"); 
                                        } else {
                                            System.out.println("Usted ha duplicado. ¿Desea continuar jugando? Introduzca 1 (SI) o 2(NO) ");
                                            p5=sc.nextInt();
                                            if (p5==1){
                                                if (num1==6) {
                                                    System.out.println("Has muerto");
                                                } 
                                            }else{
                                                System.out.println("Se ha retirado a tiempo con 16000 euros");
                                            }
                                        }    
                                    } else {
                                        System.out.println("Usted se retira con 8000 euros");
                                    }
                                }
                            } else {
                                System.out.println("Usted se retira con 4000 euros");
                            }
                        }
                     } else {
                         System.out.println("Usted se retira con 2000 euros");       
                     }
                }
            } else {
                System.out.println("Usted se retira con 1000 euros");
            }
        }              
    }
}
