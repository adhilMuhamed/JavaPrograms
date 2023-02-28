package telusko;
/*
 *in java 1.8 can define methods in interface 
 * we need to use default keyword in interface to define a method in interface
 * we can define static method in interface so we dont need objects to call interface we can call it using interface name
 * by default if we create a variable inside interface it become final
 */
@FunctionalInterface
interface Demo
{
	void abc();
	default void show()
	{
		System.out.println("in show");
	}
}
class DemoImp implements Demo
{
	public void abc()
	{
		System.out.println("in abc");
	}
}


public class InterfaceDemo3 {

	public static void main(String[] args) {

		Demo obj =new DemoImp();
		obj.show();
		obj.abc();
		
		
	}

}
