package basic;

import java.util.Scanner;
//1.implicit->by compiler
//2.explicit->by user
public class P002_TypeCast {
	public static void main(String[] args) {
		double d = 12.325;
		System.out.println(d);
		int i = (int)d;
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a= sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		double c = (double)a/(double)b;
		System.out.println("c = "+c);
	}
}
