

public class Address {
	private City city;
	private String houseName;
	private int houseNumber;

	//getters
	public City getCity () {
		return city;
	}
	
	public String getHouseName () {
		return houseName;
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
	
	public void setHouseName(String inputHouseName) {
		if (inputHouseName != null && (!inputHouseName.isEmpty())
		&& (inputHouseName.matches("[A-Z]{2}[a-z]{3,15}([ ]{1}[A-Z{2}[a-z]{3,15})?"))) {
			houseName = inputHouseName;
		}
		else
		{
			houseName = "Unknown";
		}		
	}
	
	public void setHouseNumber(int inputHouseNumber) {
		if(inputHouseNumber > 0 && inputHouseNumber < 150) {
			houseNumber = inputHouseNumber;
		}
		else
		{
			houseNumber = 101;
		}
	}
	// no- args constr
	public Address() {
		setCity(City.Riga);
		setHouseName("KelvinsHome");
		setHouseNumber(1);
	}
	
	//args
	public Address(City inputCity, String inputHouseName, int inputHouseNumber) {
		setCity(city);
		setHouseName(inputHouseName);
		setHouseNumber(inputHouseNumber);		
	}
	
	public String toString() {
		String result = city + ", " + houseName + " " + houseNumber;
		return result;
	}
}


 
