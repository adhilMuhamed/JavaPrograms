package telusko;
/*set doesn't have duplicate values
 * only support unique values
 * the needest value comes first it uses hashing to store in heap
 * traversal is random
 */

import java.util.Set;
import java.util.TreeSet;

public class SetintDemo {

	public static void main(String[] args) 
	{

//		Set<Integer> values = new HashSet<>();
		Set<Integer> values = new TreeSet<>();//we get values in ascending order
		values.add(97);
		values.add(65);
		values.add(92);
		values.add(56);

		
		for(int i : values)
		{
			System.out.println(i);
		}

		
	}

}
