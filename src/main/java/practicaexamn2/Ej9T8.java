/*
 Realiza un método en Java llamado estaEquilibrada donde analizaremos un String que tiene
internamente una fórmula matemática que  verifica, si la fórmula está equilibrada o no en símbolos de paréntesis, 
recorriendo todos sus caracteres desde el inicio hasta el final. Para ello crea un método que recoja un String 
(representa la fórmula o expresión recibida) y devuelva un lógico. Internamente almacenará la fórmula recibida
en una colección para su evaluación. Mira las pruebas unitarias:

Pruebas unitarias
estaEquilibrada (“x-3*(y/3+6)”) -> true
estaEquilibrada (“((x-3)*(y/3+6))”) -> true
estaEquilibrada (“((x)”) -> false (falta un paréntesis de cierre)
estaEquilibrada (“x-3)*(y/3+6))”) -> false (faltan dos paréntesis de cierre)


 */
package practicaexamn2;
import java.util.*;
public class Ej9T8 {
    
    public static int contador(String auxx, char carr){
        int cont=0;
        
        for (char c : auxx.toCharArray()) {
            if (c==carr) {
                cont++;
            }
            
        }
        
       return cont; 
    }
    
    public static boolean comprobar(int cont, int cont1){
        if (cont1==cont) {
           return true ;
        }else{
            return false;
        }
    }
    
    public static String diff(int cont, int cont1){
        StringBuilder sb= new StringBuilder();
        int aux;
        
        aux=Math.abs(cont-cont1);
       
        
        if (cont>cont1) {
            sb.append("Faltan " + aux + " parentesis de cierre");
        }else{
            sb.append("Faltan " + aux + " parentesis de apertura");
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String aux;
        int cont1,cont2;
        boolean vFlag;
        
        
        System.out.println("Introduce la cadena");
        aux=sc.nextLine();
        
        cont1=contador(aux,'(');
        cont2=contador(aux,')');
        vFlag=comprobar(cont1,cont2);
        if (vFlag) {
            System.out.println("Equilibrado");
        }else{
            System.out.println(diff(cont1, cont2));
            
        }
    }
}
