package telusko;
/*
 * when our only purpose is to override ,we can override while defining object ,as it doesn't have any name it is called anonymous
 *  class ,we cannot reuse anonymous class
 * we can also do the same with interface
 * 
 * 
 */
class H
{
	public void show()
	{
		System.out.println("in  H ");
	}
}
interface Cdm
{
	void show();
}

public class AnonymousClassDemo {

	public static void main(String[] args) 
	{

		H obj =new H()
				{
					public void show()
					{
						System.out.println("am the anonymous");
					}
				};
		obj.show();
		Cdm obj1 =new Cdm()
		{
			public void show()
			{
				System.out.println("am the interface");
			}
		};
		obj1.show();
		
	}

}
