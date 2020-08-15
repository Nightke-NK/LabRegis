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

	public Person(int id, String firstName, String lastName, String Role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Role = Role;

	}

	void setAddress(Address address) {
		this.address = address;
	}

	void setDOB(String dateOfBirth) {
		try {
			this.dateOfBirth = formatter.parse(dateOfBirth);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + formatter);
		}
	}

	int getAge() {
		String strDate = formatter.format(this.dateOfBirth);
		String strYear = formatter.format(new Date());
		String[] splitDate = strDate.split("-");
		String[] splitYear = strYear.split("-");
		int intMonthBirth = Integer.parseInt(splitDate[1]);
		int intYearBirth = Integer.parseInt(splitDate[2]);
		int intMonthNow = Integer.parseInt(splitYear[1]);
		int intYearNow = Integer.parseInt(splitYear[2]);
		if (intMonthBirth > intMonthNow) {
			intYearBirth = intYearBirth + 1;
		} else if (intMonthBirth == intMonthNow) {
			int intDayBirth = Integer.parseInt(splitYear[0]);
			int intDaynow = Integer.parseInt(splitDate[0]);
			if (intDayBirth > intDaynow) {
				intYearBirth = intYearBirth + 1;
			}
		}
		int Age = intYearNow - intYearBirth;
		return Age;
	}

	void printInfo(int ckeck) {
		System.out.println("ID : " + id);
		System.out.println("Name : " + firstName + " " + lastName);
		System.out.println("Role : " + Role);
		System.out.print("Address: " + address.streetAddress + " / " + address.district);
		System.out.println(" / " + address.city + " " + address.zipCode);

	}
}
