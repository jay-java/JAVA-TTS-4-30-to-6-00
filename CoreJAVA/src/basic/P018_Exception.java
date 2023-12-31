package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

class Divide {// A
	public void division() throws ArithmeticException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println("enter j = ");
		int j = sc.nextInt();
		int k = i / j;
		System.out.println(k);
	}
	public void input(int a) {
		if(a>0) {
			System.out.println(a);
		}
		else {
			throw new ArithmeticException("number is less than 0");
		}
	}
}

public class P018_Exception {// B
	public static void main(String[] args) {
		Divide d = new Divide();
		d.input(-12);
		
		try {
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("denominator should be greater than 0");
		} catch (InputMismatchException e) {
			System.out.println("denominator should be numeric");
		}

//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter i = ");
//			int i = sc.nextInt();
//			System.out.println("enter j = ");
//			int j = sc.nextInt();
//			int k = i / j;
//			System.out.println(k);
//			System.exit(10);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator should be greater than 0");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator should be numeric");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will executes everutime");
//		}
	}
}
