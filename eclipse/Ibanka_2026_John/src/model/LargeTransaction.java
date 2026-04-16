package model;

public class LargeTransaction extends Transaction {
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
	public void setEmployeeWhoNeedToCheck(Employee inputemployee) {
		if(inputemployee  != null) {
			employeeWhoNeedToCheck = inputemployee;
		}
		else
		{
			throw new IllegalArgumentException("NOTE: WAIT EMPLOYEE CHECKING!");			
			}
		
		
			}
	public void setIsAccepted(boolean inputAccepted) {
		isAccepted = inputAccepted;
	}
	
	public LargeTransaction() {
		super();
		isAccepted = true;
	}
	
	public LargeTransaction(double inputAmount, String inputDescription, 
			BankAccount sourceAccount, BankAccount TargetAccount, Employee inputEmployee) {
		super(inputAmount, inputDescription, sourceAccount,TargetAccount);
		setEmployeeWhoNeedToCheck(inputEmployee);
		isAccepted = false;
		
	}
	
	public boolean approve() {
		if(employeeWhoNeedToCheck != null && employeeWhoNeedToCheck.getapprovalLimit() >= getAmount()) {
			isAccepted = true;
			return true;
		}
		return false;
	}
	
	public boolean execute() {
		if (!isAccepted) {
			System.out.println("Transaction not approved!");
			return true;
		}
		return super.execute();
	}
	
	//String tostring
	@Override
	public String toString() {
	    return "LargeTransaction | amount=" + getAmount() +
	           " | approved=" + IsAccepted();
	}

}
