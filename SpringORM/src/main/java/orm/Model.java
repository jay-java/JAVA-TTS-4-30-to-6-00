package orm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {
	@Id
	private int id;
	private String name;
	private String address;
	private long contact;
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Model(int id, String name, String address, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
}
