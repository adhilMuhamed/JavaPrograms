package telusko;
/*
 * 
 * 
 * 
 * 
 */

interface Abcd
{
	void show();
}
class Imp implements Abcd
{
	public void show()
	{
		System.out.println("anything");
	}
}
public class InterfaceDemo2 
{

	public static void main(String[] args) 
	{
		Abcd obj = new Imp();
		obj.show();
	}

}
