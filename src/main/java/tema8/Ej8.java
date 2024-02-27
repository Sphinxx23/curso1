/*
 Para ir a ver la película "Dolor y Gloria" hay dos filas de espectadores. 
Un acomodador es el encargado de dejar entrar a la gente. Sus instrucciones son simples:
"Tiene que dejar entrar siempre al espectador que tenga más edad de entre los dos espectadores que están esperando primero en cada una de las dos colas,
si tienen la misma edad, las personas de la fila 1 tiene preferencia". Ten en cuenta, que si acomodas a un espectador el NO elegido sigue estando en la otra
cola esperando para volver a ser comparado nuevamente. Almacena previamente en las dos colas 5 enteros en cada una que representan las edades de dichos espectadores.

Ejemplo.
Si COLA 1 tiene espectadores con las edades siguientes: 18, 12, 15, 19, 13
Si COLA 2 tiene espectadores con las edades siguientes: 20, 13, 17, 18, 23
Se debe mostrar por pantalla: 20, 18, 13, 17, 18, 23, 12, 15, 19 y 13
Entrada

18, 12, 15, 19, 13
20, 13, 17, 18, 23
Salida
20, 18, 13, 17, 18, 23, 12, 15, 19 y 13

 */
package tema8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej8 {

    public static String compararEdades(List lista1, List lista2) {
        StringBuilder sb = new StringBuilder();
        int aux, aux1, mayor, vueltas = 0;
        vueltas = lista1.size() + lista2.size();
 
        sb.append("Cola Final: ");

        for (int i = 0; i < vueltas; i++) {

            if (lista1.isEmpty()) {
                mayor = (int) lista2.get(0);
                lista2.remove(0);

            } else if (lista2.isEmpty()) {
                mayor = (int) lista1.get(0);
                lista1.remove(0);

            } else {

                aux = (int) lista1.get(0);
                aux1 = (int) lista2.get(0);

                if (aux == aux1) {
                    mayor = (int) lista1.get(0);
                    lista1.remove(0);
                } else {
                    mayor = aux > aux1 ? aux : aux1;

                    if (aux > aux1) {
                        lista1.remove(0);
                    } else {
                        lista2.remove(0);
                    }
                }

            }
            sb.append(mayor + " ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> listta1 = new ArrayList<Integer>();
        ArrayList<Integer> listta2 = new ArrayList<Integer>();

        listta1.add(24);
        listta1.add(21);
        listta1.add(13);
        
        listta2.add(29);
        listta2.add(4);
        listta2.add(7);
        
        System.out.println(compararEdades(listta1, listta2));

    }
}
