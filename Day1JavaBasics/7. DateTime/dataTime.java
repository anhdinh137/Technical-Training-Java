import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class dataTime {
    // Using java.time, we can get date and time in a cohesive format
    // predifined by java 
    public static void main(String[] args) {
        // Get current date
        LocalDate date = LocalDate.now();

        // Get current time
        LocalTime time = LocalTime.now();
        
        // Get current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        
        // Get current date and time and current time zone
        ZonedDateTime zoned = ZonedDateTime.now();

        // Get the current
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zoned);
        System.out.println(instant);

        // You can also change the formatting for date and time

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = dateTime.format(fmt);
        System.out.println(formatted);
        // Parsing the date
        LocalDate newFormatted = LocalDate.parse("16-10-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(newFormatted);
    }
}
