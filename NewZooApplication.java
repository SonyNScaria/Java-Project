import java.time.*;

public class NewZooApplication{

public static void main(String args[]){

LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
Period period = Period.ofMonths(1);

rotate(start,end,period);

}

public static void rotate(LocalDate start, LocalDate end, Period period){

LocalDate tmp = start;

while(tmp.isBefore(end)){

System.out.println("New Toy given on : "+tmp);

tmp = tmp.plus(period);


}


}


}