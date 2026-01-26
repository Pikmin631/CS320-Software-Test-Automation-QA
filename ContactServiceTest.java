package moduleThreeMilestone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService testService = new ContactService();
		Contact testContact = new Contact("12345", "John", "Smith", "1234567890", "100 belden ave, Alabama");
		testService.addContact(testContact);
	}
	@Test
	void testDuplicate() {
		ContactService testService = new ContactService();
		Contact testContact = new Contact("12345", "John", "Smith", "1234567890", "100 belden ave, Alabama");
		testService.addContact(testContact);
		assertThrows(IllegalArgumentException.class, () ->
		testService.addContact(testContact));
	}
	@Test
	void testRemoveContact() {
		ContactService testService = new ContactService();
		Contact testContact = new Contact("12345", "John", "Smith", "1234567890", "100 belden ave, Alabama");
		testService.addContact(testContact);
		testService.removeContact("12345");
		assertNull(testService.getContact("12345"));
	}
	@Test
	void testMissingID() {
		ContactService testService = new ContactService();
		assertThrows(IllegalArgumentException.class, () -> testService.removeContact("missing"));
	}
	@Test
	void testUpdateContact() {
		ContactService testService = new ContactService();
		Contact testContact = new Contact("12345", "John", "Smith", "1234567890", "100 belden ave, Alabama");
		testService.addContact(testContact);
		testService.updateFirstName("12345", "Zack");
		testService.updateLastName("12345", "Miller");
		testService.updatePhone("12345", "4443334444");
		testService.updateAddress("12345", "800 north rd, Tennessee");
		
		Contact updatedContact = testService.getContact("12345");
		assertEquals("Zack", updatedContact.getFirstName());
		assertEquals("Miller", updatedContact.getLastName());
		assertEquals("4443334444", updatedContact.getPhone());
		assertEquals("800 north rd, Tennessee", updatedContact.getAddress());
		
	}
	@Test
	void testInvalidUpdates() {
		ContactService testService = new ContactService();
		Contact testContact = new Contact("12345", "John", "Smith", "1234567890", "100 belden ave, Alabama");
		testService.addContact(testContact);
		
		assertThrows(IllegalArgumentException.class, () ->
		testService.updateFirstName("12345", null));
		assertThrows(IllegalArgumentException.class, () ->
		testService.updateAddress("12345", null));
		assertThrows(IllegalArgumentException.class, () ->
		testService.updatePhone("12345", "123"));
		
	}
	
}
