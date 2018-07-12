import java.util.*;
public class SortingList
{
public static void main(String args[])
{
//List<Interger> ob1 = new ArrayList<>();
List<Integer> ob1 = Arrays.asList(5,4,3,2,1); //fixed array
System.out.println("Unsorted List "+ob1);
Collections.sort(ob1);
System.out.println("Sorted List "+ob1);

}
}