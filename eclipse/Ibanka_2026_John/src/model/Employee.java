package model;

public class Employee extends Person {
	private EmployeeStatus status;
	private  double approvalLimit;
	
	
	//getters
	
	public EmployeeStatus getEmployeeStatus() {
		return status;
	}
	
	public double getapprovalLimit() {
		return approvalLimit;
	}
	 //setters
	
	public void setemployeeStatus(EmployeeStatus inputemployeeStatus ) {
		if(inputemployeeStatus != null) {
			status = inputemployeeStatus;
		}
	
	}	
	
	
	public void setapprovalLimit(double inputapprovalLimit) {
		if(inputapprovalLimit > 0 && inputapprovalLimit < 200000 ) {
			approvalLimit = inputapprovalLimit;
		}
		
	}
	// no args
	public Employee() {
		setemployeeStatus(EmployeeStatus.Dismissed);
		setapprovalLimit(1000);
		
	}
	
	public Employee(String inputname, String inputSurname, String inputPersonCode,  EmployeeStatus inputEmployeeStatus, double inputapprovalLimit) {
		super(inputname, inputSurname, inputPersonCode);
		setemployeeStatus(inputEmployeeStatus);
		setapprovalLimit(inputapprovalLimit);
	}
	
//String toString
	public String toString() {
	    return "Name: " + getName() +
	           " Surname: " + getSurname() +
	           " Code: " + getPersonCode() +
	           " Status: " + status +
	           " Limit: " + approvalLimit;
	}
		
	}


