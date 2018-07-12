class Superclass
{
private int a;
protected int b;


public Superclass()
{
System.out.println("Default constructor called !");
}
public Superclass(int a, int b)
{
this.a = a;
this.b = b;
System.out.println("Parameterized constructor called !");
}

public int getA()
{
return a;
}

public int getB()
{
return b;
}

}

public class Subclass extends Superclass
{
	Subclass(int a, int b)
	{
		super(a,b);
	}
public static void main(String args[])
{
Subclass ob1 = new Subclass(4,5);
System.out.println("The value of A :"+ob1.getA());
System.out.println("The value of B :"+ob1.getB());
}
}