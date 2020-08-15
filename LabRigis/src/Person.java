import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	int id;
	String firstName;
	String lastName;
	Address address;
	Date dateOfBirth;
	String Role;
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	
	public Person() {

	}
	
	public Person(int id,String firstName, String lastName,String Role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Role = Role;
		
	}
	
	void setAddress(Address address) {
		this.address = address;
	}


	void printInfo(int ckeck) {
		System.out.println("ID : " + id);
		System.out.println("Name : " + firstName + " " + lastName);
		System.out.println("Role : "+Role);
		System.out.print("Address: " +address.streetAddress+ " / "+address.district);
		System.out.println(" / " +address.city+ " " +address.zipCode);
		
	}
}
