package consInjection;

public class User {
	private int a;
	private int b;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int a, int b) {
		
		super();
		System.out.println("data set by int");
		this.a = a;
		this.b = b;
	}
	public User(String a, String b) {
		super();
		System.out.println("data set by string cons");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	public User(double a, int b) {
		super();
		System.out.println("data set by double int cons");
		this.a = (int)a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "User [a=" + a + ", b=" + b + "]";
	}
	
	

	
	
}
