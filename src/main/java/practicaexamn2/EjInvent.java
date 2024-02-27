/*
 El ejercicio consiste en contar la frecuencia de cada palabra en una frase 
y luego mostrar el resultado en orden alfabético. 
 */
package practicaexamn2;

import java.util.*;


public class EjInvent {
   
    public static void rellenaMapa (Map<String, Integer> mappa, String cadena){
        List<String> listta= new ArrayList<String>();
        String aux;
        int aux2;
        Scanner sc=new Scanner(cadena);
        
        while (sc.hasNext()) {
           aux=sc.next();
            listta.add(aux);
            
        }
        
         Comparator<String> comparadorReverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2)*-1;
            }
        };

        Collections.sort(listta, comparadorReverso);
        
        for (int i = 0; i < listta.size(); i++) {
           aux2= Collections.frequency(listta, listta.get(i));
           mappa.put(listta.get(i), aux2);
        }
        
        
        
    }
    
     public static void muestraMapa(Map<String, Integer> mappa) {
        String aux;
        Iterator it = mappa.keySet().iterator();

        while (it.hasNext()) {
            aux = it.next().toString();
            System.out.println("Clave: " + aux + "\t Valor: " + mappa.get(aux));

        }

    }
   
    public static void main(String[] args) {
        String auxStr;
        Map<String, Integer> mappa=new LinkedHashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduce la frase");
        auxStr=sc.nextLine();
        
        rellenaMapa(mappa,auxStr);
        muestraMapa(mappa);
        
        
    }
}
