package basic;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class P028_HashTable {
	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(1, "c");//entry
		map.put(2,"c++");
		map.put(3, "java");
		map.put(4, "python");
//		map.put(null, "php");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
//			System.out.println(itr.next());
		}
		
	}
}
