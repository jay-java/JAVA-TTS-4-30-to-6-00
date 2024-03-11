package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("setterInjection/config.xml");
		User u1 = (User)con.getBean("u");
		System.out.println(u1);
	}
}
