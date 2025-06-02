package spring_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	private String clgName;
	private String address;
//	@Autowired
	private Departments departments;
	
	public College() {}

	@Override
	public String toString() {
		return "College [clgName=" + clgName + ", address=" + address + ", departments=" + departments + "]";
	}

	public College(String clgName, String address, Departments departments) {
		super();
		this.clgName = clgName;
		this.address = address;
		this.departments = departments;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}
}
