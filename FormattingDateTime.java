import java.time.*;
import java.time.format.*;

public class FormattingDateTime
{
public static void main(String args[])
{
LocalDate date = LocalDate.of(2010, Month.APRIL, 1);
LocalTime time = LocalTime.of(11,22,33);
LocalDateTime dateTime = LocalDateTime.of(date,time);

System.out.println("Format 1 "+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
System.out.println("Format 2 "+dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
System.out.println("Format 3 "+dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, YYYY, mm:hh");

System.out.println(dateTime.format(formatter));

}
}