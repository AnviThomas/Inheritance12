package Aggregation;

public class Relative {
String a;
int b;
Parent1 c;
public Relative(String a, int b, Parent1 c)
{
	this.a=a;
	this.b=b;
	this.c=c;
}
public void display()
{
	System.out.println(c.name + "" + c.age);
	System.out.print(a + ""+ b);
}
public static void main(String args[])
{
	Parent1 obj=new Parent1("Author ",25);
	Relative obj1=new Relative("Book ",45,obj);
	obj1.display();
}
}
