class PassByValueString{
public static void main(String args[]){
String name = "Sony";
updateName(name);
System.out.println("The value in string variable name after the method is executed is "+name);
}

static void updateName(String temp){
temp="Sonia";
System.out.println("The value in string variable name inside the method is "+temp);
}

}