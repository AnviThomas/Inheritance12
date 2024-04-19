package Inheritance;

public class HierPrgm1 extends HierPrgm{
public void print()
{
	System.out.println("is out");
}
public static void main(String args[])
{
	HierPrgm1 obj=new HierPrgm1();
	obj.show();
	obj.print();
}
}
