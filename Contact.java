package collections.adressBook;

import java.util.HashMap;
import java.util.Scanner;

public class Contact {
	String firstName;
	public String lastName;
	public String city;
	public String state;
	public String email;
	public String phoneNumber;
	public String zip;
	String addContact() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First name");
		firstName = s.nextLine();

		System.out.println("Enter the Last name");
		lastName = s.nextLine();

		System.out.println("Enter the City name");
		city = s.nextLine();

		System.out.println("Enter the State name");
		state = s.nextLine();

		System.out.println("Enter the email");
		email = s.nextLine();

		System.out.println("Enter the Phone number");
		phoneNumber = s.nextLine();

		System.out.println("Enter the Zip");
		zip = s.nextLine();

		HashMap<String, String> contactPerson1 = new HashMap<>();
		contactPerson1.put("FirstName", firstName);
		contactPerson1.put("Last Name", lastName);
		contactPerson1.put("City", city);
		contactPerson1.put("State", state);
		contactPerson1.put("Email", email);
		contactPerson1.put("PhoneNumber", phoneNumber);
		contactPerson1.put("Zip", zip);

		for (String i : contactPerson1.keySet()) {
			System.out.println(i + " : " + contactPerson1.get(i));
		}
		return "";

		
	}

}
