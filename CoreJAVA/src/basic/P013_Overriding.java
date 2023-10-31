package basic;

class Parent2 {
	Parent2(){
		System.out.println("default cons in parent");
	}
	public void call() {
		System.out.println("call function in Parent Class");
	}
	public void calculate() {
		System.out.println("calcualte function");
	}
}

class Child extends Parent2 {
	Child(){
		
	}
	public void call() {
		super.call();
		System.out.println("call function in Child Class");
	}
//	public void run() {
//		System.out.println("run function on child class");
//	}
}

public class P013_Overriding {
	public static void main(String[] args) {
		Child c = new Child();
		c.call();
		c.call();
	}
}
