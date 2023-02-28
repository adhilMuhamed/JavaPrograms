package telusko;
/*once we make a variable final it becomes a constant it cant change
 * we can make our class as final so it cant be extended
 * if we make a method final no one can override the method
 * 
 */
class F
{
//	final int DAY;//constant
	public  void show()
	{
	  System.out.println("in F");
	
	}
}
class G extends F
{
	public void show()
	{
	  System.out.println("in G");
	
	}
}

public class FinalDemo {

	public static void main(String[] args) 
	{
//		F obj = new F();
//		System.out.println(obj.DAY);
		
		G obj = new G();
		obj.show();
	}

}
