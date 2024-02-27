/*
 Leer el fichero Quijote.txt con la famosa novela de Miguel de Cervantes y mostrar por pantalla 
cuantas veces aparece cada una de las vocales en dicho fichero. Deberéis buscar el modo de leer un fichero de texto en google.
 */
package tema7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Vespertino
 */
public class EjInvent {

    

        public static void main(String[] args) {
            // Ruta del archivo Quijote.txt
            String filePath = "Quijote.txt";

            // Inicializar contadores para cada vocal
            int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;

                // Leer línea por línea del archivo
                while ((line = reader.readLine()) != null) {
                    // Convertir la línea a minúsculas para hacer la búsqueda insensible a mayúsculas
                    line = line.toLowerCase();

                    // Contar la frecuencia de cada vocal en la línea
                    aCount += contarVocales(line, 'a');
                    eCount += contarVocales(line, 'e');
                    iCount += contarVocales(line, 'i');
                    oCount += contarVocales(line, 'o');
                    uCount += contarVocales(line, 'u');
                }

                // Mostrar los resultados
                System.out.println("Frecuencia de vocales:");
                System.out.println("A: " + aCount);
                System.out.println("E: " + eCount);
                System.out.println("I: " + iCount);
                System.out.println("O: " + oCount);
                System.out.println("U: " + uCount);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Función para contar la frecuencia de una vocal en una cadena
        public static int contarVocales(String cadena, char vocal) {
            int count = 0;
            for (char c : cadena.toCharArray()) {
                if (c == vocal) {
                    count++;
                }
            }
            return count;
        }
    }

