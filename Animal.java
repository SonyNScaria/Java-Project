	import java.util.*;
	class Animal
{
	private String species;
	private boolean canHop;
	private boolean canSwim;
			public Animal(String name, boolean canHop, boolean canSwim)
		{
			this.species = name;
			this.canHop = canHop;
			this.canSwim = canSwim;
		}
			public boolean canHop() { return canHop; }
			public boolean canSwim() { return canSwim; }
			public String toString() { return species; } 
}
	interface CheckTrait
{
	boolean test(Animal a);
}

	public class CheckIfHopper implements CheckTrait 
{
	public boolean test(Animal a)
	{
		return a.canHop();
		
	}
}

  public class TraditionalSearch 
  {
	  public static void main(String args[])
	  {
		  List<Animal> animals = new ArrayList<Animal>();
		  animals.add(new Animal("fish", false, true));
		  animals.add(new Animal("kangaroo", true, false));
		  animals.add(new Animal("rabbit", true, false));
		  animals.add(new Animal("turtle", false, true));
		  
	  }
  }