class Animal
{
	private int age;
public Animal(int age)
{
System.out.println("Animal constructor invoked");
this.age = age;
}
public void eat()
{
	System.out.println("Animal is eating");
}
}
class Dog extends Animal
{
public Dog(int age)
{
	super(age);
System.out.println("Dog constructor invoked");
}
public void eat()
{
	System.out.println("Dog is eating");
}
}
class Husky extends Dog
{
public Husky(int age)
{
	super(age);
System.out.println("Husky constructor invoked");
}
public void eat()
{
	super.eat();
	System.out.println("Husky is eating");
}
}
public class MainAnimal
{
	public static void main(String args[])
	{
		Husky ob1 = new Husky(9);
		ob1.eat();
	}
}
