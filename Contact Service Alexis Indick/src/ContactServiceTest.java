import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/*
 * Alexis Indick
 * 11/13/22
 * CS 320
 */

public class ContactServiceTest {
	
		@AfterEach // Clears the array list after each test.
		void tearDown() throws Exception {
			ContactService.contactList.clear();
		}
		// Adds contact
		@DisplayName("Test addContact")
		@Test
		void testAddContact() {

			String firstName = "Alexis";
			String lastName = "Indick";
			String phoneNum = "0123456789";
			String address = "1234 Main Street";

			ContactService test = new ContactService();

			assertTrue(ContactService.contactList.isEmpty());

			test.addContact(firstName, lastName, phoneNum, address);

			assertFalse(ContactService.contactList.isEmpty());
			assertEquals(0, ContactService.contactList.get(0).getContactID());
			assertEquals(firstName, ContactService.contactList.get(0).getFn());
			assertEquals(lastName, ContactService.contactList.get(0).getLn());
			assertEquals(phoneNum, ContactService.contactList.get(0).getPhoneNum());
			assertEquals(address, ContactService.contactList.get(0).getAddress());
		}
		// Deletes contact
		@DisplayName("Test deleteContact")			  
		@Test void testDeleteContact() {
					  
			String firstName = "Alexis";
			String lastName = "Indick";
			String phoneNum = "0123456789";
			String address = "1234 Main Street";
			boolean testBool = false;
			  
			ContactService test = new ContactService();
			  
			assertTrue(ContactService.contactList.isEmpty());
			 
			test.addContact(firstName, lastName, phoneNum, address);
			test.addContact(firstName, lastName, phoneNum, address);
			test.addContact(firstName, lastName, phoneNum, address);
			  
			assertEquals(3,ContactService.contactList.size());
			  
			test.deleteContact("1");
			  
			assertEquals(2,ContactService.contactList.size());
			 
			// Search for ID
			for(int i = 0; i < ContactService.contactList.size(); i++) {
				if(ContactService.contactList.get(i).getContactID() == 1) {
					testBool = true;
				}
			}		
			assertFalse(testBool);				 
		}
		// Validates phone number 
		@DisplayName("Test editing a phone number")
		@Test
		void testEditPhoneNum() {
			String firstName = "Alexis";
			String lastName = "Indick";
			String phoneNum = "0123456789";
			String address = "1234 Main Street";
			  
			ContactService test = new ContactService();
			test.addContact(firstName, lastName, phoneNum, address);
			
			assertEquals(phoneNum, ContactService.contactList.get(0).getPhoneNum());
			
			test.editNumber("0", "1987654321");
			assertEquals("1987654321", ContactService.contactList.get(0).getPhoneNum());
		}
		// Validates last name
		@DisplayName("Test editing a last name")
		@Test
		void testEditLn() {
			
			String firstName = "Alexis";
			String lastName = "Indick";
			String phoneNum = "0123456789";
			String address = "1234 Main Street";
			  
			ContactService test = new ContactService();
			test.addContact(firstName, lastName, phoneNum, address);
			
			assertEquals(lastName, ContactService.contactList.get(0).getLn());
			
			test.editLn("0", "Test_Name");
			assertEquals("Test_Name", ContactService.contactList.get(0).getLn());
		}
		// Validates first name 
		@DisplayName("Test editing a first name")
		@Test
		void testEditFn() {
			
			String firstName = "Alexis";
			String lastName = "Indick";
			String phoneNum = "0123456789";
			String address = "1234 Main Street";

			ContactService test = new ContactService();
			test.addContact(firstName, lastName, phoneNum, address);
			
			assertEquals(firstName, ContactService.contactList.get(0).getFn());
			
			test.editFn("0", "Test_First");
			assertEquals("Test_First", ContactService.contactList.get(0).getFn());
		}
		// Validates address
		@DisplayName("Test editing an address")
		@Test
		void testEditAddress() {
			
			String firstName = "Alexis";
			String lastName = "Indick";
			String phoneNum = "0123456789";
			String address = "1234 Main Street";

			ContactService test = new ContactService();
			test.addContact(firstName, lastName, phoneNum, address);
			
			assertEquals(address, ContactService.contactList.get(0).getAddress());
			
			test.editAddress("0", "Test_Address");
			assertEquals("Test_Address", ContactService.contactList.get(0).getAddress());
		}
		//Test update function 
		@DisplayName("Testing update function")
		@Test
		void testUpdateContact() {
			String contactID = "0";
			String firstName = "Alexis";
			String lastName = "Indick";
	        String phoneNum = "0123456789";
	        String address = " 1234 Main Street";
			  
	        ContactService temp = new ContactService();
	        
	        temp.addContact(firstName, lastName, phoneNum, address); 
	        
	        temp.editFn(contactID, "Larry");
	        temp.editLn(contactID, "Smith");
	        temp.editNumber(contactID, "1234567890");
	        temp.editAddress(contactID, "123 Apple Dr");

	        temp.updateContact(contactID, firstName, lastName, phoneNum, address);
	        
	        
	        assertEquals(0, ContactService.contactList.get(0).getContactID());
			assertEquals(firstName, ContactService.contactList.get(0).getFn());
			assertEquals(lastName, ContactService.contactList.get(0).getLn());
			assertEquals(phoneNum, ContactService.contactList.get(0).getPhoneNum());
			assertEquals(address, ContactService.contactList.get(0).getAddress());
	        
		}
		//Testing a bad update
		@DisplayName("Testing a bad update")
		@Test
		void testUpdateContactInvalid() {
			String contactID = "3243253463452523534656";
			String firstName = "Larryyyyyyyyyy";
			String lastName = "Smiiiiiiiiiithhh";
	        String phoneNum = "34234234234235235";
	        String address = "1223234324252 Apple Driveeeeee";
			  
	       
	        
	        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> {
	        	 ContactService temp = new ContactService();
	 	        
	      		temp.updateContact(contactID,firstName , lastName , phoneNum, address);
	        });
	      
	        assertEquals("Invalid contact ID!", exc.getMessage());
	      	assertEquals("Invalid first name!", exc.getMessage());
	      	assertEquals("Invalid last name!", exc.getMessage());
	      	assertEquals("Invalid phone number!", exc.getMessage());
	      	assertEquals("Invalid address!", exc.getMessage());
	      
		}
		
}
