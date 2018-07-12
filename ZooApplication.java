import java.time.*;

public class ZooApplication{


public static void main(String args[]){

LocalDate start = LocalDate.of(2015,Month.JANUARY,1);
LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

System.out.println("Start date"+start);
System.out.println("End date"+end);

rotate(start,end);

}

public static void rotate(LocalDate start, LocalDate end){
LocalDate temp = start;
while(temp.isBefore(end)){

System.out.println("Toy for"+temp);

temp = temp.plusMonths(1);

}
}


}