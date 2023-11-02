package basic;
class Employee{
	private int id;
	private String name;
	private double salary;
	Employee(){
		
	}
	Employee(int id,String name,double salary){
		this.id=id;
		this.name= name;
		this.salary=salary;
	}
	public void setId(int id) {
		this.id= id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" salary : "+salary;
	}
}
public class P016_Encapsulation {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("java");
		e1.setSalary(20000.500);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		Employee e2 = new Employee(2, "python", 50.20);
		System.out.println(e2);
	}
}
