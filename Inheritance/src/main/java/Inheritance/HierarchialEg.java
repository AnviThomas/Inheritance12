package Inheritance;

public class HierarchialEg extends HierarchialEx{
public void print()
{
	System.out.println("class b");
}
public static void main(String args[])
{
	HierarchialEg obj1=new HierarchialEg();
	obj1.print();
	obj1.show();
}
}
