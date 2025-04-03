import Videos.Plays;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        Plays video = new Plays("V1#", "Lection1", 90, 0, false);
        Plays video2 = new Plays("V2#", "Lection2", 90);
        Plays video3 = new Plays("V3#");

        System.out.println(video);
        System.out.println(video2);
        System.out.println(video3);


        BigDecimal number1 = BigDecimal.valueOf(100);
        BigDecimal number2 = BigDecimal.valueOf(20);
        BigDecimal total = number1.add(number2);
        number1.equals(number2);
        number1.compareTo(number2);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate date1 = LocalDate.of(2025,1,20);
        ChronoUnit.YEARS.between(date1,today);
    }
}