package moduleThreeMilestone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testValidContact() {
		Contact testContact = new Contact("12345","John","Smith","5554445555","100 belden ave, Alabama");
		assertEquals("12345", testContact.getContactId());
		assertEquals("John", testContact.getFirstName());
		assertEquals("Smith", testContact.getLastName());
		assertEquals("5554445555", testContact.getPhone());
		assertEquals("100 belden ave, Alabama", testContact.getAddress());
	}
	@Test
	void testContactIdNullThrow() {
		assertThrows(IllegalArgumentException.class, () ->
		new Contact(null,"John","Smith","5554445555", "100 belden ave, Alabama"));
	}
	@Test
	void testContactIdLengthThrow() {
		assertThrows(IllegalArgumentException.class, () ->
		new Contact("1111111111111111","John","Smith","5554445555", "100 belden ave, Alabama"));
	}
	@Test
	void testFirstNameNullThrow() {
		assertThrows(IllegalArgumentException.class, () ->
		new Contact("12345",null,"Smith","5554445555", "100 belden ave, Alabama"));
	}
	@Test
	void testFirstNameLengthThrow() {
		assertThrows(IllegalArgumentException.class, () ->
		new Contact("12345","JohnJohnJohnJohn","Smith","5554445555", "100 belden ave, Alabama"));
	}
	@Test
	void testLastNameNullThrow() {
		assertThrows(IllegalArgumentException.class, () ->
		new Contact("12345","John",null,"5554445555", "100 belden ave, Alabama"));
	}
	@Test
	void testLastNameLengthThrow() {
		assertThrows(IllegalArgumentException.class, () ->
		new Contact("12345","John","SmithSmithSmithSmith","5554445555", "100 belden ave, Alabama"));
	}
	
	@Test
	void testPhoneNullThrow() {
		assertThrows(IllegalArgumentException.class, () ->
		new Contact("12345","John","Smith","123", "100 belden ave, Alabama"));
		assertThrows(IllegalArgumentException.class, () ->
		new Contact("12345","John","Smith","abdcefghij", "100 belden ave, Alabama"));
		assertThrows(IllegalArgumentException.class, () ->
		new Contact("12345","John","Smith","55544455555", "100 belden ave, Alabama"));
	}
	@Test
	void testAddressLengthThrow() {
		assertThrows(IllegalArgumentException.class, () -> 
		new Contact("12345","John","Smith","123", "100 belden ave, Alabama 100 belden ave, Alabama 100 belden ave, Alabama"));
	}
	
}
