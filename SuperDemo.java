package telusko;
/*
 * when we create an object of subclass it also call the constructor of superclass
 * it doesnt matter what type of object we create in subclass it always call the default constructor of the super class
 * super is there by default in subclass-it means it call the constructor of the superclass
 * 
 * 
 */
class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
		super(5);
		System.out.println("in B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("in B int");
	}
}


public class SuperDemo {

	public static void main(String[] args) 
	{ 
		B obj=new B();
		
		
		
	}

}
