package telusko;

class Calculator extends Calc
{
	public int mod(int i,int j)
	{
		return i%j;
	}
}



public class Inheritance {

	public static void main(String[] args) 
	{
		Calculator cl =new Calculator();
		System.out.println(cl.mod(10,3));
		System.out.println(cl.add(10,3));
		

	}

}
