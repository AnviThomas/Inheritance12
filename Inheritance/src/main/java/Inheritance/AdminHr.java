package Inheritance;

public class AdminHr extends Hospitals{
public void show()
{
	System.out.println("Administrative departments are handled");
}
public static void main(String args[])
{
	AdminHr obj1=new AdminHr();
	obj1.display();
	obj1.show();
}
}
