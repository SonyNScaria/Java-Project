public class Varargsbla{

public static void main(String args[]){
try1();
try1(1);
try1(1,3);
try1( new int[]{1,2,3,4,5});
}

static void try1(int... a){
//system.out.println("The length of array"+a);
System.out.println("The length of array"+a.length);
}



}