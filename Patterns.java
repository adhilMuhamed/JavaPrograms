package telusko;

public class Patterns {

	
public static void main(String[] args) {
		
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=i;j++) 
//				{
//				System.out.print(j +" ");
//				}
//			System.out.println(" "); 
//		}
		
//		for(int i=1;i<=67;i++)
//		{
//			for(char j=65;j<=i;j++) 
//				{
//				System.out.print(j +" ");
//				}
//			System.out.println(""); 
//		}
		int m=4,n=4;
		
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++) {
				if(i == 1 || i == m || j == 1 || j == n)
				{
				System.out.print("$");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
	}
}
