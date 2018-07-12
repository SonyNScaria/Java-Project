import java.util.*;
public class UsingArrayListMethod
{
public static void main(String args[])
{
	List<String> pets1 = new ArrayList<>();
	List<String> pets2 = new ArrayList<>();
	System.out.println(" Check equality for empty arraylists "+pets1.equals(pets2));
	pets1.add("Sony Njaraparambil Scaria");
	pets2.add("Sony Njaraparambil Scaria");
	pets1.add(0,"Sonia");
	pets2.add(1,"Sonia");
	System.out.println(" Check equality for arraylists "+pets1.equals(pets2));                                              
	System.out.println(pets1);
	System.out.println(pets1.get(1));
}
}