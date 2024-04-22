package SuperKeyword;

public class Child  extends Parent{
public Child()
{
	super();
	System.out.println("Child class instance constructor using super keyword");
}
public static void main(String args[])
{
	Child obj=new Child();
}
}
