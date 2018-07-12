interface H
{
void eatPlant();
default void eatMeat()
{
System.out.println("Default method for earMeat is invoked");
}
}
public class MainDefault implements H
{
public void eatPlant()
{
System.out.println("eatPlant method invoked from main class");
}
public void eatMeat()
{
System.out.println("earMeat is invoked from main class");
}
public static void main(String args[]){
MainDefault ob1 = new MainDefault();
ob1.eatPlant();
ob1.eatMeat();
}
}