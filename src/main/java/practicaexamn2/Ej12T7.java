/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn2;

/*
 Realizar un programa en Java que rellene una EED de 3 dimensiones (cubo) de tamaño 3 filas x 3 columnas x 3 de profundidad. 
Posteriormente mostrará el cubo “cortada por cortada”. La rellenaremos con números consecutivos y la mostraremos por pantalla.
1 2 3	10 11 12 	20 21 22	
4 5 6	13 14 15	23 24 25
7 8 9	16 17 18	26 27 28
 
 */
public class Ej12T7 {
    public static void rellenaCubo(int[][][] cubb){
        int xx=1;
        
        for (int prof = 0; prof < cubb.length; prof++) {
            for (int fila = 0; fila < cubb[prof].length; fila++) {
                for (int column = 0; column < cubb[prof][fila].length; column++) {
                    cubb[prof][fila][column]=xx;
                    xx++;
                }
            }
        }
        
    }
    public static String muestraCubo (int[][][] cubb){
        StringBuilder sb= new StringBuilder();
        
        for (int prof = 0; prof < cubb.length; prof++) {
            for (int fila = 0; fila < cubb[prof].length; fila++) {
                for (int column = 0; column < cubb[prof][fila].length; column++) {
                   sb.append(cubb[prof][fila][column] + " ");
                    
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
       int[][][] cubb= new int [3][3][3];
        rellenaCubo(cubb);
        System.out.println(muestraCubo(cubb));
    }
}
