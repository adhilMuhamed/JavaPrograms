package telusko;

class Calc{
	
	int num1,num2;
	double result;	
	public int add(int a, int b)
	{
//		result=num1+num2;	
		return a+b;
	}	
	public void sub()
	{
		result=num1-num2;		
	}
	public void product()
	{
		result=num1*num2;		
	}
	public void division()
	{
		result=num1/num2;		
	}
}


public class ObjectDemo {

	public static void main(String[] args) {
		
		Calc obj;  //reference  variable
		obj =new Calc();
		obj.num1=10;
		obj.num2=2;
		obj.add(5,6);		
		System.out.println(obj.result);
		obj.sub();		
		System.out.println(obj.result);
		obj.product();		
		System.out.println(obj.result);
		obj.division();		
		System.out.println(obj.result);
	}
}
