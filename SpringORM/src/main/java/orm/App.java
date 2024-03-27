package orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("orm/myfile.xml");
		Model m = new Model(1, "java", "ahmedabad", 6987654);
		Dao dao = (Dao)con.getBean("dao");
		dao.insertUser(m);
	}
}
