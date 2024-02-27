//Diseñar la función calculadora() que reciba dos números enteros y una operación. 
//Dependiendo del valor de la operación retornará suma, resta, multiplicación o división de los dos números recibidos.
//Las operaciones aunque sean muy básicas también las haremos en métodos diferentes (aunque no sean candidatas a almacenar en nuestra Librería ;-))
package prueba;

import java.util.Scanner;

public class Ej10 {

    public static int leerEntero(String msg) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        num = sc.nextInt();
        return num;

    }

    /**
     *Este metodo sirve para recoger un signo de operacion matematica, y devuelve un char
     * @param msg recoge un mensaje personalizado que quieras darle
     * @return devuelve un char 
     */
    public static char leerSigno(String msg) {
        char operador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(msg);
            operador = sc.nextLine().charAt(0);
        } while (operador != '+' && operador != '-' && operador != '*' && operador != '/');
        return operador;
    }

    /**
     *Este metodo suma los dos reales y devuelve otro real
     * @param a recoge un float
     * @param b recoge otro float
     * @return devuelve un real (float)
     */
    public static float suma(float a, float b) {
        float suma;
        suma = a + b;
        return suma;
    }
    
    /**
     *Este metodo resta los dos reales y devuelve otro real
     * @param a recoge un float
     * @param b recoge otro float
     * @return devuelve un real (float)
     */
    public static float resta(float a, float b) {
        float resta;
        resta = a - b;
        return resta;
    }

    /**
     *Este metodo multiplica los dos reales y devuelve otro real
     * @param a recoge un float
     * @param b recoge otro float
     * @return devuelve un real (float)
     */
    public static float multip(float a, float b) {
        float multip;
        multip = a * b;
        return multip;
    }

    /**
     *Este metodo divide los dos reales y devuelve otro real
     * @param a recoge un float
     * @param b recoge otro float
     * @return devuelve un real (float)
     */
    public static float div(float a, float b) {
        float div;
        div = a / b;
        return div;
    }

    /**
     *Este metodo es una calculadora, recoge dos valores y un signo y realiza la operacion
     * @param a recoge un real
     * @param operador recoge un char
     * @param b recoge un real
     * @return devuelve un real(float)
     */
    public static float calculadora(float a, char operador, float b) {

        float r = 0;

        switch (operador) {
            case '+':
                r = suma(a, b);
                break;
            case '-':
                r = resta(a, b);
                break;
            case '*':
                r = multip(a, b);
                break;
            case '/':
                r = div(a, b);
                break;

        }
        return r;

    }

    public static void main(String[] args) {
        int a, b;
        float r;
        char operador;

        a = leerEntero("Introduzca un entero");
        b = leerEntero("Introduzca un entero");
        operador = leerSigno("Introduce un signo de operacion, por ejemplo un + un - un * o un /");

        r = calculadora(a, operador, b);
        System.out.println("Resultado " + r);
    }

}
