package basic;
//1.Class 2.object 3.inheritance 4.Polymorphism 5.Abstraction 6.Encapsulation
class A1{
	public void classA(){
		System.out.println("class A functions");
	}
}
class B extends A1{
	public void classB(){
		System.out.println("class B functions");
	}
}
class C extends B{
	
}
class D extends C{
	
}
class E extends C{
	
}
public class P011_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();
	}
}
