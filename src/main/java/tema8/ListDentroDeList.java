/*
Realiza un programa en Java que recoja las edades de los alumnos de los grupos de
1MULTIWEB, 2MULTIWEB y 3MULTIWEB. Para ello se deberá almacenar en una colección
(a definir por el alumno) que a su vez tenga 3 colecciones internamente. Posteriormente
mostrar el listado de las edades con un encabezado (ver ejemplo posterior) y la media de
edad por cada grupo.Ejemplo:

Alumno s de 1ºMULTIWEB
18, 19, 20, 20 ….
Media de edad: 21.30
Alumno s de 2ºMULTIWEB
20, 39, 19, 26 ….
Media de edad: 24.30
 */
package tema8;

import java.util.ArrayList;

public class ListDentroDeList {
    
    public static void mostrar (ArrayList<ArrayList<Integer>> grupos){
        int acum=0, cont=0, i=1;
        float media;
        for (ArrayList<Integer> grupo : grupos) {
            cont=0;
            acum=0;
            System.out.println("Alumnos de MULWEB" + i);
            for (Integer integer : grupo) {
                System.out.print( integer + " , ");
                acum+=integer;
                cont++;
            }
            media=acum/cont;
            System.out.println("La media del grupo MULWEB" + i + " es: " + media);
            i++;
        }
        
    }
    public static void llenarLista(ArrayList<ArrayList<Integer>>grupos){
           ArrayList<Integer> mulweb1= new ArrayList<>();
        mulweb1.add(20);
        mulweb1.add(20);
        mulweb1.add(20);
        mulweb1.add(20);
        mulweb1.add(20);
        
        ArrayList<Integer> mulweb2= new ArrayList<>();
        mulweb2.add(19);
        mulweb2.add(19);
        mulweb2.add(18);
        mulweb2.add(19);
        mulweb2.add(19);
        
        ArrayList<Integer> mulweb3= new ArrayList<>();
        mulweb3.add(19);
        mulweb3.add(19);
        mulweb3.add(19);
        mulweb3.add(19);
        mulweb3.add(19);
        
        
        grupos.add(mulweb1);
        grupos.add(mulweb2);
        grupos.add(mulweb3);
        
        
    }
    
    public static void main(String[] args) {
      ArrayList<ArrayList<Integer>> grupos= new ArrayList<ArrayList<Integer>>();
        llenarLista(grupos);       
        mostrar(grupos);
    }
}
