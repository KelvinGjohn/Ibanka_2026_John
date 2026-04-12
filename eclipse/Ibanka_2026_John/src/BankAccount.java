
public class BankAccount {
	private int id;
	private String iban;
	private double balance;
	private boolean active;
	private int counter;

	
// getters
	public int getId() {
		return id;
	}
	public String getIban() {
		return iban;
	}
	public double getBalance() {
		return balance;
	}
	public boolean getActive() {
		return active;
	}
	
	// setters
	public void setId() {
		
	}
	@SuppressWarnings("null")
	public void setIban(String iban) {
		if (iban == null && iban.isEmpty()) {
			throw new IllegalArgumentException("NOTE: cannot be empty!");
		}
		this.iban = iban;
	}
	public void setBalance(double balance) {
		if (balance <= 0 ) {
			throw new IllegalArgumentException("NOTE: Balance cannot be empty!");
		}
		this.balance = balance;
	}
	public void setActive(boolean inputActive) {
		this.active = inputActive;
	}
	
	// no agrs
	public BankAccount() {
	this.id = counter++;
	this.active = true;
	}
	
	//Agrs
	public BankAccount( String inputIban, double inputBalance) {
		this.id = counter++;
		setIban(iban);
		setBalance(balance);
		this.active = true;
	}
	
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("NOTE:Amount cannot be empty!");
		}
		balance += amount;
	}
	public boolean withdraw(double inputAmount) {
		if (inputAmount <=0) {
			throw new IllegalArgumentException("NOTE:Amount cannot be negative!");
		}
		if (balance >= inputAmount) {
			balance -= inputAmount;
			return true;
		}
		return false;
	}
	
	//String tostring
	public String toString() {
	String result = id + " " + iban + " " + balance + " " + active;
	return result;
	}
}
