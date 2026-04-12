import java.time.LocalDateTime;

public class Transaction {
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
		this.dateTime = LocalDateTime.now();
	}
	public void setAmount(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("AMOUNT MUST BE ENOUGH OR MORE THAN 0");
		}
		this.amount = amount;
	} 
	@SuppressWarnings("null")
	public void setDescription(String description) {
		if (description == null && description.isEmpty()) {
			throw new IllegalArgumentException("Source account cannot be empty");
		}
		this.description = description;
	}
	public void setSourceAccount (BankAccount inputSourceAccount) {
		if (inputSourceAccount == null) {
			throw new IllegalArgumentException("Account Cannot be empty!");
		}
		this.sourceAccount = inputSourceAccount; 
	}
	public void setTargetAccount (BankAccount inputTargetAccount) {
		if (inputTargetAccount == null) {
			throw new IllegalArgumentException("Target ACCOUNT CANNOT BE EMPMTY");
		}
		this.targetAccount =  inputTargetAccount;
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
		String result = id + " " + amount + " " + sourceAccount + " " + targetAccount + " " + dateTime + " " + description;
		return result;
	}
	
	

}
