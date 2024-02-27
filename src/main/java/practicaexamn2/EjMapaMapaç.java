/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamn2;

 import java.util.*;

public class EjMapaMapaç {

    public static void main(String[] args) {
        // Crear el mapa principal
        Map<Integer, Map<Integer, String[]>> mapaPrincipal = new HashMap<>();

        // Agregar algunos datos de ejemplo al mapa
        agregarDatos(mapaPrincipal, 1, 1, new String[]{"Persona1", "Persona2", "Persona3"});
        agregarDatos(mapaPrincipal, 1, 2, new String[]{"Persona4", "Persona5", "Persona6"});
        agregarDatos(mapaPrincipal, 2, 1, new String[]{"Persona7", "Persona8", "Persona9"});

        // Mostrar el contenido del mapa
        mostrarMapa(mapaPrincipal);
    }

    // Método para agregar datos al mapa principal
    public static void agregarDatos(Map<Integer, Map<Integer, String[]>> mapa, int keyPrincipal, int keySecundaria, String[] valores) {
        // Verificar si la clave principal ya existe en el mapa
        if (!mapa.containsKey(keyPrincipal)) {
            // Si no existe, crear un nuevo mapa secundario
            mapa.put(keyPrincipal, new HashMap<>());
        }

        // Obtener el mapa secundario correspondiente a la clave principal
        Map<Integer, String[]> mapaSecundario = mapa.get(keyPrincipal);

        // Agregar los valores al mapa secundario
        mapaSecundario.put(keySecundaria, valores);
    }

    // Método para mostrar el contenido del mapa
    public static void mostrarMapa(Map<Integer, Map<Integer, String[]>> mapa) {
        for (Map.Entry<Integer, Map<Integer, String[]>> entry : mapa.entrySet()) {
            int keyPrincipal = entry.getKey();
            Map<Integer, String[]> mapaSecundario = entry.getValue();

            System.out.println("Clave Principal: " + keyPrincipal + " Valores ");

            for (Map.Entry<Integer, String[]> secundarioEntry : mapaSecundario.entrySet()) {
                int keySecundaria = secundarioEntry.getKey();
                String[] valores = secundarioEntry.getValue();

                System.out.println("  Clave Secundaria: " + keySecundaria + ", Valores: " + Arrays.toString(valores));
            }
        }
    }
}


