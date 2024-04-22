package SuperKeyword;

public class Birds extends Animals{
public void show()
{
	super.show();
	System.out.println("Birds are also taken care off");
}
public static void main(String args[])
{
	Birds obj=new Birds();
	obj.show();
	
}
}
