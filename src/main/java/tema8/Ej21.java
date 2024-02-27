/*
 Realizar un programa en Java que almacene en un mapa (llamado empleados) la información de los empleados de una empresa.
La información del mapa la rellenaremos usando la clase Faker.
El mapa tendrá como clave el código del empleado secuencial empezando en 1.
Los valores del mapa será un array de String donde almacenaremos: nombre, edad, salario y código de departamento (aquí usamos Faker)

Posteriormente solicitaremos al usuario un código determinado y mostraremos toda la información disponible en el mapa de ese empleado. 
En caso de no existir mostraremos el mensaje “EMPLEADO INEXISTENTE”. El programa termina cuando el usuario introduce un -1 como código de empleado.

 */
package tema8;

import com.github.javafaker.Faker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej21 {

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

    public static String muestrarKeyValorMapa(Map<Integer, String[]> empl, int auxx) {
        StringBuilder sb = new StringBuilder();
        String auxStr;

        if (auxx<-1||auxx==0||auxx > empl.size()) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iEmpleTotales, iEmpConsulta;

        HashMap<Integer, String[]> empleados = new HashMap<Integer, String[]>();

        System.out.println("Cuantos empleados quieres añadir");
        iEmpleTotales = sc.nextInt();

        rellenarMapa(empleados, iEmpleTotales);

        do {
            System.out.println("Numero de empleado que quieres consultar sus datos");
            iEmpConsulta = sc.nextInt();
            System.out.println(muestrarKeyValorMapa(empleados, iEmpConsulta));
        } while (iEmpConsulta != -1);

    }
}
