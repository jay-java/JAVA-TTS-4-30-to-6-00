package basic;

final class hello{
	final int i=1;
	final public void change() {
//		i++;
		System.out.println(i);
	}
}
//class hello2 extends hello{
//	public void change() {
//		System.out.println(i);
//	}
//}
public class P015_Final {
	public static void main(String[] args) {
		hello h = new hello();
		h.change();
	}
}
