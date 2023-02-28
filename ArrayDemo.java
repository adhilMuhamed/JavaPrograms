package telusko;

//we can create array of objects using class name

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
//		int nums[] = {3,45,12,54};	
//		for(int i=0;i<=3;i++) {
//			System.out.println(nums[i]);
//		}
		
		
//		int a[] = {1,2,3,4};
//		int b[] = {2,4,6,8};
//		int c[] = {1,3,5,7};
		
//		int d[][] = {
//				{1,2,3,4},{2,4,8},{1,3,5,7,9}
//		};
//		
//		for(int i=0;i<d.length;i++) //rows number
//		{
//		for(int j=0;j<d[i].length;j++) //colums number,in jagged array we use length function
//			{
//			System.out.print("  " + d[i][j]);
//			}
//		System.out.println();
//		}
		
//		int a[] = {1,2,3,4};
//		
//		
//		for(int k : a) //enhanced forloop for 1d
//		{
//			System.out.println(k);
//		}
		
		int d[][] = 
			{
			{1,2,3,4},{2,4,8},{1,3,5,7,9}
			};
		for(int k[] : d)//enhanced for loop for 2d array
		{
			for(int l : k) {
			System.out.print(l);
			}
			System.out.println();
		}
		
		
		
	}
}
