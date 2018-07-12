class StatEg
{
public static int count;
public static void incre(){
count++;
}
public static void print(){
System.out.println("The value of static variable is "+count);
}
}
public class MainStat
{
public static void main(String[] args)
{
StatEg.print();
StatEg.incre();
StatEg.print();

StatEg ob1 = new StatEg();

ob1.print();
ob1.incre();
ob1.print();

ob1 = null;

ob1.print();
ob1.incre();
ob1.print();



}
}