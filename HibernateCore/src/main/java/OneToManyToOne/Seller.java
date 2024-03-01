package OneToManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Seller {
	@Id
	private int sid;
	private String name;
	@OneToMany(mappedBy = "seller")
	private List<Product> products;
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seller(int sid, String name, List<Product> products) {
		super();
		this.sid = sid;
		this.name = name;
		this.products = products;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Seller [sid=" + sid + ", name=" + name + ", products=" + products + "]";
	}
	
}
