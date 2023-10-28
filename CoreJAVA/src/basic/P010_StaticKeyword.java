package basic;

class Student {
	static{
		System.out.println("static block in student class");
	}
	int id;
	String name;
	double per;
	static String cname = "TOPS";
	public void call() {
		System.out.println("call function");
	}
	public static void staticFunction() {
		System.out.println("static function in student class : "+cname);
	}
}

public class P010_StaticKeyword {
	static{
		System.out.println("static block in main class");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.call();
		Student.staticFunction();
	}
}
