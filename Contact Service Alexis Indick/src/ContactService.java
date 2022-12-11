import java.util.ArrayList;

/*
 * Alexis Indick
 * 11/13/22
 * CS 320
 */
public class ContactService {
	
	int currentIDNumber = 0; 

	// New ArrayList for contacts
	public static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	// Adds contacts by first name, last name, phone number, and address
	public boolean addContact(String firstName, String lastName,String phoneNum, String address) {
		
		String stringID = Integer.toString(currentIDNumber);
		
		Contact newContact = new Contact(stringID, firstName, lastName, phoneNum, address);
		contactList.add(newContact.getContactID(),newContact);
		
		++currentIDNumber; // Increments the ID number
		System.out.println("Contact added!");
		return true;
	}
	// Delete a contact
	public boolean deleteContact(String ID) {
		int IDInt = Integer.valueOf(ID);

		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == IDInt) {
				contactList.remove(i);
			}
			System.out.println("Contact deleted!");
			
		}
		return true;
	}
	// Update Contact function with suggestion from Dr.Waithe
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNum, String address) {
        //loop through contacts
        for (Contact c: contactList) {
            //match contact id
            if (c.getContactID() == Integer.valueOf(contactID)) {
                //check and update first name
                if (firstName != null && (!firstName.equals("")) && !(firstName.length() > 10)) {
                    c.setFn(firstName);
                }
                //check and update last name
                if (lastName != null && (!lastName.equals("")) && !(lastName.length() > 10)) {
                    c.setLn(lastName);
                }
                //check and update phone number
                if (phoneNum != null && (!phoneNum.equals("")) && !(phoneNum.length() > 10)) {
                    c.setPhoneNum(phoneNum);
                }
                //check and update address
                if (address != null && (!address.equals("")) && !(address.length() > 30)) {
                    c.setAddress(address);
                }
                System.out.println("Contact updated!");
                return true;
            } 
        } 
        System.out.println("No contact updated!");
        return false;
    }
	
	// Ability to edit the first name
	public void editFn(String contactID, String firstName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setFn(firstName);				
			}			
		}	
	}
	// Ability to edit the last name
	public void editLn(String contactID, String lastName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setLn(lastName);				
			}			
		}	
	}
	// Ability to edit phone number
	public void editNumber(String contactID, String phoneNum) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setPhoneNum(phoneNum);				
			}			
		}	
	}
	// Ability to edit address
	public void editAddress(String contactID, String address) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setAddress(address);				
			}			
		}	
	}
}
