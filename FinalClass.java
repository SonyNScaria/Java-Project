import java.util.*;

public class FinalClass
{
public static final int a;
public static final int b;
public static final int c = 5;
public static final List<String> VALUES = new ArrayList<>();

static
{
System.out.println("Static Initializers called: 1");
a=20;
//b=30;
}
static
{
System.out.println("Static Initializers called: 2");
//a=20;
b=30;
}
public static void main(String[] args)
{
	VALUES.add("Jesus Christ");
	VALUES.add("Sony N Scaria");
	System.out.println(VALUES);
}

}