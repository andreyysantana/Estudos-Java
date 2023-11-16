package DatasHoras;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateCalculando {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-11-13");
        LocalDateTime d05 = LocalDateTime.parse("2023-11-13T01:30:26");
        Instant d06 = Instant.parse("2023-11-13T01:30:26Z");

        LocalDate pastWeelLocalDate = d04.minusDays(7);
        LocalDate nextWeelLocalDate = d04.plusDays(7);

        System.out.println("pastWeelLocalDate = " + pastWeelLocalDate);
        System.out.println("nextWeelLocalDate = " + nextWeelLocalDate);

        LocalDateTime pastWeelLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeelLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeelLocalDateTime = " + pastWeelLocalDateTime);
        System.out.println("nextWeelLocalDateTime = " + nextWeelLocalDateTime);

        Instant pastWeelInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeelInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeelInstant = " + pastWeelInstant);
        System.out.println("nextWeelInstant = " + nextWeelInstant);

        Duration t1 = Duration.between(pastWeelLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeelLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeelInstant, d06);
        Duration t4 = Duration.between(d06, pastWeelInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}
