package telusko;
/*
 *if we make the class abstract we cannot create the object of it ,we cannot instantiate the class 
 * if there is abstarct method in class the class should be abstract
 * when creating object we need to give abstract class reference 
 * whenever we inherits an abstract class we need to imlement the method
 */
abstract class Human
{
	public abstract void eat();
	
	public void walk()
	{
		
	}
}
class Man extends Human//concrete class
{
	public void eat()
	{
		
	}
}

class Printer
{
	public void show(Number i)
	{
		System.out.println(i);
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {

//		Human obj=new Man();
		Printer obj = new Printer();
		obj.show(5);
		obj.show(5.5);
		
	}

}
