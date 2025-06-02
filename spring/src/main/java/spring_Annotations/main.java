package spring_Annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		College college = (College) context.getBean(College.class);
//		college.setAddress(null);
		
		
		System.out.println(college);
		
		
		

	}

}
