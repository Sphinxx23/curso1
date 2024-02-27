/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author PcBox
 */
public class LibreriaFecha {
     // Método que indica si el año de una fecha es bisiesto o no
    public static boolean esBisiesto(String fechaString) {
        LocalDate fecha = LocalDate.parse(fechaString);
        return fecha.isLeapYear();
    }

    // Método que indica si una fecha es válida o no
    public static boolean esFechaValida(String fechaString) {
        try {
            LocalDate fecha = LocalDate.parse(fechaString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Método que devuelve el día de la semana en castellano
    public static String diaDeLaSemana(String fechaString) {
        LocalDate fecha = LocalDate.parse(fechaString);
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        return diasSemana[diaSemana.getValue() - 1];
    }

    // Método que compara dos fechas y devuelve -1, 0 o 1
    public static int compararFechas(String fecha1String, String fecha2String) {
        LocalDate fecha1 = LocalDate.parse(fecha1String);
        LocalDate fecha2 = LocalDate.parse(fecha2String);
        return fecha1.compareTo(fecha2);
    }

    // Método que devuelve cuántos días quedan para el final de mes
    public static long diasHastaFinalDeMes(String fechaString) {
        LocalDate fecha = LocalDate.parse(fechaString);
        LocalDate finalDeMes = fecha.withDayOfMonth(fecha.lengthOfMonth());
        return ChronoUnit.DAYS.between(fecha, finalDeMes);
    }
    
     // Método que calcula la diferencia en días entre dos fechas
    public static long diferenciaEnDias(String fecha1String, String fecha2String) {
        LocalDate fecha1 = LocalDate.parse(fecha1String);
        LocalDate fecha2 = LocalDate.parse(fecha2String);
        return Math.abs(fecha1.until(fecha2).getDays());
    }

    // Método que devuelve una nueva fecha después de añadir un número dado de días
    public static String sumarDias(String fechaString, int dias) {
        LocalDate fecha = LocalDate.parse(fechaString);
        LocalDate nuevaFecha = fecha.plusDays(dias);
        return nuevaFecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // Método que devuelve la fecha del sistema en formato bonito
    public static String fechaDelSistemaBonita() {
        LocalDate fechaSistema = LocalDate.now();
        return fechaSistema.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'del' yyyy"));
    }
    
}
