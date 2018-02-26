import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfTheProgrammer {

    static String solve(int year){
        LocalDate date = LocalDate.now().withYear(year).withDayOfYear(256);
        if (year == 1918) {
            date = date.plusDays(13);
        } else {

            if (year % 4 == 0 && year % 100 == 0 && year <= 1917) {
                date = date.minusDays(1);
            }
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return date.format(formatter);
    }
}
