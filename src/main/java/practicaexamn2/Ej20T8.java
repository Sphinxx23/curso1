/*
 Realizar un programa en Java que solicite al usuario el DNI (String) y el nombre completo
de los alumnos de MULWEB1. El programa dejará de solicitar información cuando el usuario introduzca 
un “FIN” en el DNI. Rellena un mapa (a elegir por el usuario) con estas parejas. Posteriormente mostrará
un listado como el que aparece a continuación ordenado por el DNI.

Listado de Alumnos de MULWEB1

DNI		Nombre
20343243R	Juan Pérez
34243334A	Ana Sarabia
53243224T	Unai García
 
 */
package practicaexamn2;

import java.util.*;

public class Ej20T8 {
    
    public static void rellenarMapa(Map<String, String> mappa){
       Scanner sc = new Scanner(System.in);
        String auxStr1, auxStr2;
        String finall="fin";
        
        System.out.println("Introduce el dni y el nombre del alumno separado por espacio");
        auxStr1=sc.next();
        
        while(!auxStr1.equalsIgnoreCase(finall)){
            auxStr2=sc.nextLine();
            mappa.put(auxStr1, auxStr2);
            auxStr1=sc.next();
        }
    }
    
      public static void muestraMapa(Map<String, String> mappa) {
        String aux;
        Iterator it = mappa.keySet().iterator();

        while (it.hasNext()) {
            aux = it.next().toString();
            System.out.println("Clave: " + aux + " Valor: " + mappa.get(aux));

        }

    }
    
    
    public static void main(String[] args) {
        Map<String, String> mappa= new TreeMap<String, String>();
        
        rellenarMapa(mappa);
        muestraMapa(mappa);
    }
}
