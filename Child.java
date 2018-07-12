class Parent 
{
private int a;
public Parent(){
System.out.println("Default constructor called");
}
public Parent(int a){
this.a = a;
System.out.println("Parent constructor invoked. The value of a is "+this.a);
}
}

public class Child extends Parent
{
public Child(int a)
{
super(a);
}

public static void main(String args[]){
Child ob1 = new Child(5);
Child ob2 = new Child();

}

}