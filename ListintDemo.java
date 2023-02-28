package telusko;
/*
 * 
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListintDemo {

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>();
		values.add(462);//object of integer --wrapper class -- Integer v = new Integer(4)
		values.add(953);
		values.add(612);
		values.add(554);
		values.add(2,339);//add elements using index number in list

//		Collections.sort(values);//ascending order 
//		Collections.reverse(values);// to reverse the order
//		Collections.shuffle(values);//shuffle the values
		
		Comparator<Integer> c =new Comparator<Integer>()
				{
					public int compare(Integer i,Integer j)//sorting logic
					{
						if(i%10>j%10)
							return 1;
						else
							return -1;
					}
				};
		Collections.sort(values, c);//to pass the sorting method 
		
//		for(int i=0;i<values.size();i++) //used to get the length of the list
//		{
//			System.out.println(values.get(i));
//		}
		
//		for(Object o : values)
//		{
//			System.out.println(o);
//		}
		for(Integer o : values)
		{
			System.out.println(o);
		}
	}

}
