/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PcBox
 */
public class LibreriaHora {
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

}
