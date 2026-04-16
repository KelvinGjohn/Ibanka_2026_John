package model;
   

public class Person {
	private String name;
	private String surname;
	private  String personCode;
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getPersonCode() {
		return personCode;
	}
	//setters
	
	public void setName(String inputName) {
		if((inputName != null) && (!inputName.isEmpty())
			&&(inputName.matches("[A-Z]{1}[a-z]{2,12}?"))) {
			name = inputName;
		}
		else {
			name = "Unknown";
		}
		
	}
	public void setSurname(String inputSurname) {
		if ((inputSurname != null) && (!inputSurname.isEmpty())
				&&(inputSurname.matches("[A-Z]{1}[a-z]{2,12}?"))) {
			surname = inputSurname;
		}
		else {
			surname = "Unkwon";
		}
	}
	public void setPersonCode(String inputPersonCode) {
		if( (inputPersonCode != null ) && (!inputPersonCode.isEmpty())&&(inputPersonCode.matches("[0-9]{3}"))) {
			personCode = inputPersonCode;
		}
		else {
			personCode = "11-33-33-44";
			
		}
	}
	
	//no args
	public Person() {
		setName("Kelvin");
		setSurname("John");
		setPersonCode("223");
	}
	
	//arg
	public Person(String inputName, String inputSurname, String inputPersonCode) {
		setName(inputName);
		setSurname(inputName);
		setPersonCode(inputPersonCode);
	}
	
	//toString
	public String toString() {
		String result = "Name: "+ name + " Surname: " + surname + " Personal Code: (" + personCode +")";
		return result;
	}

}
