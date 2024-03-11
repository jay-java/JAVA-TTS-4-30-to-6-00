package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User1 {
	private int id;
	private String name;
	
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

	@Override
	public String toString() {
		return "User1 [id=" + id + ", name=" + name + "]";
	}
	
	@PostConstruct
	public void call() {
		System.out.println("bean started");
	}
	@PreDestroy
	public void end() {
		System.out.println("bean end");
	}
	
	
}
