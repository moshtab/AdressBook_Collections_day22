package collections.adressBook;

import java.util.ArrayList;
import java.util.List;

class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Contact c1 = new Contact();
		Contact c2 = new Contact();

		List<Contact> adressBook = new ArrayList<>();
		adressBook.add(c1);
		adressBook.add(c2);
		// for accesing the adressBook list
		for (Contact i : adressBook) {
			System.out.println(i.addContact());
		}
		// for searching element
		for (Contact i : adressBook) {
			if (i.firstName.contains("Mohsin")) {
				System.out.println("Name found");
			} else {
				System.out.println("No match");
			}

		}
		// checking whether contact1 details are equal to contact2
		System.out.println(c1.equals(c2));

		AddingAddressBook addressBook1 = new AddingAddressBook();
		AddingAddressBook addressBook2 = new AddingAddressBook();

		List<AddingAddressBook> adressBooks = new ArrayList<>();
		adressBooks.add(addressBook1);
		adressBooks.add(addressBook2);
		for (AddingAddressBook i : adressBooks) {
			if (i.addAddressBook().contains("Mohsin")) {
				System.out.println("Name found");
			} else {
				System.out.println("No match");
			}

		}

		
	}

}
