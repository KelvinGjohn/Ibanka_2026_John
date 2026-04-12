
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
	public void setIsAccepted(boolean inputaccepted) {
		isAccepted = inputaccepted;
	}
	
	public void approve() {
		setIsAccepted(true);
	}
	
	public boolean execute() {
		if (!isAccepted) {
			System.out.print("Transaction Not approved!");
			return false;
		}
		return false;
		
	}
	
	public String toString() {
		String result = employeeWhoNeedToCheck + " " + isAccepted;
		return result;
	}

}
