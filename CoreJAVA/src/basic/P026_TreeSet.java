package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P026_TreeSet {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(1);
		set.add(12412);
		set.add(-23453453);
		set.add(0);
		set.add(-5645);
//		set.add(1);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
