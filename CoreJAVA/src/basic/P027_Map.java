package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class P027_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");//entry
		map.put(2,"c++");
		map.put(3, "java");
		map.put(4, "python");
		map.put(null, "php");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
//			System.out.println(itr.next());
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter username : ");
		int u_name = sc.nextInt();
		if(map.containsKey(u_name)) {
			System.out.println("enter your pass : ");
			String pass = sc.next();
			if(map.get(u_name).equals(pass)) {
				System.out.println("correct");
			}
			else {
				System.out.println("password incorrect");
			}
		}
		else {
			System.out.println("username not exist : Do you want to Add ? ");
			System.out.println("Y/N");
			String ans = sc.next();
			if(ans.equals("Y")) {
				System.out.println("enter your pass : ");
				String pass = sc.next();
				map.put(u_name, pass);
				System.out.println(map);
			}
			else {
				System.out.println("Done!");
			}
		}
		
	}
}
