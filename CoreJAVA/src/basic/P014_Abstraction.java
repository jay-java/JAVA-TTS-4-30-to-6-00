package basic;
abstract class RBI{
	abstract public void SA();//abstract function
	abstract public void CA();
	abstract public void HL();
	public static void RepoRate() {
		System.out.println("repo rate +-4%");
	}
}
class asds{
	
}
class SBI extends RBI{

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("sbi interest 6%");
	}

	@Override
	public void CA() {
		// TODO Auto-generated method stub
		System.out.println("current account SBI");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi HL 8%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("java interest 7%");
	}

	@Override
	public void CA() {
		// TODO Auto-generated method stub
		System.out.println("current account JAVA");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("java HL 9%");
	}
	
}
public class P014_Abstraction {
	public static void main(String[] args) {
		SBI s=  new SBI();
		s.CA();
		s.SA();
		s.HL();
		JAVA j = new JAVA();
		j.CA();
		j.SA();
		j.HL();
		SBI.RepoRate();
		JAVA.RepoRate();
	}
}
