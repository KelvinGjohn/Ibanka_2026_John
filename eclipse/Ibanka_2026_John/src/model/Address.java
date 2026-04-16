package model;


public class Address {
	private City city;
	private String houseTitle;
	private int houseNumber;

	//getters
	public City getCity () {
		return city;
	}
	
	public String getHouseTitle () {
		return houseTitle;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	//setters
	
	public void setCity(City inputCity) {
		if (inputCity != null) {
			city = inputCity;
		}
		else
		{
			city = City.Riga;
		}
	}
	
	public void setHouseTitle(String inputHouseName) {
		if (inputHouseName != null && (!inputHouseName.isEmpty())
		&& (inputHouseName.matches("[A-Z]{1}[a-z]{2,12}?[ ]{1}[A-Z]{1}[a-z]{2,12}?"))) {
			houseTitle = inputHouseName;
		}		
	}
	
	public void setHouseNumber(int inputHouseNumber) {
		if(inputHouseNumber > 0 && inputHouseNumber < 150) {
			houseNumber = inputHouseNumber;
		}
	}
	// no- args constr
	public Address() {
		setCity(City.Ventspils);
		setHouseTitle("KJnices Homes");
		setHouseNumber(101);
	}
	
	//args
	public Address(City inputCity, String inputHouseTitle, int inputHouseNumber) {
		setCity(inputCity);
		setHouseTitle(inputHouseTitle);
		setHouseNumber(inputHouseNumber);		
	}
	


	public String toString() {
		String result = city + ", " + houseTitle + " " + houseNumber;
		return result;
	}
}


 
