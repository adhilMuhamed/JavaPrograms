package telusko;

class Abc
{
	public int add(int ... i)//the parameters reach here as an array  i become array
	{
		int sum=0;
		for(int k : i)
		{
			sum=sum+k;
		}
		return sum;
	}
}


public class Varargs {

	public static void main(String[] args) 
	{
		
	Abc obj = new Abc();
	System.out.println(obj.add(4,5,6,7));

	}

}
