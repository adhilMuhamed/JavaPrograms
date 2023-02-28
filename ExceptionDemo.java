package telusko;
/*
 * its good to close the resources in finally block
 * we can write try block without using catch or final  block with the help of try with resource
 * 
 * 
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		int a[]=null;
		a[6]=8;
		int i=7;
		int j=0;
		int k=i/j;
		System.out.println("output is "+ k);
		}
		catch(ArithmeticException  e)
		{
			System.err.println("cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array error");
		}
		catch(Exception e)
		{
			System.out.println("something wrong");
		}
		finally {
		System.out.println("bye");
		}
	}
}
