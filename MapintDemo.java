package telusko;
/*in map we use put to add elements
 * uses hashcode doesnt give actual order
 * any key which is not available give us a null
 * we can repeat values but not keys
 * diff b/w hashmap(unsync) and hashtable(synchronized)
 */

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapintDemo {

	public static void main(String[] args) 
	{
//		Map<String,String> map =new HashMap<>() ;
		Map<String,String> map =new Hashtable<>() ;
		map.put("myName", "Navin");
		map.put("Actor", "John");
		map.put("ceo", "marisa");
		
		Set<String> keys = map.keySet();
		
		
		
		for(String key :keys) 
		{
		System.out.println(key +"  " + map.get(key));
		}
		
		
	}

}
