package rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserDAO {
	List<User> users;
	public UserDAO() {
		users = new ArrayList<User>();
		User u1 = new User(1, "java");
		User u2 = new User(2, "python");
		User u3 = new User(3, "dart");
		User u4 = new User(4, "kotlin");
		users.addAll(Arrays.asList(u1,u2,u3,u4));
	}
	
	public List<User> getAllUser(){
		return users;
	}
	
	public User getUserById(int id){
		return users.stream().filter(x->x.getId()==id).collect(Collectors.toList()).get(0);
	}
	
	public List<User> addUser(User u) {
		users.add(u);
		return users;
	}
	
	public List<User> deleteUser(int id){
		users.removeIf(x-> x.getId() == id);	
		return users;
	}
	
	public List<User> updateUser(int id, String name){
		users.stream().filter(x->x.getId()==id).collect(Collectors.toList()).get(0).setName(name);
		return users;
	}
	
}
