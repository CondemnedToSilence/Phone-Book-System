package com.phonebook.model;

import java.util.Objects;

public class Contact {
	private String Name;
	private String phoneNumber;
	private String address;
	private String contacttype;

	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(phoneNumber);
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(phoneNumber, other.phoneNumber);
	}






	public String getName() {
		return Name;
	}






	public void setName(String name) {
		Name = name;
	}






	public String getPhoneNumber() {
		return phoneNumber;
	}






	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}






	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}






	public String getContacttype() {
		return contacttype;
	}






	public void setContacttype(String contacttype) {
		this.contacttype = contacttype;
	}






	public Contact(String name, String phoneNumber, String address, String contacttype) {
		super();
		this.Name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.contacttype = contacttype;
	}






	
}
