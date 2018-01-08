//Authors Peter Adamson, Tristen Tulkens

public class Address{

	private int unitNum, streetNum;
	private String streetName, postalCode;

	public Address(int unitNum, int streetNum, String streetName, String postalCode){
		this.unitNum = unitNum;
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.postalCode = postalCode;
	}

	public int getUnitNum(){
		return unitNum;
	}

	public int getStreetNum(){
		return streetNum;
	}

	public String getStreetName(){
		return streetName;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public String toString(){
		return String.format("%d %s, %s", streetNum, streetName, postalCode);
	}
}
