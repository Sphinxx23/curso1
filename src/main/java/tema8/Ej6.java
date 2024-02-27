/*
 Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios.
Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por pantalla las palabras que estén repetidas. A continuación, mostrar las que no lo estén.


 */
package tema8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ej6 {

    public static String[] separarCadenaIntroducida(String msg) {
        String[] arrayy;
        Scanner sc = new Scanner(System.in);
        String aux;
        
        System.out.println(msg);
        aux = sc.nextLine();

        arrayy = aux.split(" ");
        return arrayy;

    }

    public static void arrayToList(List<String> lista, String[] arrayy) {
        String aux;
        for (int i = 0; i < arrayy.length; i++) {
            aux = arrayy[i];
            lista.add(aux);
        }
    }

    public static String muestraColeccion(Collection col) {
        StringBuilder sb = new StringBuilder();
        Iterator it = col.iterator();

        while (it.hasNext()) {
            sb.append(it.next() + " ---- ");

        }

        return sb.toString();

    }

    public static String sacaNoRepetidos(List<String> listaGeneral) {
            String aux, aux2;
            int cont = 0;
            StringBuilder sb=new StringBuilder();
                
            for (int i = 0; i < listaGeneral.size(); i++) {
                aux = listaGeneral.get(i);
    
                if (i == listaGeneral.size()) {
                    break;
                }
    
                for (int j = 0; j < listaGeneral.size(); j++) {
    
                    aux2 = listaGeneral.get(j);
    
                    if (aux.equals(aux2)) {
                        cont++;
                    }
    
                }
                if (cont <2) {
                    sb.append(aux + " ");
                }
                cont = 0;
            }
            
            return sb.toString();
    
        }
        
        public static String sacaRepetidos(List<String> listaGeneral) {
            String aux, aux2;
            int cont = 0;
            StringBuilder sb=new StringBuilder();
                
            for (int i = 0; i < listaGeneral.size(); i++) {
                aux = listaGeneral.get(i);
    
                if (i == listaGeneral.size()) {
                    break;
                }
    
                for (int j = 0; j < listaGeneral.size(); j++) {
    
                    aux2 = listaGeneral.get(j);
    
                    if (aux.equals(aux2)) {
                        cont++;
                    }
    
                }
                if (cont >=2) {
                    sb.append(aux + " ");
                }
                cont = 0;
            }
            
            return sb.toString();
    
        }
    public static void main(String[] args) {
        String[] arrayy;
        ArrayList<String> listta = new ArrayList<String>();
        ArrayList<String> listtaRepetidos = new ArrayList<String>();
        

        arrayy = separarCadenaIntroducida("Introduce una frase separada por espacios");
        arrayToList(listta, arrayy);

        System.out.println("No repetidos: " + sacaNoRepetidos(listta));
        System.out.println("Repetidos: " + sacaRepetidos(listta));

     

    }
}
