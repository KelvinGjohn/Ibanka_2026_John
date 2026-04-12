package model;


import java.time.LocalDate;

public class Card {
	private String cardNumber;
	private LocalDate expireDate;
	private int cvv;
	private boolean active;
	private BankAccount account;
	
	//getters
	public String getCardNumber() {
		return cardNumber;
	}
	public LocalDate getExpireDate() {
		return expireDate;
	}
	public int getCvv() {
		return cvv;
	}
	public boolean getActive() {
		return active;
	}
	public BankAccount getAccount() {
		return account;
	}
	
	//setters
	public void setCardNumber(String inputCardNumber) {
		if(inputCardNumber != null && inputCardNumber.isEmpty()
				&& inputCardNumber.matches("[0-9]{4}[ ][0-9]{4}[ ][0-9]{4}[ ][0-9]{4}			")) {
			inputCardNumber = cardNumber;
		}
		else{
			cardNumber = "1526 1773 1927 1937";
		}
	}
	
	public void setCvv(int inputCvv) {
		if(inputCvv >= 100 && inputCvv <= 999) {
			cvv = inputCvv;
		}
		else {
			cvv = 179;
		}
	}
	public void setgetActive(boolean inputactive) {
		active = inputactive;	
	}
	public void setAccount(BankAccount inputAccount) {
		inputAccount = account;
	}
	
	//no args
	public Card() {
		setCardNumber("1526 1773 1927 1937");
		setCvv(179);
		this.active = true;
		setAccount(account);
		
		
	}
	
	public Card(String inputCardNumber, LocalDate ExpiryDate, int inputCvv, boolean inputActive, BankAccount inputAccount) {
		setCardNumber(inputCardNumber);
		setCvv(inputCvv);
		setgetActive(inputActive);
		setAccount(inputAccount);	
	}
	
	//STRING
	
	public String toString() {
		String result = cardNumber + " " + expireDate + " " + cvv + " " + active + " " + account;
		return result;
	}
	 

}
