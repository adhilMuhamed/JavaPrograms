package telusko;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*collection doesn't work with index number
 * 
 * 
 * 
 */



public class CollectionDemo {

	public static void main(String[] args) 
	{
		Collection values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		
		
//		System.out.println(values);//one way of fetching values from collection
		
		Iterator it =values.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());//to fetch values from collection using iterator
		}


		
	}

}
