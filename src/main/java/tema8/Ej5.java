/*
 Implementa un método llamado limpiaRepetidos a la que se le pase una lista de nombres y devuelva una copia sin elementos repetidos. Realizaremos dos versiones, 
una que retorne una colección nueva sin repetidos y otra que modifique la recibida como parámetro.
 */
package tema8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ej5 {
    
    public static void rellenaListaUsuario(List<String> col, int cantidad) {
        Scanner sc = new Scanner(System.in);
        String aux;
        
        for (int i = 0; i < cantidad; i++) {
            aux = sc.nextLine();
            
            col.add(aux);
        }
        
    }
    
    public static String muestraLista(List<String> col) {
        StringBuilder sb = new StringBuilder();
        Iterator it;
        
        it = col.iterator();
        
        while (it.hasNext()) {
            
            sb.append(it.next() + " <----> \n");
            
        }
        
        return sb.toString();
    }
    
    public static List limpiaRepetidos(List listaVieja) {
        List<String> listaNueva = new ArrayList<String>();

        for (int i = 0; i < listaVieja.size(); i++) {
            if (!listaNueva.contains(listaVieja.get(i))) {
                listaNueva.add((String) listaVieja.get(i));
            }
        }
        
        return listaNueva;
    }
    

    
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        List<String> listaNueva = new ArrayList<String>();
        
        rellenaListaUsuario(lista, 10);
        
        listaNueva = limpiaRepetidos(lista);
        
        System.out.println(muestraLista(listaNueva));
        
    }
    
}
