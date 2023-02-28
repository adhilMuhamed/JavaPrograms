package telusko;

class Employee{
	
	int eid;
	int salary;
	static String ceo ;
	
	static // when you load a class,will get executed first before constructor
	{
		ceo="larry";
		System.out.println("in static");
	}
	
	
	public Employee() //executes when we create an object
	{
		eid=1;
		salary=300;
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(eid + ":" + salary + ":" + ceo);
	}
	
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Employee navin = new Employee();
//		navin.eid=8;
//		navin.salary=400;
//		Employee.ceo ="Mahesh";
		Employee rahul = new Employee();
//		rahul.eid=7;
//		rahul.salary =500;
//		Employee.ceo ="Mahesh";
//		Employee.ceo ="nikita";//we dont need object while using static
		
		navin.show();
		rahul.show();

	}

}
