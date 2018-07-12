import java.time.*;
import java.util.*;
public class UsingDateAndTime
{
public static void main(String args[])
{
LocalDate localdate = LocalDate.of(2030, Month.JANUARY,1);
localdate = localdate.plusDays(35).plusMonths(13);
System.out.println("The set time "+localdate);


Date myDate = new Date();
System.out.println("Current date and time using old JAVA method from DATE object "+myDate);
Calendar calendar = Calendar.getInstance();
calendar.setTime(myDate);
System.out.println("Current date and time using old JAVA method from CALENDAR object "+calendar.getTime());
calendar.set(Calendar.DATE, 1);
calendar.set(Calendar.MONTH, 1);
System.out.println("Current date and time using old JAVA method from CALENDAR object after update	 "+calendar.getTime());


}
}