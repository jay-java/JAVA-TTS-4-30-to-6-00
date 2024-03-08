package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("core/config.xml");
		User u1 = (User)con.getBean("u2");
		System.out.println(u1);
	}
}
