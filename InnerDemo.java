package telusko;

class Outer
{
	
	public void show()
	{
		System.out.println("outer");
	}
	
	class Inner
	{
		public void display()
		{
			System.out.println("inner ");
		}
	}
	
}

public class InnerDemo
{
	public static void main(String[] args) 
	{
		Outer obj =new Outer();
		obj.show();
		
		Outer.Inner obj1 = obj.new  Inner();//called using outer class and created object using the object of outer class
		obj1.display();
		
		

	}

}
