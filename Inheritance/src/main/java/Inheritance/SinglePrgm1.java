package Inheritance;

public class SinglePrgm1 extends SinglePrgm
{
public void sub() 
{
	int sub=a-b;
	System.out.println("Substraction is "+ sub);
}
public static void main(String args[])
{
	SinglePrgm1 obj=new SinglePrgm1();
	obj.add();
	obj.sub();
}
}
