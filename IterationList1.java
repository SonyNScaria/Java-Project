import java.util.*;
public class IterationList1
{
public static void main(String args[])
{
List<Integer> ob1 = Arrays.asList(5,6,7,3,2,1);
Collections.sort(ob1);
for(int i=0;i<ob1.size();i++)
{
System.out.println("Normal FOR: Item at index "+i+" : "+ob1.get(i));
ob1.remove(i);
}
for(Integer a: ob1)
{
	System.out.println("Enhanced FOR: "+a);
}
}
}