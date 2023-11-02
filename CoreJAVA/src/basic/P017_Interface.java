package basic;
interface inter1{
	public void interface1();
	public static void inter4() {
		System.out.println("interface 4");
	}
}
interface inter2 extends inter1{
	public void interface2();
	public static void inter5() {
		System.out.println("interface 5");
	}
}
interface inter3{
	public void interface3();
	public static void inter6() {
		System.out.println("interface 6");
	}
}
class InterCall implements inter2,inter3{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	
}
public class P017_Interface {
	public static void main(String[] args) {
		InterCall i = new InterCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.inter4();
		inter2.inter5();
		inter3.inter6();
	}
}
