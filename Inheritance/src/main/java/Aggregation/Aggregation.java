package Aggregation;

public class Aggregation {
int page;
float index;
Aggre a;
	public Aggregation(int page, float index ,Aggre a)
	{
		this.page=page;
		this.index=index;
		this.a=a;
	}
	public void display()
	{
		System.out.println(a.name + " " + a.price);
		System.out.println("Page is "+ page);
		System.out.println("Index is " + index);
	}
	public static void main(String args[])
	{
		Aggre obj1=new Aggre("Shakespeare", 525);
		Aggregation obj=new Aggregation(66,23.5f,obj1);
		obj.display();
	}
}
