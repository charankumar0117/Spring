package spring_Annotations;

public class Departments {
	private String deptName;
	private int deptId;
	
	public Departments() {}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Departments(String deptName, int deptId) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Departments [deptName=" + deptName + ", deptId=" + deptId + "]";
	}
}
