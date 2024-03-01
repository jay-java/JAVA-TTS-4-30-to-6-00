package OneToManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	@ManyToOne
	private Seller seller;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int pid, String pname, Seller seller) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.seller = seller;
	}
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", seller=" + seller + "]";
	}
	
}
