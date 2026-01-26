package moduleThreeMilestone;
import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private Map<String, Contact> contacts = new HashMap<>();
	
	//adds a contact and adds an ID
	public void addContact(Contact contact) {
		if(contact == null) {
			throw new IllegalArgumentException("contact must not be a null value");
		}
		String id = contact.getContactId();
		if(contacts.containsKey(id)) {
			throw new IllegalArgumentException("contact must have a unique ID");
		}
		//adds contact to contacts
		contacts.put(id, contact);
	}
	//removes a contact
	public void removeContact(String contactId) {
		if(contactId == null || contactId.trim().isEmpty()) {
			throw new IllegalArgumentException("contactId must not be null value or be empty");
		}
		if(!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("contact not found");
		}
		contacts.remove(contactId);
	}
	
	//updater methods
	public void updateFirstName(String contactId, String firstName) {
		Contact contactToUpdate = getExisting(contactId);
		contactToUpdate.setFirstName(firstName);
	}
	public void updateLastName(String contactId, String lastName) {
		Contact contactToUpdate = getExisting(contactId);
		contactToUpdate.setLastName(lastName);
	}
	public void updatePhone(String contactId, String phone) {
		Contact contactToUpdate = getExisting(contactId);
		contactToUpdate.setPhone(phone);
	}
	public void updateAddress(String contactId, String address) {
		Contact contactToUpdate = getExisting(contactId);
		contactToUpdate.setAddress(address);
	}
	
	public Contact getContact(String contactId) {
		return contacts.get(contactId);
	}
	
	
	
	
	
	private Contact getExisting(String contactId) {
		if(contactId == null || contactId.trim().isEmpty()) {
			throw new IllegalArgumentException("contactId must be nulll or be empty");
		}
		Contact existingContact = contacts.get(contactId);
		if(existingContact == null) {
			throw new IllegalArgumentException("contactId not found");
		}
		return existingContact;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
