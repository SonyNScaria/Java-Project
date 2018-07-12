import java.time.*;
public class UsingPeriod
{
public static void main(String args[])
{
LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
Period period = Period.of(0,0,1);
System.out.println(period);
cleanMe(start,end);
System.out.println("Enhanced method with Period object");
cleanMe(start,end,period);
}

public static void cleanMe(LocalDate start,LocalDate end)
{
	while(start.isBefore(end))
	{
		System.out.println("Needs to clean the Zoo on : "+start);
		start = start.plusMonths(1);
	}
}
public static void cleanMe(LocalDate start,LocalDate end, Period period)
{
	while(start.isBefore(end))
	{
		System.out.println("Needs to clean the Zoo on : "+start);
		start = start.plus(period);
	}
}

}