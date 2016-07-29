package kr.ac.sungkyul.hr.vo;

public class SalaryVo {
	
	private String firstName;
	private int Salary;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "SalaryVo [firstName=" + firstName + ", Salary=" + Salary + "]";
	}
	
	
	

}
