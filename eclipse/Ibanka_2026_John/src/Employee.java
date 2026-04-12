
public class Employee extends Person {
	private EmployeeStatus employeeStatus;
	private  double approvalLimit;
	
	
	//getters
	
	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}
	
	public double getapprovalLimit() {
		return approvalLimit;
	}
	 //setters
	
	public void setemployeeStatus(EmployeeStatus inputemployeeStatus ) {
		if(inputemployeeStatus != null) {
			employeeStatus = inputemployeeStatus;
		}
		else
		{
			employeeStatus = EmployeeStatus.Vacation;
		}
	}	
	
	
	public void setapprovalLimit(double inputapprovalLimit) {
		if(inputapprovalLimit > 0 && inputapprovalLimit < 200000 ) {
			approvalLimit = inputapprovalLimit;
		}
		else {
			approvalLimit = 0;
		}
		
	}
	// no args
	public Employee() {
		setemployeeStatus(EmployeeStatus.Vacation);
		setapprovalLimit(10000);
		
	}
	
	public Employee(EmployeeStatus inputEmployeeStatus, double inputapprovalLimit) {
		setemployeeStatus(inputEmployeeStatus);
		setapprovalLimit(inputapprovalLimit);
	}
	
public String toString() {
	String result = employeeStatus + "| " + approvalLimit ;
	return result;
} 
		
	}


