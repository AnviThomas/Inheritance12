package SuperKeyword;

public class Super2 extends Super1{
	String a="Soli";
public void display()
{
	System.out.println(super.a);
	System.out.print(a);
}
public static void main(String args[])
{
	Super2 obj=new Super2();
	obj.display();
}

}
