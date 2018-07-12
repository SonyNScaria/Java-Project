import java.util.*;

public class UsingWrappersInList
{
public static void main(String args[])
{
List<Double> doublelist = new ArrayList<>();
doublelist.add(10.10);
doublelist.add(20.5);
doublelist.add(new Double(15));
doublelist.add(null);
System.out.println(doublelist);
//double varnew = doublelist.get(2);
System.out.println(doublelist.get(3));

}
}