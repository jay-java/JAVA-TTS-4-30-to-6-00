package basic;

class Addition {
	public double area(double radius) {
		return Math.PI*radius*radius;
	}

	public int area(int l, int b) {
		return l*b;
	}
	

	public double area(double h,double b) {
		return (b*h)/2;
	}
}

public class P012_Overloading {
	public static void main(String[] args) {
		Addition a = new Addition();
		double res = a.area(23.2);
		System.out.println("area = "+res);
		}
}
