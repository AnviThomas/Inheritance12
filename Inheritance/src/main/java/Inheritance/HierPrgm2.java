package Inheritance;

public class HierPrgm2 extends HierPrgm{
public void display()
{
	System.out.println("Safe");
}
public static void main(String args[])
{
	HierPrgm2 obj1=new HierPrgm2();
	obj1.show();
	obj1.display();

}
}
