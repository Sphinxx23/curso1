/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import com.github.javafaker.Faker;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LibreriaMap {
    //Rellena el mapa mientras las palabras que se pongan sean diferentes a la de finalizacion
    public static void rellenaMapa(Map<String, String> mappa, String msg) {
        Scanner sc = new Scanner(System.in);
        String auxKey, auxValor;

        System.out.println(msg);
        auxKey = sc.next();

        while (!(auxKey.equalsIgnoreCase("FIN"))) {
            auxValor = sc.nextLine();
            mappa.put(auxKey, auxValor);
            auxKey = sc.next();
        }

    }
    //Muestra el mapa buscando clave valor
     public static void muestraMapa(Map<String, String> mappa) {
        String aux;
        Iterator it = mappa.keySet().iterator();

        while (it.hasNext()) {
            aux = it.next().toString();
            System.out.println("Clave: " + aux + " Valor: " + mappa.get(aux));

        }

    }
     
     //Rellena un mapa del tipo Integer, string[], los integers con numeros ascendentes del 1 al numero dado y los arrays de strings con faker
     public static void rellenarMapa(Map<Integer, String[]> empl, int empTot) {      
        String[] arra;
        Faker fk = new Faker();

        for (int i = 1; i <= empTot; i++) {
            arra = new String[4];

            arra[0] = fk.name().firstName();
            arra[1] = fk.number().numberBetween(1, 99) + " años";
            arra[2] = fk.number().numberBetween(1000, 2500) + " €";
            arra[3] = "Dpt_NO " + fk.number().numberBetween(1000, 9999);

            empl.put(i, arra);

        }

    }
     
     //Saca de un map de integers, string[] la clave y los valores del string[] pedidos por el usuario hasta que sea -1
     public static String muestrarKeyValorMapa(Map<Integer, String[]> empl, int auxx) {
        StringBuilder sb = new StringBuilder();
        String auxStr;

        if (auxx < -1 || auxx == 0 || auxx > empl.size()) {
            sb.append("Empleado no encontrado");
        } else if (auxx == -1) {
            sb.append("Fin de programa");
        } else {
            sb.append("Clave empleado: " + auxx + "\t");

            auxStr = Arrays.toString(empl.get(auxx));

            sb.append("Valores: " + auxStr);
        }

        return sb.toString();

    }
     
     //Muestra un mapa del tipo string,float haciendo la suma total de los valores del float
      public static String mostrarMapaYSum(Map<String, Float> listaCompra){
      DecimalFormat df= new DecimalFormat("#.##");
        float acum=0;
        StringBuilder sb = new StringBuilder();
        Set<String> settt= new HashSet<String>();
        sb.append("LISTA DE LA COMPRA \nArtículo \t Precio \n" );
        
        settt=listaCompra.keySet();
        
        for (String auxKey : settt) {
            sb.append(auxKey + " \t " + listaCompra.get(auxKey)+"\n");
            acum=acum+listaCompra.get(auxKey);
        }
        
        sb.append("Total compra:  " + df.format(acum) + " €");
        return sb.toString();
    }
}
