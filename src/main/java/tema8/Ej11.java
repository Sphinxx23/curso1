/*
 Realiza los métodos siguientes haciendo uso de la clase LocalTime:
● Método que muestra la hora del sistema
● Método que devuelve un String con la hora del sistema en formato bonito. Ejemplo
“17 horas y 45 minutos 3 segundos”)
● Métodos que devuelve un String con una fecha, tras recibir un String de una fecha y
una cantidad de minutos.
● Método recibe dos horas en formato String y devuelve -1, 0 o 1 dependiendo de si
la primera está antes, es igual o está después de la segunda.
 */
package tema8;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ej11{

    // Método que muestra la hora del sistema
    public static LocalTime obtenerHoraSistema() {
        return LocalTime.now();
    }

    // Método que devuelve un String con la hora del sistema en formato bonito
    public static String horaBonita() {
        LocalTime horaSistema = LocalTime.now();
        int horas = horaSistema.getHour();
        int minutos = horaSistema.getMinute();
        int segundos = horaSistema.getSecond();

        return String.format("%d horas y %d minutos %d segundos", horas, minutos, segundos);
    }

    // Método que devuelve un String con una hora tras recibir un String de una hora y una cantidad de minutos
    public static String sumarMinutos(String horaString, int minutos) {
        LocalTime hora = LocalTime.parse(horaString);
        LocalTime nuevaHora = hora.plusMinutes(minutos);
        return nuevaHora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    // Método que compara dos horas y devuelve -1, 0 o 1
    public static int compararHoras(String hora1String, String hora2String) {
        LocalTime hora1 = LocalTime.parse(hora1String);
        LocalTime hora2 = LocalTime.parse(hora2String);
        return hora1.compareTo(hora2);
    }

    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println("Hora del sistema: " + obtenerHoraSistema());
        System.out.println("Hora bonita: " + horaBonita());
        System.out.println("Nueva hora después de 30 minutos: " + sumarMinutos("15:45:30", 30));
        System.out.println("Comparación de horas: " + compararHoras("12:00:00", "15:30:45"));
    }
}

