package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;


public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        obterDiaUtil(date);
    }
    public static void obterDiaUtil(LocalDate date) {
        switch (date.getDayOfWeek()) {
            case MONDAY:
                System.out.println("Proximo dia util: " + date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
                break;
            case TUESDAY:
                System.out.println("Proximo dia util: " + date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY)));
                break;
            case WEDNESDAY:
                System.out.println("Proximo dia util: " + date.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
                break;
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                System.out.println("Proximo dia util: " + date.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
                break;
            default:
                System.out.println("Erro no switch");
        }
    }
}

