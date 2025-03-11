package in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmpClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empconfig.xml");
		Employee e = (Employee) context.getBean("s1");
        Employee e1 = (Employee) context.getBean("s2");
        
        System.out.println(e);
        System.out.println(e1);
		
	}

}
