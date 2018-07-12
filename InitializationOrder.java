public class InitializationOrder{
	
	private String name = "Sony is loved";

	{ System.out.println(name); }

	private static int count = 0;

	static { System.out.println(count);}
 
	{ count++; System.out.println(count); }
 
	public InitializationOrder(){
		
	System.out.println("Inside Constructor");
	
	}
	
	public static void main(String args[]){
		new InitializationOrder();
	}

}