package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private List<Long> contact;
	private Set<String> names;
	private Map<Integer, String> maps;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, List<Long> contact, Set<String> names, Map<Integer, String> maps) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.names = names;
		this.maps = maps;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getContact() {
		return contact;
	}
	public void setContact(List<Long> contact) {
		this.contact = contact;
	}
	public Set<String> getNames() {
		return names;
	}
	public void setNames(Set<String> names) {
		this.names = names;
	}
	public Map<Integer, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<Integer, String> maps) {
		this.maps = maps;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", names=" + names + ", maps=" + maps
				+ "]";
	}
	
	
}
