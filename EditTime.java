import java.time.*;
import java.time.format.*;
 
public class EditTime {
 
    public static void main(String[] args) {
         
        LocalDate date = LocalDate.of(2017, Month.APRIL, 6);
        LocalTime time = LocalTime.of(11, 12, 13);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	System.out.println("DateTime in Short format "+shortF.format(dateTime));
	System.out.println("DateTime in Medium format "+mediumF.format(dateTime));
    }
}