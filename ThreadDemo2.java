package telusko;
/*by default the thread name starts with 0
 * range of priority goes from 1 - 10 (1 least and 10 most)
 * 
 * 
 * 
 * 
 */
public class ThreadDemo2 {

	public static void main(String[] args) throws Exception
	{ 

		Thread t1 = new Thread(() ->   
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hi");
				try{Thread.sleep(500);}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		},"Hi thread");
		Thread t2 = new Thread(() ->   
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try{Thread.sleep(500);}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		},"Hello thread");
		
//		t1.setName("Th1"); one way to setname for thread
//		t2.setName("Th2");
		
//		System.out.println(t1.getName()); -- to get the names of thread
//		System.out.println(t2.getName());
		
//		t1.setPriority(6); //to set priority
//		t2.setPriority(2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);//another way of setting minimum priority
		
		System.out.println(t1.getPriority());//to get priority
		System.out.println(t2.getPriority());
		
		t1.start();
		t2.start();
		
//		System.out.println(t1.isAlive());  ---to check whether the thread is running or not
		
		t1.join();
		t2.join();
		
//		System.out.println(t1.isAlive());
		
		System.out.println("bye");
	}

}
