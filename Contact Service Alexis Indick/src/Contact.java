/*
 * Alexis Indick
 * 11/13/22
 * CS 320
 */
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	// Validating contactID length
	private boolean validateContactID(String contactID) {
		// If the contactID is greater than 10 or null, false is returned.
		if((contactID.length() > 10) || (contactID == null) ) {
			return false;
		}
		return true;
	}
	// Validating firstName
	private boolean validateFn(String firstName) {
		// firstName cannot be longer than 10 characters or null.
		if((firstName.length() > 10) || (firstName == null)) {
			return false;
		}
		return true;
	}
	//Validating lastName
	private boolean validateLn(String lastName) {
		// lastName cannot be longer than 10 characters or null. 
		if((lastName.length() > 10) || (lastName == null)) {
			return false;
		}
		return true;
	}
	// Validating phoneNum
	private boolean validatePhoneN(String phoneNum) {
		// phoneNum must be no longer than 10 characters or null. 
		if((phoneNum.length() != 10) || (phoneNum == null)) {
			return false;
		}
		return true;
	}
	// Validating address
	private boolean validateAddress(String address) {
		// lastName cannot be longer than 30 characters or null. 
		if((address.length() > 30) || (address == null)) {
			return false;
		}
		return true;
	}
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		
		if(!this.validateContactID(contactID)) {
			throw new IllegalArgumentException("Invalid contact ID!");
		}
		
		if(!this.validateFn(firstName)) {
			throw new IllegalArgumentException("Invalid first name!");
		}
		
		if(!this.validateLn(lastName)) {
			throw new IllegalArgumentException("Invalid last name!");
		}
		
		if(!this.validatePhoneN(phoneNum)) {
			throw new IllegalArgumentException("Invalid phone number!");
		}
		
		if(!this.validateAddress(address)) {
			throw new IllegalArgumentException("Invalid address!");
		}		
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	//Gets the contact ID
	public int getContactID() {
		return Integer.valueOf(contactID);
	}

	// Gets the first name
	public String getFn() {
		return firstName;
	}
	// Gets the last name
	public String getLn() {
		return lastName;
	}
	// Gets the phone number
	public String getPhoneNum() {
		return phoneNum;
	}
	// Gets the address
	public String getAddress() {
		return address;
	}
	// Sets the first name
	public void setFn(String firstName) {
		if(!this.validateFn(firstName)) {
			throw new IllegalArgumentException("Invalid first name!");
		}
		this.firstName = firstName;
	}
	
	// Sets the last name
	public void setLn(String lastName) {
		if(!this.validateLn(lastName)) {
			throw new IllegalArgumentException("Invalid last name!");
		}
		this.lastName = lastName;
	}
	
	// Sets the phone number
	public void setPhoneNum(String phoneNum) {
		if(!this.validatePhoneN(phoneNum)) {
			throw new IllegalArgumentException("Invalid phone number!");
		}
		this.phoneNum = phoneNum;
	}
	
	// Sets the Address
	public void setAddress(String address) {
		if(!this.validateAddress(address)) {
			throw new IllegalArgumentException("Invalid address!");
		}	
		this.address = address;
	}

}
