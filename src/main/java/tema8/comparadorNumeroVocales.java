/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;

import java.util.Comparator;

public class comparadorNumeroVocales implements Comparator<String>{

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
    
}
