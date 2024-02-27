/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author PcBox
 */
public class LibreriaComparadores {

    /*Comparador que ordena alfabeticamente de z-a
    
    Ej15.T8
    
    List<String> palabras = Arrays.asList("banana", "manzana", "pera", "uva", "cereza");

        // Usando una clase anónima como comparador para ordenar al revés alfabéticamente
        Comparator<String> comparadorReverso = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2)*-1;
            }
        };

        Collections.sort(palabras, comparadorReverso);

     */
 /*
    Ordena por multiplos de 3 primero, si ambos lo son, primero el pequeño, y cuando no hay mas multiplos de 3, de menos a mayor
    Ej16.T8
    
    List<Integer> numeros = Arrays.asList(9, 2, 6, 4, 7, 12, 1, 5, 8);

        // Usando una clase anónima como comparador para ordenar según los criterios especificados
        Comparator<Integer> comparadorPersonalizado = new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                // Ordenar por múltiplos de 3 primero
                if (num1 % 3 == 0 && num2 % 3 == 0) {
                    return num1.compareTo(num2);
                } else if (num1 % 3 == 0) {
                    return -1; // num1 es múltiplo de 3 y debe ir antes
                } else if (num2 % 3 == 0) {
                    return 1; // num2 es múltiplo de 3 y debe ir antes
                } else {
                    return num1.compareTo(num2); // Ordenar el resto de números de menor a mayor
                }
            }
        };
    
     */
    
    /*
    Ordena segun la suma de los arrays de su interior de menor a mayor
    Ej17.T8
    
     List<int[]> arrays = generarColeccionDeArrays(5);

        // Usando una clase anónima como comparador para ordenar según la suma de los arrays
        Comparator<int[]> comparadorSuma = new Comparator<int[]>() {
            @Override
            public int compare(int[] array1, int[] array2) {
               
                //Recorrer cada array con un for e ir sumando en un acumulador en vez de hacer esto
                int suma2 = 0;
                int suma1 = 0;
                for (int num1 : array1) {
                    suma1 += num1;
                }
                for (int num2 : array2) {
                    suma2 += num2;
                }
               
                
                //int suma1 = Arrays.stream(array1).sum();
                //int suma2 = Arrays.stream(array2).sum();
                

                return Integer.compare(suma1, suma2);
            }
        };
    */
    
    /*ordena fechas de la mas actual a la mas antigua
    Ej18.T8
    
    List<LocalDate> fechas = generarListaDeFechas();

        // Usando una clase anónima como comparador para ordenar fechas de más actual a más antigua
        Comparator<LocalDate> comparadorFechas = new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate fecha1, LocalDate fecha2) {
                return fecha1.compareTo(fecha2)*-1;
            }
        };

        Collections.sort(fechas, comparadorFechas);

    */
    
    /*ordena horas de manera ascendente: 12-17-22
    Ej19.T8
    
     List<LocalTime> horas = generarListaDeHoras();

        // Usando una clase anónima como comparador para ordenar horas de manera ascendente
        Comparator<LocalTime> comparadorHoras = new Comparator<LocalTime>() {
            @Override
            public int compare(LocalTime hora1, LocalTime hora2) {
                return hora1.compareTo(hora2);
            }
        };

        Collections.sort(horas, comparadorHoras);

    
    */
    
    /*Ordena por numero de vocales de cada palabra de mayor a menor, si tienen el mismo num de vocales, se ordena alfabeticamente
    
    @Override
    public int compare(String o1, String o2) {
        int cont1=0, cont2=0;
       
        for (int i = 0; i < o1.length(); i++) {
            if (tema5.Ej2.esVocal(o1.charAt(i))) {
                cont1++;
            }
        }
        
        for (int i = 0; i < o2.length(); i++) {
            if (tema5.Ej2.esVocal(o2.charAt(i))) {
                cont2++;
            }
        }
        
        if (cont1>cont2) {
            return -5;
        }else if(cont1<cont2){
            return 5;
        }else{
            return o1.compareTo(o2);
        }
    }
    
    */
}
