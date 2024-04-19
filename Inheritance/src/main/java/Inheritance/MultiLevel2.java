package Inheritance;

public class MultiLevel2 extends MultiLevel1{
public void show()
{
	System.out.println("2nd subclass of parent class");
}
public static void main(String args[])
{

MultiLevel2 obj=new MultiLevel2();
obj.print();
obj.num();
obj.show();
}
}