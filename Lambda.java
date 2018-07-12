import java.util.*;
import java.util.function.*;

class Animal
{
private String name;
private boolean canFly;
private boolean canSwim;
private boolean canPlay;

public Animal(String name, boolean canFly, boolean canSwim, boolean canPlay)
{
this.name = name;
this.canFly = canFly;
this.canSwim = canSwim;
this.canPlay = canPlay;
}

public String getName()
{
	return name;
}
public boolean canFly()
{
return canFly;
}

public boolean canSwim()
{
return canSwim;
}

public boolean canPlay()
{
return canPlay;
}

}

public class Lambda
{
	
	
	
public static void main(String args[])
{
	List<Animal> animals = new ArrayList<>();
	animals.add(new Animal("Dog", true, true, true));
	animals.add(new Animal("Fish", false, true, true));
	print(animals, animal->animal.canFly());
	print(animals, animal->animal.canSwim());
	
}
public static void print(List<Animal> animals, Predicate<Animal> check)
{
	for(Animal animal : animals)
	{
		if(check.test(animal))
		{
			System.out.println(animal.getName());
		}
	}
}
}
