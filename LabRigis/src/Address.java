public class Address {

	String streetAddress;
	String district;
	String city;
	String zipCode;

	public Address(String streetAddress, String district, String city, String zipCode) {
		this.streetAddress = streetAddress;
		this.district = district;
		this.city = city;
		this.zipCode = zipCode;
	}

	void printAddress() {
		System.out.print("Address: " + streetAddress);
		System.out.print(" " + district + " " + city);
		System.out.println(" " + zipCode + "\n");
	}
}