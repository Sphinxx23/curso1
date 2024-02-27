//Realizar una funcion que reciba n datos de tipo entero y calcule y muestre por pantalla la suma y la media de todos ellos
package tema5;

import java.util.Scanner;

public class Ej12 {
    
    
    public static int sumaDe(String numeros){       
        int sumaTotal=0;
        Scanner sc = new Scanner(numeros);
        while (sc.hasNext()) {
            sumaTotal=sumaTotal+ Integer.parseInt(sc.next());   
        
        }
        return sumaTotal;
    }
    
    
    public static float mediaDe (String numeros){        
        Scanner sc = new Scanner(numeros);
        float media;
        int sumar, cont=0;
       
        sumar=sumaDe(numeros);
        while (sc.hasNext()) {
            sc.next();
            cont++;           
        }
        media = (float)sumar/cont;
        
        return media;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String numeros;
        int suma;
        float media;
        
        System.out.println("Introduce n numeros para sumarlos, separados por un espacio");
        numeros=sc.nextLine();
        
        suma=sumaDe(numeros);
        System.out.println("La suma es " + suma);
        
        media=mediaDe(numeros);
        System.out.println("La media es " + media);
    }
}

