package telusko;
/*
 * child class method will override 
 * 
 * 
 * 
 */
class C
{
	public void show()
	{
		System.out.println("in C");
	}
}
class D  extends C
{
	
	public void show()
	{
		System.out.println("in D");
	}
	public void config()
	{
		System.out.println("in config");
	}
}
class E extends C
{
	public void show()
	{
		System.out.println("in E");
	}
}


public class OverridingDemo {

	public static void main(String[] args) 
	{

		C obj =new D();//runtime polymorphism
		obj.show();
		
		obj=new E();//dynamic method dispatch
		obj.show();
	}

}
