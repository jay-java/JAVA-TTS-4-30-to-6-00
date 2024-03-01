package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_details")
public class Vehicle {
	@Id
	private int vid;
	private String model;
	@OneToOne(mappedBy = "vehicle")
	
	private Person person;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vid, String model, Person person) {
		super();
		this.vid = vid;
		this.model = model;
		this.person = person;
	}
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", model=" + model + ", person=" + person + "]";
	}
	
}
