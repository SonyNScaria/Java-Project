class Sampleon30
{
private int a;
private int b;
private int c;

public Sampleon30(){
this(5,10,15);
System.out.println("Default constructor invoked");
}
public Sampleon30(int a)
{
	this(a,10,15);
	System.out.println("First constructor invoked");
}
public Sampleon30(int a, int b)
{
	this(a,b,15);
	System.out.println("Second constructor invoked");
}
public Sampleon30(int a,int b, int c)
{
	this.a=a;
	this.b=b;
	this.c=c;
	System.out.println("Third constructor invoked");
}
}

public class MainConstructor
{
public static void main(String args[])
{
Sampleon30 ob1 = new Sampleon30();
}
}