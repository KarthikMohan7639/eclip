package lists;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new  ClassPathXmlApplicationContext("listconfig.xml");
		Student s=(Student) context.getBean("s");
		System.out.println(s);

	}

}
