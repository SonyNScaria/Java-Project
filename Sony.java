public class Sony {
public static void main(String args[]){
int num=5;
System.out.println(args[0]);
add(num);
System.out.println("The value of number variable after executing the method is "+num);
}
static void add(int a){
a+=5;
System.out.println("The value of number variable inside the method is "+a);
}

}