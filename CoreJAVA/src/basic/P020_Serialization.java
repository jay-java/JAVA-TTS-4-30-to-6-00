package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
	int id;
	String name;
	double sal;

	public User(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public void show() {
		System.out.println("id : " + id + " name : " + name + " sal : " + sal);
	}
}

public class P020_Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User u1 = new User(1, "java", 23345453.343);
		FileOutputStream fos = new FileOutputStream("user.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(u1);
		oos.flush();
		oos.close();
		System.out.println("done");

		FileInputStream fis = new FileInputStream("user.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User user = (User) ois.readObject();
		System.out.println(user);
		ois.close();
	}
}
