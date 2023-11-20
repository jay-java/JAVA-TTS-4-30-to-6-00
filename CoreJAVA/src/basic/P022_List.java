package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class P022_List {
	public static void main(String[] args) {
		List list = new ArrayList();
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
