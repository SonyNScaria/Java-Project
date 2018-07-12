import java.util.*; 
public class ListArrayConversion
{
public static void main(String args[])
{
String[] abc = {"Jesus","Sony","Sonia"};
System.out.println("String Array "+Arrays.toString(abc));
List<String> new1 = Arrays.asList(abc);
System.out.println(new1);
new1.add("Neethu");
System.out.println(new1);
}
}
