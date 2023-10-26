package basic;
class Cons{
	int i;
	String name;
	Cons(){
		System.out.println("default cons");
	}
	Cons(int i){
		System.out.println("int cons"+i);
	}
	Cons(int i,int j){
		System.out.println("int cons"+i);
	}
	Cons(int i,String name){
		this.i = i;
		this.name=name;
		System.out.println("i = "+i+" para cons "+name);
	}
	public void display() {
		System.out.println("i = "+i+" name = "+name);
	}
}
class Data{
	int i;
	String name;
	Data(Cons c){
		this.i = c.i;
		this.name=c.name;
	}
	public void display() {
		System.out.println("i = "+i+" name = "+name);
	}
}
public class P009_Constructor {
	public static void main(String[] args) {
		Cons c = new Cons(12,"java");
		c.display();
		Data d = new Data(c);
		d.display();
	}
}
