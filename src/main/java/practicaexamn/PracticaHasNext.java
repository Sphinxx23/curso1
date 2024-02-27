/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn;

import java.util.Scanner;

public class PracticaHasNext {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numeros, nFin=" ";
        int iNum;
        
        System.out.println("Introduce la cadena de nmumeros ");
        numeros=sc.nextLine();
        
        
        Scanner noTeclado = new Scanner(numeros);
        
        while (noTeclado.hasNext()) {
            iNum=Integer.parseInt(noTeclado.next());
            if (iNum%2==0){
                continue;
            }else{
                System.out.print(iNum + " ");//una forma de hacerlo
                
                nFin= nFin + "" + iNum; // otra forma convirtiendo a string y lgo saco el string
            }
            
        }
        System.out.println(nFin);//aqui saco el string 
    }

}
