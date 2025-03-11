package in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
		
		Student s1=(Student) context.getBean("s1");
		Student s2=(Student) context.getBean("s2");
		System.out.println(s1);
		System.out.println(s2);

	}

}
