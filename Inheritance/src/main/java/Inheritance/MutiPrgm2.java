package Inheritance;

public class MutiPrgm2 extends MutiPrgm1{
	String name;
	public MutiPrgm2()
	{
		super(5,4);
	}
	public void show()
	{
		System.out.println("Anvi");
	}
	public static void main(String args[])
	{
		MutiPrgm2 obj=new MutiPrgm2();
		obj.add();
		obj.sub();
		obj.show();
	}
	}



