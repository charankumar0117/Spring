package spring_Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class AppConfig {
	@Bean("college")
	public College cl(Departments departments) {
		College cl = new College();
		cl.setClgName("CTS");
		cl.setAddress("Chennai");
		cl.setDepartments(departments);
		return cl;
		
	}
	
	@Bean("departments")
	public Departments dt() {
		Departments dt=new Departments();
		dt.setDeptName("ECE");
		dt.setDeptId(101);
		return dt;
	}

}
