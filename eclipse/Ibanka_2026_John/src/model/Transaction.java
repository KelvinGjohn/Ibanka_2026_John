package model;
import java.time.LocalDateTime;

public class Transaction {
	private static int idcounter = 1;
	
	private int id;
	private LocalDateTime dateTime;
	private double amount;
	private String description;
	private BankAccount sourceAccount;
	private BankAccount targetAccount;
	
	
		
	
	//getters
	public int getId() {
		return id;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public double getAmount() {
		return amount;
	}
	public String getDescription() {
		return description;
	}
	public BankAccount getSourceAccount() {
		return sourceAccount;
	}
	public BankAccount getTargetAccount() {
		return targetAccount;
	}
	
	//setters	
	
	public void setDateTime() {
		dateTime = LocalDateTime.now();
	}
	public void setAmount(double inputAmount) {
		if(inputAmount  > 0) {
			amount = inputAmount;
		}
		else {
			throw new IllegalArgumentException("AMOUNT MUST BE ENOUGH OR MORE THAN 0");
		}
		
	} 
	
	public void setDescription(String inputDescription) {
		if (inputDescription != null && inputDescription.isEmpty()) {
			throw new IllegalArgumentException("Description cannot be empty");
		}
		description = inputDescription;
	}
	public void setSourceAccount (BankAccount inputSourceAccount) {
		if (inputSourceAccount != null) {
		}
		sourceAccount = inputSourceAccount; 
	}
	public void setTargetAccount (BankAccount inputTargetAccount) {
		if (inputTargetAccount != null) {
		}
		targetAccount =  inputTargetAccount;
	}
	
	public Transaction() {
		id = idcounter++;
		setAmount(7000);
		setDescription("Bills For School And Future Concert!.");
		setDateTime();
	}
	
	public Transaction( double inputAmount, String inputDescription, BankAccount inputSourceAccount,
			BankAccount inputTargetAccount) {
		id = idcounter++;
		setDateTime();
		setAmount(inputAmount);
		setDescription(inputDescription);
		setSourceAccount(inputSourceAccount);
		setTargetAccount(inputTargetAccount);
	}
	

	public boolean execute() {
		if (checkIsBalanceEnough()) {
			sourceAccount.withdraw(amount);
			targetAccount.deposit(amount);
			return true;
		}
		return false;
	}
	public boolean checkIsBalanceEnough() {
		return sourceAccount.getBalance() >= amount;
	} 
	
	//String tostring
	public String tostring() {
		String result = id + " " + amount + " " + sourceAccount + " " + targetAccount + 
				" " + dateTime + " " + description +  execute();
		return result;
	}
	
	

}
