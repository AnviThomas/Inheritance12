package Inheritance;

public class HierarchialEgs extends HierarchialEx {
public void num()
{
	System.out.println("class c from parent a");
}
public static void main(String args[])
{
	HierarchialEgs obj=new HierarchialEgs();
	obj.num();
	obj.show();

}
}
