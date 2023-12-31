package basic;

import java.util.ArrayList;
import java.util.List;

class Users{
	int id;
	String name;
	String address;
	long con;
	public Users(int id, String name, String address, long con) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.con = con;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", address=" + address + ", con=" + con + "]";
	}
	
}
public class P023_listPractical {
	public static void main(String[] args) {
		Users u1 = new Users(1,"java","ahmedabad",1232);
		Users u2 = new Users(2,"python","ahmedabad",1232);
		Users u3 = new Users(3,"php","ahmedabad",1232);
		Users u4 = new Users(4,".net","ahmedabad",1232);
		List<Users> list = new ArrayList<Users>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		System.out.println(list);
		for(Users u:list) {
			System.out.println(u);
		}
	}
}
