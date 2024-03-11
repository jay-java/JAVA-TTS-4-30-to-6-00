package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements InitializingBean,DisposableBean{
	private int id;
	private String name;
	private long contact;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
//	public void call() {
//		System.out.println("bean initialized");
//	}
//	public void end() {
//		System.out.println("bean destroyed");
//	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean destroyed");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean started");
	}
	
}
