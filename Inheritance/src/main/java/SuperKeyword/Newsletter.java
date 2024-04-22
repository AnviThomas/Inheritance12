package SuperKeyword;

public class Newsletter extends News{
int c=3;
public void display()
{
	System.out.println(super.c);
	System.out.println(c);
}
public static void main(String args[])
{
	Newsletter obj=new Newsletter();
	obj.display();
}
}
