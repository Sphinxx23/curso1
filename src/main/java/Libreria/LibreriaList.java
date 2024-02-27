/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PcBox
 */
public class LibreriaList {
    
    //Rellena una lista de strings metidos uno a uno por el usuario
     public static void rellenaListaUsuario(List<String> col, int cantidad) {
        Scanner sc = new Scanner(System.in);
        String aux;
        
        for (int i = 0; i < cantidad; i++) {
            aux = sc.nextLine();
            
            col.add(aux);
        }
        
    }
     
     //Muestra la lista por pantalla
     public static String muestraLista(List<String> col) {
        StringBuilder sb = new StringBuilder();
        Iterator it;
        
        it = col.iterator();
        
        while (it.hasNext()) {
            
            sb.append(it.next() + " <----> \n");
            
        }
        
        return sb.toString();
    }
     
     //Limpia los repetidos de una lista y devuelve una lista nueva (es lo mismo que pasar a un set)
      public static List limpiaRepetidos(List listaVieja) {
        List<String> listaNueva = new ArrayList<String>();

        for (int i = 0; i < listaVieja.size(); i++) {
            if (!listaNueva.contains(listaVieja.get(i))) {
                listaNueva.add((String) listaVieja.get(i));
            }
        }
        
        return listaNueva;
    }
      
      //Compara los numeros de dos listas y recoge el mayor, posteriormente lo elimina para seguir comparando
      //si los dos son iguales recoge el de lista1, si alguna de las listas esta vacia regoge los nums de la otra
      //tal cual aparecen, finaliza cuando las dos estan vacias
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

      
}
