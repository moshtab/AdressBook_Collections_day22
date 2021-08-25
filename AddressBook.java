package collections.adressBook;

import java.util.Scanner;

class AddingAddressBook {

	private String firstName, lastName, city, state;
	private long phoneNumber, zip;

	public void addAddressBook() {

		System.out.println("Adding Contact Details of Contact1 Person");
		addContact();
		System.out.println("Displaying Contact Details of Contact1 Person");
		printContact();

		System.out.println();
		System.out.println("Deleting Contact Details of Contact1 Person");
		deleteContact();
		System.out.println("Displaying deleted Contact Details of Contact1 Person");
		printContact();
		System.out.println();

	}

	public void addContact() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First name");
		firstName = s.nextLine();

		System.out.println("Enter the Last name");
		lastName = s.nextLine();

		System.out.println("Enter the City name");
		city = s.nextLine();

		System.out.println("Enter the State name");
		state = s.nextLine();

		System.out.println("Enter the Phone number");
		phoneNumber = s.nextLong();

		System.out.println("Enter the Zip");
		zip = s.nextLong();

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
		phoneNumber = 0;
		zip = 0;
	}
}

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		AddingAddressBook addressBook1 = new AddingAddressBook();
		AddingAddressBook addressBook2 = new AddingAddressBook();
		AddingAddressBook addressBook3 = new AddingAddressBook();

		System.out.println();
		System.out.println("Displaying contact details of ADDRESS BOOK1");
		addressBook1.addAddressBook();

		System.out.println();
		System.out.println("Displaying contact details of ADDRESS BOOK2");
		addressBook2.addAddressBook();

		System.out.println();
		System.out.println("Displaying contact details of ADDRESS BOOK3");
		addressBook3.addAddressBook();

	}

}
