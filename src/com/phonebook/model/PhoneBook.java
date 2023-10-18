package com.phonebook.model;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	List<Contact> Contacts = new ArrayList<>(); 
	
	public PhoneBook(List<Contact> contacts) {
		super();
		Contacts = contacts;
	}

	public void addContact(Contact a){
		Contacts.add(a);
	}
	
	public void searchContact(String a) {
		boolean flag = true;
		for(Contact c:Contacts) {
				if(c.getName().equals(a)) {
					System.out.println(c.getName() + " " + c.getPhoneNumber() + " " + c.getAddress() + " " + c.getContacttype());
					flag = false;
				}
		}
		if(flag) {
			System.out.println("No Contact Found");
		}
	}
	
	
	public void updateContact(Contact a,String phNo) {
		boolean flag = true;
		int index = 0;
		for(Contact c:Contacts) {
				if(c.getPhoneNumber().equals(phNo)) {
					Contacts.set(index, a);
					flag = false;
					break;
				}
				index ++;
		}
		if(!flag) {
			System.out.println("Incorrect Phone Number");
		}
	}
	
	
	
	
	public void deleteContact(String phNo) {
		boolean flag = true;
		for(Contact c:Contacts) {
			if(c.getPhoneNumber().equals(phNo)) {
				Contacts.remove(c);
				flag = false;
				break;
			}
		}
		if(!flag) {
			System.out.println("Incorrect Contact");
		}
	}
	
	
	
	
	
	
	
}
