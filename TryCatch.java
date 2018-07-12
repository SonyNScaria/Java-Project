public class TryCatch
{
public static void main(String args[])
{
String[] str = new String[3];
//str[0] = "Sony";
//str[1] = "Sonia";
//str[2] = "Neema";
System.out.println(print(str));
}
private static String print(String ars[])
{
	try{
		return ars[0].toUpperCase();
	}
	catch(Exception e)
	{
		System.out.println("Sony Scaria is the best! ");
	}
}
}