/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema8;


    import java.util.*;

public class eJ26 {
    public static void main(String[] args) {
        Map<String, String[]> tendencias = new HashMap<>();
        tendencias.put("08-22-2016", new String[]{"#Rio2016", "#BSC", "#ECU"});
        tendencias.put("08-25-2016", new String[]{"#GYE", "#BRA"});
        tendencias.put("08-27-2016", new String[]{"#YoSoyEspol", "#GYE", "#BSC"});

        List<String> fechas1 = Arrays.asList("08-25-2016", "08-27-2016");
        List<String> fechas2 = Arrays.asList("08-25-2016", "08-27-2016");

        reportarTodasTendencias(tendencias, fechas1);
        reportarTendencias(tendencias, fechas2);
        tendenciasExcluyentes(tendencias, "08-25-2016", "08-27-2016");
    }

    public static void reportarTodasTendencias(Map<String, String[]> tendencias, List<String> fechas) {
        for (String fecha : fechas) {
            if (tendencias.containsKey(fecha)) {
                System.out.println("Tendencias para " + fecha + ": " + Arrays.toString(tendencias.get(fecha)));
            } else {
                System.out.println("No hay tendencias para " + fecha);
            }
        }
    }

    public static void reportarTendencias(Map<String, String[]> tendencias, List<String> fechas) {
        Set<String> hashtags = new HashSet<>();
        for (String fecha : fechas) {
            if (tendencias.containsKey(fecha)) {
                hashtags.addAll(Arrays.asList(tendencias.get(fecha)));
            }
        }
        System.out.println("Hashtags tendencia: " + hashtags);
    }

    public static void tendenciasExcluyentes(Map<String, String[]> tendencias, String fecha1, String fecha2) {
        Set<String> hashtagsFecha1 = new HashSet<>(Arrays.asList(tendencias.getOrDefault(fecha1, new String[]{})));
        Set<String> hashtagsFecha2 = new HashSet<>(Arrays.asList(tendencias.getOrDefault(fecha2, new String[]{})));

        hashtagsFecha1.removeAll(hashtagsFecha2);
        hashtagsFecha2.removeAll(hashtagsFecha1);

        Set<String> hashtagsExcluyentes = new HashSet<>();
        hashtagsExcluyentes.addAll(hashtagsFecha1);
        hashtagsExcluyentes.addAll(hashtagsFecha2);

        System.out.println("Hashtags excluyentes: " + hashtagsExcluyentes);
    }
}


