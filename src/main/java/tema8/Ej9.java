/*
Realiza un método en Java llamado estaEquilibrada donde analizaremos un String que tiene
internamente una fórmula matemática que  verifica, si la fórmula está equilibrada o no en símbolos de paréntesis, 
recorriendo todos sus caracteres desde el inicio hasta el final. Para ello crea un método que recoja un String 
(representa la fórmula o expresión recibida) y devuelva un lógico. Internamente almacenará la fórmula recibida en una colección para su evaluación. Mira las pruebas unitarias:

Pruebas unitarias
estaEquilibrada (“x-3*(y/3+6)”) -> true
estaEquilibrada (“((x-3)*(y/3+6))”) -> true
estaEquilibrada (“((x)”) -> false (falta un paréntesis de cierre)
estaEquilibrada (“x-3)*(y/3+6))”) -> false (faltan dos paréntesis de cierre)


 */
package tema8;

import java.util.Scanner;

public class Ej9 {
    public static String estaEquilibrada(String cadena, int parIzq, int parDcha){
        StringBuilder sb= new StringBuilder();
        int diferencia;
        
        diferencia= Math.abs(parIzq-parDcha);
        
        if (parDcha==parIzq) {
            sb.append("La expresion esta equilibrada");
        }else{
            sb.append("No esta equilibrada, le falta(n) " + diferencia + " parentesis de ");
           
            sb.append(parIzq>parDcha? "cierre": "apertura");
                     
        }
        
       return sb.toString(); 
    }
    
    
    public static int contarCaracterEnCadena (String cadena, char caracter){
         int count = 0;
            for (char c : cadena.toCharArray()) {
                if (c == caracter) {
                    count++;
                }
            }
            return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        char caracter1='(', caracter2=')';
        int contIzq, contDcha;
        
        System.out.println("Introduce la ecuacion ");
        cadena=sc.nextLine();
        
        contIzq=contarCaracterEnCadena(cadena, caracter1);
        contDcha=contarCaracterEnCadena(cadena, caracter2);
        
        System.out.println(estaEquilibrada(cadena, contIzq, contDcha));
    }
}
