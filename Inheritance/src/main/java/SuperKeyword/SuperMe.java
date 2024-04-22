package SuperKeyword;

public class SuperMe extends SuperMethod{
public void show()
{
	super.display();
	System.out.print("CHild class with Super instance Method");
}
public static void main(String args[])
{
	SuperMe obj=new SuperMe();
	obj.show();
	
}
}
