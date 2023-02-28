package telusko;

class Calc2{
	
	int num1,num2,result;
	
	public Calc2(int num1,int num2) 
	{
		this.num1=num1; //current object
		this.num2=num2;
	}	
}


public class ThisKey {
	
	public static void main(String [] args) {
		
		Calc2 obj = new Calc2(4,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
