package collections.adressBook;

import java.util.HashMap;
import java.util.Scanner;

public class AddingAddressBook {

	private String firstName, lastName, city, state,phoneNumber, zip,email;
	

	public String addAddressBook() {

		System.out.println("Adding Contact Details of Contact1 Person");
		addContact();
		
		

		System.out.println();
		System.out.println("Deleting Contact Details of Contact1 Person");
		deleteContact();
		System.out.println("Displaying deleted Contact Details of Contact1 Person");
		printContact();
		System.out.println();
		return "";

	}

	private String addContact() {
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

	public void printContact() {
		System.out.println("First Name is : " + firstName);
		System.out.println("Last Name is : " + lastName);
		System.out.println("City Name is : " + city);
		System.out.println("State Name is : " + state);
		System.out.println("Phone Number is : " + phoneNumber);
		System.out.println("Zip is : " + zip);

	}

	public void deleteContact() {
		firstName = " ";
		lastName = " ";
		city = " ";
		state = " ";
		phoneNumber = "";
		zip = "";
	}
}


