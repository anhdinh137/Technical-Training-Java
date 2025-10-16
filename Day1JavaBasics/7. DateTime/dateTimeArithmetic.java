import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class dateTimeArithmetic {
    public static void main(String[] args) {

        //Doing simple arithmetic on date and time 
        LocalDate current = LocalDate.now();
        LocalDate dayAfter = current.plusDays(2);
        LocalDate dayBefore = current.minusDays(3);
        // Adding to a date / subtracting from a date
        System.out.println(dayAfter);
        System.out.println(dayBefore);
        
        // Getting the period between 2 dates
        LocalTime currentTime = LocalTime.now();
        LocalTime timeAfter = currentTime.plusHours(0);
        System.out.println(timeAfter);

        Period period = Period.between(dayAfter, dayBefore);
        System.out.println(period.getYears() +" " + period.getMonths() +" "+ period.getDays());
        
        // Getting duration between 2 time

        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 0);

        Duration workTime = Duration.between(start, end);
        System.out.println(workTime.toHours()); 


        // Comparing 2 dates
        LocalDate d1 = LocalDate.of(2025, 10, 16);
        LocalDate d2 = LocalDate.of(2025, 10, 20);

        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
        System.out.println(d1.isEqual(d2));
    }

}
