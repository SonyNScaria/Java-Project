public class Common
{
public int publicVar;
protected int protectedVar;
private int privateVar;
int defaultVar;

public void publicMethod()
{
System.out.println("Public Method invoked");
}

protected void protectedMethod()
{
System.out.println("Protected Method invoked");
}

private void privateMethod()
{
System.out.println("Private Method invoked");
}

void defaultMethod()
{
System.out.println("Default Method invoked");
}
void sample()
{
publicMethod();
}

public static void main(String[] args)
{
	Common ob1=new Common();
//ob1.publicMethod();
//ob1.protectedMethod();
//ob1.privateMethod();
//ob1.defaultMethod();
ob1.sample();
}
}