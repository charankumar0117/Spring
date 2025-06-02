package spring_XML;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.class");
		College college = (College) context.getBean("cl1");
		
		System.out.println(college);
		
		
		

	}

}
