package model;
import java.util.ArrayList;

public class Client extends Person {
	private String email;
	private Address address;
	private  ArrayList<BankAccount> accounts = new ArrayList<>();
	private String clientCode;
	
	
	//getters
	public String getEmail() {
		return email;
	}
	public Address getaddress() {
		return address;
	}
	public ArrayList<BankAccount> getAccounts(){
		return accounts;
	}
	public String getClientCode() {
		return clientCode;
	}
	
	//setters
	
	public void setEmail(String inputEmail) {
		if (inputEmail != null && inputEmail.contains("@")) {
		email = inputEmail;
		}
		
		
	}
	
	public void setAddress(Address inputaddress) {
		if (inputaddress != null  )
		address = inputaddress;
	}
	
	public void setClientCode(String personalCode) {
		if( (personalCode != null) && (!personalCode.isEmpty())){
			clientCode = super.getName().toUpperCase().charAt(0)+"_" + super.getSurname().toUpperCase().charAt(0) +
						"_"+ super.getPersonCode();
					/*getSurname().charAt(0) + "_" +
					getName().charAt(0) + "_" +
					getPersonCode();*/
	}
	}
	
	
	public void addBankAccount(BankAccount newAccount) {
		if (newAccount == null )
			return;
		for (BankAccount acc : accounts ) {
			if (acc.getId() == (newAccount.getId())) {
				System.out.println("Account already exists!");
				return;
			}
		}
		accounts.add(newAccount);
	}
	
	public void removeBankAccount(BankAccount accountToRemove) {
		if (accountToRemove == null) 
			return;
		accounts.remove(accountToRemove);
	}
	// no arg
	public Client() {
		super();
		setEmail("kelvin@j.com");
		setAddress(new Address(City.Jelgava, "kelvinsHomes", 101));
		accounts = new ArrayList<BankAccount>();
		
	}
	
	//args
	public Client(String inputname, String inputsurname, String personalCode,
			String inputEmail, Address inputaddress) {
		super(inputname,inputsurname,personalCode);
		setEmail (inputEmail);
		setAddress (inputaddress);
		accounts = new ArrayList<BankAccount>();
		setClientCode(personalCode);
	}
	
	//STRING TOstring
	public String toString() {
		String result = super.toString() +  
				" Client Code : " + clientCode +" Email:" + email + " Address: " + address;
		return result;
	}
	

}
