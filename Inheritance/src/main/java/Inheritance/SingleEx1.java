package Inheritance;

public class SingleEx1 extends SingleEx
{
public void show()
{
	System.out.println("Child class");
}
	public static void main(String args[])
	{
		SingleEx1 obj=new SingleEx1();
		obj.display();
		obj.show();
	}
}
