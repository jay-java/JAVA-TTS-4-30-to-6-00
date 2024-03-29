package orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("orm/myfile.xml");
		Model m = new Model(2, "python", "ahmedabad", 6987654);
		Dao dao = (Dao)con.getBean("dao");
//		dao.insertUser(m);

//		Model m1 = dao.getUserById(1);
//		System.out.println(m1);
//		
//		List<Model> list = dao.getAllUsers();
//		System.out.println(list);
		
		dao.deleteUser(m);
	}
}
