package basic;

import java.util.Scanner;

//2 : Types
//Primitive-> 	byte,short,int,long,->whole number
//				float,double,->decimal
//				boolean,->true/false
// 				char ->character
//Non-> String ,array,class
class A{
	public void run() {
		System.out.println("run function in A class");
	}
}
public class P001_DataTypes {
	public static void main(String[] args) {
		A a = new A();
		a.run();
		
		Scanner obj = new Scanner(System.in); 
		System.out.println("enter value = ");
		int i = obj.nextInt();
		System.out.println("i = "+i);
		byte b = 127;
		System.out.println(b);
		short s = 23534;
		System.out.println(s);
		int i1 =1242;
		System.out.println(i1);
		long l = 345645645;
		System.out.println(l);
		float f = 3.1446765867f;
		System.out.println(f);
		double d = 3.144567658676;
		System.out.println(d);
		boolean b1 = true;
		System.out.println(b1);
		char c = 'a';
		System.out.println(c);
	}
}
