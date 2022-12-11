import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/*
 * Alexis Indick
 * 11/13/22
 * CS 320
 */

public class ContactTest {
	
		
	// Testing a constructor with valid behavior.	
	
	@DisplayName("Test a constructor that is valid")
	@Test
	public void testGoodConstructor() {
        String contactID = "1";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);
        
		assertEquals(1, testContact.getContactID());
		assertEquals(firstName, testContact.getFn());
		assertEquals(lastName, testContact.getLn());
		assertEquals(phoneNum, testContact.getPhoneNum());
		assertEquals(address, testContact.getAddress());
	}
	

//Test a constructor with an invalid phone number length
	@DisplayName("Test a constructor that is invalid")
	@Test
	public void testBadConstructor() {
        String contactID = "2";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1";
        String address = "1234 Main Ave";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactID, firstName, lastName, phoneNum, address);
        });
	}
	
// Test if setFn is valid
	@DisplayName("Test if setFn is valid")
	@Test
	public void testGoodSetFirst() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   
        testContact.setFn("Test");        
        assertEquals("Test", testContact.getFn());
	}
	
// Test if setFn is null
	@DisplayName("Test if setFn is null")
	@Test
	public void testBadSetFirst() {
        String contactID = "3";
      	String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   
        
     
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFn(null);
        });
        
	}
	
//Test if length of setFn is valid
	@DisplayName("Test if length of setFn is valid")
	@Test
	public void testLongSetFirst() {
        String contactID = "3";
        String firstName = "Alexiswerawrestgd";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactID, firstName, lastName, phoneNum, address);
        });
	}
	
// Tests if getContactID returns an integer
	@DisplayName("Tests if getContactID returns an integer")
	@Test
	public void testGetContactID() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   
        assertEquals(3, testContact.getContactID());
	}
	
// Tests if getContactID doesn't return a String
	@DisplayName("Tests if getContactID doesn't return a String")
	@Test
	public void testBadGetID() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   
        assertNotEquals("3", testContact.getContactID());
	}
	
// Tests getContactID length
	@DisplayName("Tests if getContactID returns too long")
	@Test
	public void testlongGetID() {
        String contactID = "1234567891056213";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactID, firstName, lastName, phoneNum, address);
        });
	}
	
// Test setLn is null
	@DisplayName("Test setLn is null")
	@Test
	public void testBadSetLast() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = null;
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactID, firstName, lastName, phoneNum, address);
        });
	}
	
// Test setLn is too long
	@DisplayName("Test setLn is too long")
	@Test
	public void testLongSetLast() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indickrfsdtyrdgasaasfa";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactID, firstName, lastName, phoneNum, address);
        });
	}
	
// Test setLn is valid
	@DisplayName("Test setLn is valid")
	@Test
	public void testGoodsetLast() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   
        testContact.setLn("Test");        
        assertEquals("Test", testContact.getLn());
	}
	
// Test setPhoneNum is null
	@DisplayName("Test setPhoneNum is null")
	@Test
	public void testBadSetPhone() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = null;
        String address = "1234 Main Ave";
		
      
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactID, firstName, lastName, phoneNum, address);
        });
        
	}
	
// Test if length of setPhoneNum is invalid
	@DisplayName("Test if length of setPhoneNum is invalid")
	@Test
	public void testWrongLengthPhone() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNum("1");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNum("1234567891013234234112131415");
        });
	}
// Test if length of setPhoneNum is valid
	@DisplayName("Test if length of setPhoneNum is valid")
	@Test
	public void testGoodPhone() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   

        testContact.setPhoneNum("7852158964");        
        assertEquals("7852158964", testContact.getPhoneNum());

	}
	
// Test if setAddress is null
	@DisplayName("Test if setAddress is null")
	@Test
	public void testNullSetAddress() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
// Test if length of setAddress is invalid
	@DisplayName("Test if length of setAddress is invalid")
	@Test
	public void testWrongLengthAddress() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("retsdfaratsrgdhdhturtyrtyrts");
        });
	}
// Test if length of setAddress is valid
	@DisplayName("Test a valid length setAddress")
	@Test
	public void testGoodAddress() {
        String contactID = "3";
        String firstName = "Alexis";
        String lastName = "Indick";
        String phoneNum = "1234567890";
        String address = "1234 Main Ave";
		
        Contact testContact = new Contact(contactID, firstName, lastName, phoneNum, address);   

        testContact.setAddress("testing address");        
        assertEquals("testing address", testContact.getAddress());

	}
}
