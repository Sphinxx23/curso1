/*
 Realizar una función que almacene en un array los 20 primeros números de la siguiente secuencia. Posteriormente los muestra por pantalla
3 6 7 5 10 11 7 14 15 9 18 19 …

 */
package tema7;

public class Ej6 {
    public static final int TAMAÑO = 30;
    
    public static StringBuilder cadenaLogica() {
        StringBuilder sb= new StringBuilder();
        int a1 = 3, a2 = 6;

        sb.append(a1).append(" ");
        sb.append(a2).append(" ");

        for (int i = 2; i < TAMAÑO/3; i++) {

            a1 = a1 + 2;
            a2++;
             sb.append(a2).append(" ");
            
             sb.append(a1).append(" ");
            
            a2 = a2 + 3;
             sb.append(a2).append(" ");

        }

        return sb;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb = (cadenaLogica());
        System.out.println(sb);

    }
}
