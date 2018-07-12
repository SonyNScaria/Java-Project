import java.util.*;
public class VariableArguments
{
public static void main(String... args)
{
print();
print( new String[]{"Sony","Neethu","Umma"});
print("Sony Scaria");
}
private static void print(String... var)
{
System.out.println("The length is "+var.length);
System.out.println("The value of the variable is "+Arrays.toString(var));
}
}