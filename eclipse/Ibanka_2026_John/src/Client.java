import java.util.ArrayList;

public class Client extends Person {
	private String email;
	private Address address;
	private  ArrayList<BankAccount> accounts;
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
		if (email != null && email.contains("@")) {
			this.email = inputEmail;
		}
		
		
	}
	
	public void setAddress(Address inputaddress) {
		this.address = inputaddress;
	}
	
	public void setAccount(ArrayList<BankAccount>inputaccounts){
		if(inputaccounts != null && !inputaccounts.isEmpty()) {
		accounts = inputaccounts;
		}
		else
		{
		accounts = new ArrayList<BankAccount>();
		}
	}
	
	public void setClientCode(String inputClientCode) {
		if(getName() != null && getSurname() != null && getPersonCode() != null) {
			this.clientCode =
					getSurname().charAt(0) + "_" +
					getName().charAt(0) + "_" +
					getPersonCode();
		}
		else
		{
			this.clientCode = "Unknown";
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
	}
	
	public void removeBankAccount(BankAccount accountToRemove) {
		if (accountToRemove == null) 
			return;
	}
	// no arg
	public Client() {
		this.accounts = new ArrayList<BankAccount>(accounts);
	}
	
	//args
	public Client(String inputname, String inputsurname, String inputpersonCode,
			String inputemail, Address inputaddress, Address address, String email) {
		super(inputname,inputsurname,inputpersonCode);
		setEmail(inputemail);
		this.address = address;
		this.accounts = new ArrayList<BankAccount>();
		setClientCode(clientCode);
	}
	
	//STRING TOstring
	public String toString() {
		String result = email + " " + address + " " + accounts + " " + clientCode;
		return result;
	}
	

}
