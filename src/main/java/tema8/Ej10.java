/*
 1. Realiza métodos que hagan uso de los métodos de fechas de la clase LocalDate:
● Método que recibe una fecha como String e indica si el año es bisiesto o no.
● Método que recibe una fecha como String e indica si dicha fecha es o no correcta.
● Método que dada una fecha te indica el día de la semana en castellano de esta fecha.
Ejemplo {“Lunes”, “Martes” …}
● Método recibe dos fechas en formato String y devuelve -1, 0 o 1 dependiendo de si la
primera está antes, es igual o está después de la segunda.
● Método que recibe un String con una fecha y devuelve cuantos días quedan para llegar a
final de mes.
● Método que recibe un String con una fecha y devuelve cuantos días quedan hasta fin de
año.
● Método que recibe dos String y calcula cuántos días de diferencias hay entre ambas fechas.
● Método que recibe un String con una fecha y un int con el número de días. Retorna un
String con la fecha tras haber pasado esos días.
● Método que devuelve la fecha del sistema en formato bonito. Ejemplo si “03/02/2023 -&gt; 3
de Febrero del 2023”.
 */
package tema8;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ej10 {

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
    
    
    public static void main(String[] args) {
        // Ejemplos de uso
        System.out.println("¿El año es bisiesto? " + esBisiesto("2024-02-14"));
        System.out.println("¿La fecha es válida? " + esFechaValida("2024-02-14"));
        System.out.println("Día de la semana: " + diaDeLaSemana("2024-02-14"));
        System.out.println("Comparación de fechas: " + compararFechas("2024-02-14", "2024-02-15"));
        System.out.println("Días hasta el final de mes: " + diasHastaFinalDeMes("2024-02-14"));
         System.out.println("Diferencia en días: " + diferenciaEnDias("2024-02-14", "2024-02-20"));
        System.out.println("Nueva fecha después de 5 días: " + sumarDias("2024-02-14", 5));
        System.out.println("Fecha del sistema en formato bonito: " + fechaDelSistemaBonita());
    
    }
}

            

