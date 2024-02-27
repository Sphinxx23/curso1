/*
 Realizar una función que calcule y devuelva el área o el volúmen de un cilindro, según se
especifique en un menú. Para distinguir un caso de otro se le pasará un número 1 (para el
área) y un 2 (para el volumen).
 */
package tema5;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Ej6 {
    // Funcion 3 estrellas

    /**
     *En este metodo puedes meter un mensaje personalizado, recoge un dato real y comprueba que sea mayor a 0 
     * @param msg recoge un dato de tipo float
     * @return devuelve un real mayor a 0
     */
    public static float leerReal(String msg){
        float real;
        Scanner sc = new Scanner(System.in);
                
        do{
            System.out.println(msg);
            real=sc.nextFloat();
        }while(real<=0);
        
        return real;       
    }
   
    
    public static int leerConMascara(String msg, String mascara){
        int num;
        Scanner sc=new Scanner(System.in);
        do {            
            System.out.println(msg);
            num=sc.nextInt();           
        } while (!Pattern.matches(mascara, num+""));
        return num;
    }
    
    /**
     *Realiza el area de un cilindro
     * @param altura recoge la altura, dato de tipo real
     * @param radio recoge el radio, dato de tipo real
     * @return devuelve un valor de tipo real
     */
    public static float areaCilindro (float altura, float radio) {
         float area;
         
         area = 2*(float)(Math.PI) * radio * (altura+radio);
         return area;
    }
    
     /**
     *Realiza el volumen de un cilindro
     * @param altura recoge la altura, dato de tipo real
     * @param radio recoge el radio, dato de tipo real
     * @return devuelve un valor de tipo real
     */
    public static float volumenCilindro (float altura, float radio) {
         float volumen;
         
         volumen =(float)(Math.PI)* radio * radio * altura;
         return volumen;
    }
    
    
    
    public static void main(String[] args) {
        float altura, radio;
        int num;
        
        altura=leerReal("Introduzca una altura (positivo): ");
        radio=leerReal("Introduzca una radio (positivo): ");
        num=leerConMascara("Introduzca 1-Area y 2-Volumen: ", "[12]");
        
        if (num==1) {
            System.out.println("Area es:" + areaCilindro(altura, radio));
        } else {
            System.out.println("Volumen es:" + volumenCilindro(altura, radio));
        }
       
        
    }
}
