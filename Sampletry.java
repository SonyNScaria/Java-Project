public class Sampletry
{
	
public static void main(String[] args)
{
int a;
a=100;
String name = "Jesus Christ";
StringBuilder ob1= new StringBuilder();
stringBuilder(ob1);
System.out.println(ob1);
//System.out.println("The value of String before the method is called"+name);
//putNumber(a);
//putName(name);
//System.out.println("The value of String after the method is called"+name);

}
public static void putNumber(int a)
{
a+=5;
System.out.println("The value of a inside the method after adding by 5 is "+a);
}
public static void putName(String name)
{
	System.out.println("The name that is passed on to me"+name);
	name="SONY SCARIA";
	System.out.println("The name after new value is provided"+name);
	
}
public static void stringBuilder(StringBuilder ob1)
{
	ob1 = new StringBuilder();
	ob1.append("Sony is the best");
}
}