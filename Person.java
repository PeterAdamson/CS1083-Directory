//Authors Peter Adamson, Tristen Tulkens

public class Person{

	private String name;
	private Address address;

	public Person(String name, int unitNum, int streetNum, String streetName, String postalCode){

		this.name = name;
		this.address = new Address(unitNum, streetNum, streetName, postalCode);
	}

	public String getName(){
		return name;
	}

	public Address getAddress(){
		return address;
	}

	public String toString(){
		return String.format("%s \t %s", name, address.toString());
	}
}
