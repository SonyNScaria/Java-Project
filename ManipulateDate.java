import java.time.*;

public class ManipulateDate{

public static void main(String args[]){

LocalDate ob = LocalDate.of(2015,Month.JANUARY, 1);
ob = ob.plusDays(2);
System.out.println(ob);
ob = ob.plusWeeks(2);
System.out.println(ob);
}
}