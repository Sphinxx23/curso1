
package tema9.cuenta;

/**
 *
 * @author Vespertino
 */
public class Test {
    public static void main(String[] args) {
        
        Cuenta cRaul= new  Cuenta();
        Cuenta cIvan = new Cuenta(500.0, "Ivan");
        
       cRaul.setNombre("Oteiza");
        
        cRaul.setSaldo(1000.0);
        cRaul.getSaldo();
        cIvan.getSaldo();
        
        cRaul.reintegro(2000.0);
        
        cIvan.ingreso(-100.0);
        
        cRaul.getSaldo();
        cIvan.getSaldo();
     
    }
}
