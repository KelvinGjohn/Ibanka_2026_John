package model;

public class BankAccount {
	private int id;
	private String iban;
	private double balance;
	private boolean active;
	
	private static int counter = 0;

	
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
		id = counter;
		counter++;
		
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
	setId();
	setIban("KJ27 3769 4781 3872 7837");
	setBalance(300);
	this.active = true;
	}
	
	//Agrs
	public BankAccount( int inputId, String inputIban, double inputBalance, boolean inputActive) {
		setId();
		setIban(inputIban);
		setBalance(inputBalance);
		setActive(inputActive);
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
	String result = id + " " + iban + " EUR " + balance + " " + active;
	return result;
	}
	public boolean isempty() {
		// TODO Auto-generated method stub
		return false;
	}
}
