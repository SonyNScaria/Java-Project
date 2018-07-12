abstract class ParentAbstract
{
public abstract void eat();
} 
class ChildAbstract extends ParentAbstract
{
public ChildAbstract()
{
System.out.println("Constructor in ChildAbstract invoked");
}
public void eat()
{
	System.out.println("Eat method invoked! ");
}
}
public class MainAbstract
{
public static void main(String args[])
{
ChildAbstract ob1 = new ChildAbstract();
ob1.eat();
}
} 