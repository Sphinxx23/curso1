/*
 13. Realizar un programa en Java que muestre los números entre 1 y 100 salvo los múltiplos de 7,
el programa finalizará antes de que aparezca el número 70. Muestra un mensaje cuando haya
finalizado que diga “El número 70 está prohibido en este programa”
 */
package tema4;
public class Ej13 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i==70) {
                break;
            }           
            if (i%7==0) {
                continue;
            }           
            System.out.println("Numero " + i);
        }
        System.out.println("El número 70 está prohibido en este programa");
    }  
}
