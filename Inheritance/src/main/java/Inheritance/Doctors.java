package Inheritance;

public class Doctors extends Hospitals{
public void print()
{
	System.out.println("Doctors are all appointed");
}
public static void main(String args[])
{
	Doctors obj=new Doctors();
			obj.print();
	obj.display();
}
}
