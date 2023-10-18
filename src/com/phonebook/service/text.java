package com.phonebook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.phonebook.model.Contact;
import com.phonebook.model.PhoneBook;

public class text {	
	public static void main(String[] args) {
		List<Contact> contacts = new ArrayList<>();
		PhoneBook phb = new PhoneBook(contacts);
		Scanner sc = new Scanner(System.in);
		
		
		loop: while(true) {
			System.out.println("Press 1 to Add Contact");
			System.out.println("Press 2 to Search Contact");
			System.out.println("Press 3 to Modify Contact");
			System.out.println("Press 4 to Delete Contact");
			System.out.println("Press 5 to Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Contact name:");
				String phName = sc.next();
				sc.nextLine();
				
				System.out.println("Enter Phone Number:");
				String phNo = sc.next();
				sc.nextLine();
				
				System.out.println("Enter Address:");
				String phAdd = sc.next();
				sc.nextLine();
				
				System.out.println("Enter Contact Type:");
				String phCType = sc.next();
				sc.nextLine();
				
				phb.addContact(new Contact(phName,phNo,phAdd,phCType));
				System.out.println("Contact Added Successfully!");
				break;
			case 2:
				System.out.println("Enter Contact name:");
				String phName1 = sc.next();
				sc.nextLine();
				
				phb.searchContact(phName1);				
				break;
			case 3:
				
				System.out.println("Enter Phone Number:");
				String phNo2 = sc.next();
				sc.nextLine();
				
				System.out.println("Enter Contact name:");
				String phName2 = sc.next();
				sc.nextLine();
				
				System.out.println("Enter Address:");
				String phAdd2 = sc.next();
				sc.nextLine();
				
				System.out.println("Enter Contact Type:");
				String phCType2 = sc.next();
				sc.nextLine();
				
				
				Contact updatedContact = new Contact(phName2,phNo2,phAdd2,phCType2);
				phb.updateContact(updatedContact,phNo2);
				System.out.println("Contact Modified Successfully!");
		
				break;
			case 4:
				System.out.println("Enter Phone number to delete:");
				String phNo3 = sc.next();
				sc.nextLine();
				
				phb.deleteContact(phNo3);
				break;
			case 5:
				sc.close();
				break loop;
			default:
				System.out.println("Invalid Input!!");
			}
			
		}

	}

}
