package basic;

import java.util.Scanner;

/*1.Arithmetic->+,-,*,/,%
 * 2.Assignment-> = , +=,-=,*=,/=
 * 3.Logical->&&,|| ,!
 * 4.Conditional->==,>,<,>=,<=,!=
 * 5.Unary->++,--
 * */
public class P003_Operators {
	public static void main(String[] args) {
		int q = 1,p;
		p = q++;
		System.out.println(p);
		System.out.println(q);
		
		
		
		
		
		Scanner s =  new Scanner(System.in);
		System.out.println("enter a = ");
		int a = s.nextInt();
		System.out.println("enter b = ");
		int b = s.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a > b);
		
		a+=12;
		System.out.println(a);
		
		int i = -10,j=70;
		
		j =- i;
		System.out.println("j  = "+j);
		
		
		
		
	}
}
