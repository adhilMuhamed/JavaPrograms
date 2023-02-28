package telusko;
/*
 * types of interface
 * 1.normal-if an interface had more than one method
 * 2.single,abstract method interface(sam)-it can only have one interface-functional interface-lambda expresion-scala
 * 3.marker interface-it doesnt have any methods eg:- serializable
 * 
 * 
 * 
 */
@FunctionalInterface
interface Asd
{
	void show();
}

public class FunctionalInter {

	public static void main(String[] args) 
	{
//		Asd obj =new Asd()
//				{
//					public void show() {
//						System.out.println("interface");
//					}
//				};
//				obj.show();
		Asd obj =() -> System.out.println("interface");//we can define the method of interface like this if its a functional interface		
		obj.show();		
	}

}
