public class NotImmutable {
private StringBuilder builder;
public NotImmutable(StringBuilder b){
builder = b;
}
public StringBuilder getBuilder() {
return builder;
}
}

public class MainClass{
	public static void main(String args[]){
StringBuilder sb = new StringBuilder("Initial");
NotImmutable problem = new NotImmutable(sb);
sb.append("added");
StringBuilder gotBuilder = new StringBuilder();
gotBuilder = problem.getBuilder();
gotBuilder.append(" more");
System.out.println(problem.getBuilder());

	}

}