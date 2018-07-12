class AAA 
{
public void say()
{
System.out.println("It is the mother");
}
}
class A extends AAA
{
public void say()
{
System.out.println("It is the son");
}
}
class B extends AAA
{
public void say()
{
System.out.println("It is the daughter");
}
}

public class MainToday
{
	
public static void sam(AAA ob)
{
System.out.println("hi"ob.say()));
}

public static void main(String args[])
{
sam(new A());
sam(new B());
}
}