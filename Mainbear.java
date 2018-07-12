class Motherbear
{
public final void eat()
{
System.out.println("Mother bear takes care of its children by saving some food for them");
}
}
class Childbear extends Motherbear
{
	public final void eat()
{
System.out.println("Mother bear takes care ofkla dren by saving some food for them");
}
}

public class Mainbear
{
public static void main(String args[])
{
Childbear ob1 = new Childbear();
ob1.eat();
}
}