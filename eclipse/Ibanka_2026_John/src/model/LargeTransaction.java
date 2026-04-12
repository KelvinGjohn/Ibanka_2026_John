package model;

public class LargeTransaction {
	private Employee employeeWhoNeedToCheck;
	private boolean isAccepted;
	
	
	//getters
	public Employee getEmployeeWhoNeedToCheck() {
		return employeeWhoNeedToCheck;
	}
	
	public boolean IsAccepted() {
		return isAccepted;
	}
	
	//setters
	public void setEmployeeWhoNeedToCheck(Employee inputemployeeWhoNeedToCheck) {
		if(inputemployeeWhoNeedToCheck  != null) {
			throw new IllegalArgumentException("NOTE: WAIT EMPLOYEE CHECKING!");			
			}
		inputemployeeWhoNeedToCheck = employeeWhoNeedToCheck;
		
			}

}
