public class ConstructorChaining{
private int a;
private int b;
private int c;

private ConstructorChaining(int a, int b, int c){
this.a = a;
this.b = b;
this.c = c;
}

private ConstructorChaining(int a, int b){
this(a,b,6);
}

private ConstructorChaining(int a){
this(a,6);
}

private void printValue(){
System.out.println(" The value of A : "+a+"\n The value of B : "+b+" \n The value of C : "+c);
}

public static void main(String args[]){
ConstructorChaining ob1 = new ConstructorChaining(6);
ob1.printValue();
}

} 