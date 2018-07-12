import java.util.*;

public class SearchingList
{
public static void main(String args[])
{
List<Integer> ob1 = Arrays.asList(5,4,3,2,1);
System.out.println(ob1);
Collections.sort(ob1);
System.out.println("Sorted Array "+ob1);
int find = Collections.binarySearch(ob1,5);
System.out.println("The index is at "+find);
}
}