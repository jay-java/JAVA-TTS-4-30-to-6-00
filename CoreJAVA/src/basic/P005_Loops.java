package basic;
//1.for(initialization,condition,incre/decre)
//2.while(condition)
//3.do{body} while(condition);
//4.for each
public class P005_Loops {
	public static void main(String[] args) {
		System.out.println("for loop");
		for(int i=11;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("while loop");
		int j=11;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		System.out.println("do while");
		int k =12;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=11);
	}
}
