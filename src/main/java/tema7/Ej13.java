/*
 Dado el fichero QuijoteDeLaMancha.txt realiza un método que cuente el número de veces que aparece una determinada palabra dentro de dicho fichero.
Para ello deberás utilizar obligatoriamente la clase split para separar las palabras, BufferedReader para leer un fichero y una EED 2D para almacenar 
todas las palabras y el número de ocurrencias. Además la signatura del método a implementar será la siguiente:

public String[][] cuentaPalabras (String nomFichero)
 */
package tema7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        String[][] tablaa=new String[10][2];
        

            String ppal;
            // Ruta del archivo Quijote.txt
            String filePath = "Quijote.txt";
            System.out.println("Introduce palabra a buscar ");
            ppal = sc.nextLine();

            // Inicializar contadores para cada palabra
            int palabraCont = 0;

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            // Leer línea por línea del archivo
            while ((line = reader.readLine()) != null) {

                // Convertir la línea a minúsculas para hacer la búsqueda insensible a mayúsculas
                line = line.toLowerCase();

                // Contar la frecuencia de cada palabra en la línea
                palabraCont += contarPalabra(line, ppal);

            }
            
            System.out.println("La palabra " + ppal + " se repite " + palabraCont + " veces");
          
        
    }

    // Función para contar la frecuencia de una palabra en una cadena
    public static int contarPalabra(String cadena, String pal) {
        int count = 0;
        for (String c : cadena.split(" ")) {
            if (c.equalsIgnoreCase(pal)) {
                count++;
            }
        }
        return count;
    }
    
  
}
