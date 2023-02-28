package telusko;
/*instead of making an abstract classs we can make it as an interface because java doesnot support multiple inheritance
 * in interface we can only have abstract methods,if we create any method in interface we dont need to  public abstract
 * we cannot create objects of interface but can create refernce,we can implements multiple interfaces
 * we cannot define methods in interface
 * 
 */
interface Writer
{
	//public abstract -is not needed for interface by default it is public abstract
	void write();
		
}
class Pen implements Writer
{
	public void write()
	{
		System.out.println("is a pen");
	}
}
class Pencil implements Writer 
{
	public void write()
	{
		System.out.println("is a pencil");
	}
}
class Kit
{
	public void dosomething(Writer p)
	{
		p.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args)
	{
		Kit k = new Kit();
		Writer p = new Pen(); 
		Writer pc =new Pencil();
		k.dosomething(p);
		k.dosomething(pc);
	}

}
