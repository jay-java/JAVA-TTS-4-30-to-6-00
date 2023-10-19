package basic;

/*1.simple if
 * 2.if else
 * 3.nested if
 * 4.else if ladder
 * 5.switch case
 * */
public class P004_CondiionalStatements {
	public static void main(String[] args) {
		int a = 10, b = 20;
		if (a > b) {
			System.out.println("a is grater than b");
		} else {
			System.out.println("b is greater than a");
		}

		int age = 2;
		if (age > 18) {
			if (age < 60) {
				System.out.println("eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		int m = 98;
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 60) {
			System.out.println("C grade");
		} else if (m >= 61 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("inavlid input");
		}

		System.out.println("1.English\n2.Hindi\n3.Gujarati");
		int c = 2;
		switch (c) {
		case 1:
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected Hindi");
			break;
		case 3:
			System.out.println("You selected Gujarati");
			break;
		default:
			System.out.println("invalid");
		}
	}
}
