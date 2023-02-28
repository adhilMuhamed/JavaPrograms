package telusko;

public class SelectionDemo {
 
	public static void main(String[] args) {
		
		int n=0;
		
		if(n==0)
			System.out.println("zero");
		else if(n%2==0) 
				System.out.println("even");
		else 
			System.out.println("odd");
		
		
		int i=4;
		int j=0;
		j= (i>6)?1:2;
		System.out.println(j);
		
		
		String a= "abc";
		switch(a) {
		case "abc":
			System.out.println("one");
			break;
		case "fs":
			System.out.println("two");
			break;
		case "gt":
			System.out.println("three");
			break;
		case "qe":
			System.out.println("four");
			break;
		case "as":
			System.out.println("five");
			break;
		default :
			System.out.println("infinte");
			break;
		}
	}
		
}
