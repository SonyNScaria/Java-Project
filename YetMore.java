public class YetMore{
static { add(2);}
static void add(int num){System.out.println(num + "");}
YetMore(){ add(5); }
static { add(4);}
{ add(6);}
static { new YetMore(); }
{ add(8); }
public static void main(String args[]){}
 

}