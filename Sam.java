import java.util.*;
public class Sam
{
public static void main(String args[])
{
List<Integer> ages = new ArrayList<>();
ages.add(Integer.parseInt("5"));
ages.add(Integer.valueOf("6"));
ages.add(null);
for(Integer age : ages)
System.out.println(ages);
}
}