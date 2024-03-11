package autowire;

public class Address {
	private int hno;
	private String street;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int hno, String street) {
		super();
		this.hno = hno;
		this.street = street;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + "]";
	}
	
}
