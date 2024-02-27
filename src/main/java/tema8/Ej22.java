/*
 Modifica el ejercicio 21 añadiendo ahora otro mapa (llamado departamento) donde se introduzca información con distintos 
departamentos a los que pertenece un empleado.
El mapa tendrá como clave el código del departamento, los códigos será un número aleatorio de entre los números de código de
departamento del mapa empleado (como si fuera una clave ajena).
Los valores a introducir será un array con nombre_departamento, ciudad y número de empleados aleatorios con Faker.

Posteriormente mostrar un listado MAESTRO-DETALLE donde veamos para cada departamento los empleados que tiene ese departamento.
NOTA: Tienen que mostrarse todos los empleados. Ejemplo de listado:

Listado de DEPARTAMENTOS CON SUS EMPLEADOS
Departamento: 1 Contabilidad Logroño
Codigo		Nombre
1 		Juan Pérez
5		Ana Sarabia
3		Unai García
Departamento: 2 Producción Bilbao
Codigo		Nombre
8		Anselmo Pérez
6		Pepa García
Departamento: 3 Marketing Vitoria

 */

package tema8;

import com.github.javafaker.Faker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ej22 {

    public static void rellenarMapa(HashMap<Integer, String[]> empl, int empTot) {      
        String[] arra;
        Faker fk = new Faker();

        for (int i = 1; i <= empTot; i++) {
            arra = new String[4];

            arra[0] = fk.name().firstName();
            arra[1] = fk.number().numberBetween(1, 99) + " años";
            arra[2] = fk.number().numberBetween(1000, 2500) + " €";
            arra[3] = "Dpt_NO " + fk.number().numberBetween(1, 3);

            empl.put(i, arra);

        }

    }
    
    
    

    public static String muestrarKeyValorMapa(HashMap<Integer, String[]> empl, int auxx) {
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
