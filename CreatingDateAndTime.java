import java.time.*;
import java.util.*;
public class CreatingDateAndTime
{
public static void main(String args[])
{
System.out.println("Time now "+LocalTime.now());
System.out.println("Date today "+LocalDate.now());
System.out.println("Date and Time"+LocalDateTime.now());

LocalDate localdate = LocalDate.of(2018,Month.JANUARY, 1);
LocalTime localtime = LocalTime.of(10,30);

System.out.println("My Time "+localtime);
System.out.println("My Date "+localdate);

LocalDateTime localdatetime = LocalDateTime.of(localdate, localtime);

System.out.println("Combined Date and Time "+localdatetime);

System.out.println("Old approach"+new Date());
Calendar calendar = Calendar.getInstance();
calendar.set(2015, Calendar.JANUARY, 1);
Date january = calendar.getTime();
System.out.println(january);

}
}