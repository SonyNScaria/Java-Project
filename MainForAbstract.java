abstract class Animal
{
public abstract void name();
}

interface HasTail
{
public static int WEIGHT_OF_TAILS = 3;
public abstract void tail();
}

abstract class Dog extends Animal implements HasTail
{
public abstract void DogMethod();
}

public class MainForAbstract
{
public void name()
{
System.out.println("Name method implemented");
}
public void tail()
{
System.out.println("Tail method implemented");
}
public void DogMethod()
{
System.out.println("Dog method implemented");
}
public static void main(String args[])
{
MainForAbstract ob1 = new MainForAbstract();
ob1.name();
ob1.tail();
ob1.DogMethod();
}
}