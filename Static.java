public class Static
{
public static void method1(){
System.out.println("Static method 1 called");
//method2();
//method3();
}
public static void method2(){
System.out.println("Static method 2 called");
}
public void method3(){
System.out.println("Non-Static method 3 called");
method2();
}
public static void main(String[] args)
{
method1();
new Static().method3();
}
}