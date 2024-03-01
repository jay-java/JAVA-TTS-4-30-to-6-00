package OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person_details")
public class Person {
	@Id
	private int id;
	private String name;
	@OneToOne
	@JoinColumn(name="person_vehicle")
	private Vehicle vehicle;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", vehicle=" + vehicle + "]";
	}
	
}
