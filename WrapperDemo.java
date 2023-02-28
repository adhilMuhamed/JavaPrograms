package telusko;
/*
 * primitive works faster than wrapperclass ,there are certain framwworks that only support wrapper class
 * 
 * 
 */

public class WrapperDemo {

	public static void main(String[] args) 
	{
		int i = 5;//primitive data type
		Integer ii =new Integer(i);//wrapper class,boxing-- when primitive data type is assigned to object
		
		int j =ii.intValue();//unboxing
		
		System.out.println(i);
		System.out.println(ii);
		
		String str ="123";
		int n= Integer.parseInt(str);
		System.out.println(n);
	}

}
