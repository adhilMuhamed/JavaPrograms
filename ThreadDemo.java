package telusko;
/*main is a default thread
 * we can use thread by extending thread class or implementing runnable interface
 * we can pass the objects as threads while implementing interface
 * while using interface we need to use objects of thread
 * join is a method which will join after executing the thread
 * isAlive is used to see if the thread is in running or not
 */
//class Hi extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Hi");
//			try{Thread.sleep(500);}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
//	}
//}
//class Hello extends Thread
//{
//	public void run()
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Hello");
//			try{Thread.sleep(500);}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
//	}
//}
public class ThreadDemo {

	public static void main(String[] args) throws Exception
	{
//		using class 
//		Hi obj=new Hi();
//		Hello obj1 = new Hello();
//		obj.start();
//		obj1.start();
		
		
// 		using interface		
//		Runnable  obj=new Hi();
//		Runnable obj1 = new Hello();
//		
//		Thread t1 = new Thread(obj);
//		Thread t2 = new Thread(obj1);
//		
//		t1.start();
//		t2.start();
//		
		
//		using lambda 
		Runnable  obj=new Runnable() {
			public void run()
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hi");
					try{Thread.sleep(500);}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			}
		};
		Runnable obj1 = () ->   // second way
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hello");
					try{Thread.sleep(500);}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			};
			
			
		
		
		Thread t1 = new Thread(() ->   // third way -the object can be removed
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try{Thread.sleep(500);}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		Thread t2 = new Thread(obj1);
		
		t1.start();		
		t2.start();
		
//		t1.join(); will join here after completing the tasks
//		t2.join();
		
		
		System.out.println("bye");
		
	}

}
