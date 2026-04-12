package model;
   

public class Person {
	private String Name;
	private String Surname;
	private  String PersonCode;
	
	public String getName() {
		return Name;
	}
	
	public String getSurname() {
		return Surname;
	}
	
	public String getPersonCode() {
		return PersonCode;
	}
	//setters
	
	public void setName(String inputName) {
		if((inputName != null) && (inputName.isEmpty())
			&&(inputName.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			Name = inputName;
		}
		else {
			Name = "Unknown";
		}
		
	}
	public void setSurname(String inputSurname) {
		if ((inputSurname != null) && (inputSurname.isEmpty())
				&&(inputSurname.matches("[A-Z]{1}[a-z]{2,15}([ ]{1}[A-Z]{1}[a-z]{2,15})?"))) {
			Surname = inputSurname;
		}
		else {
			Surname = "Unknown";
		}
	}
	public void setPersonCode(String inputPersonCode) {
		if (inputPersonCode != null  && inputPersonCode.isEmpty()) {
			this.PersonCode = inputPersonCode;
		}
		else {
			PersonCode = "UNKNOWN";
			
		}
	}
	
	//no args
	public Person() {
		setName("KELVIN");
		setSurname("JOHN");
		setPersonCode("2230-4211");
	}
	
	//arg
	public Person(String inputName, String inputSurname, String inputPersonCode) {
		setName(inputName);
		setSurname(inputName);
		setPersonCode(inputPersonCode);
	}
	
	//toString
	public String toString() {
		String result = Name +" " + Surname + "(" + PersonCode +")";
		return result;
	}

}
