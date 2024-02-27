/*
 Diseñar un programa que muestre el resultado del producto de los 10 primeros números
impares.
 */
package tema4;
public class Ej6 {
    public static void main(String[] args) {   
        int a=1;
        for (int cont=1; cont<=19; cont=cont+2) {
            a = a*cont;           
        }
        System.out.println(a);
    }
}
