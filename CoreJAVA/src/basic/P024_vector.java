package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class P024_vector {
	public static void main(String[] args) {
		List list = new Vector();
		list.add(1);
		list.add("java");
		list.add(235324532);
		list.add(false);
		list.add('d');
		System.out.println(list);
		list.add(1);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
