import java.util.ArrayList;
import java.util.*;
class Animal
{
private String type;
private boolean canJump;
private boolean canSwim;

public Animal(String type, boolean canJump, boolean canSwim)
{
this.type = type;
this.canJump = canJump;
this.canSwim = canSwim;
}

public String getType()
{
return type;
}

public boolean getCanJump()
{
return canJump;
}

public boolean getCanSwim()
{
return canSwim;
}

}

interface CheckAnimal
{
public boolean check(Animal animal);
}

class CheckCanJump implements CheckAnimal
{
public boolean check(Animal animal)
{
 return animal.getCanJump();
}
}

public class LambdaExpressions
{
public static void main(String args[])
{
List<Animal> animals = new ArrayList<>();
animals.add(new Animal("fish", false, true));
animals.add(new Animal("rabbit", true, false));
animals.add(new Animal("dog", true, true));
print(animals, new CheckCanJump());
}

public static void print(List<Animal> animals, CheckAnimal filter)
{
for(Animal animal:animals)
{
if(filter.check(animal))
{
System.out.println(animal.getType());
}
}
}
}
