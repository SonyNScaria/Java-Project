class War
{
public static void print(int... taken)
{
System.out.println("The length of the array is "+taken.length);
for(int taking: taken)
{
	System.out.println("The value is "+taking);
}
}
}
public class MainWar
{
public static void main(String args[])
{
War.print();
War.print(1,2,3);
War.print(new int[]{4,6,7,8});
}
}
