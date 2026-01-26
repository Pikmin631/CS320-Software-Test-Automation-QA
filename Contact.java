package moduleThreeMilestone;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {
		this.contactId = checkContactId(contactId);
		this.firstName = checkName(firstName, "firstName");
		this.lastName = checkName(lastName, "lastName");
		this.phone = checkPhone(phone);
		this.address = checkAddress(address);
	}
	
	//Getters
	public String getContactId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
		
	}
	public String getAddress() {
		return address;
	}
	//setters
	public void setFirstName(String firstName) {
		this.firstName = checkName(firstName, "firstName");
	}
	public void setLastName(String lastName) {
		this.lastName = checkName(lastName, "lastName");
	}
	public void setPhone(String phone) {
		this.phone = checkPhone(phone);
	}
	public void setAddress(String address) {
		this.address = checkAddress(address);
	}
	
	//Check methods
	private static String checkContactId(String contactId) {
		//checks for null or empty
		if(contactId == null || contactId.trim().isEmpty()) {
			throw new IllegalArgumentException("ContactId must not be a null value or be empty");
		}
		//checks if contactId is more than 10 characters
		if(contactId.length() > 10) {
			throw new IllegalArgumentException("ContactId must be 10 characters or less");
		}
		return contactId;
	}
	public static String checkName(String name, String type ) {
		//checks for null or empty
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException(type + " must not be a null value or empty");
		}
		//checks if name is more than 10 characters
		if(name.length() > 10) {
			throw new IllegalArgumentException(type + " must be 10 characters or less");
		}
		return name;
	}
	public static String checkPhone(String phone) {
		//checks if phone is null or not
		if(phone == null) {
			throw new IllegalArgumentException("Phone must not be a null value");
		}
		//checks if phone is exactly 10 digits
		
		if(!phone.matches("\\d{10}")){
			throw new IllegalArgumentException("Phone must be a 10 digit number");
		}
		return phone;
	}
	
	public static String checkAddress(String address) {
		//checks if address is null or empty
		if(address == null || address.trim().isEmpty()) {
			throw new IllegalArgumentException("Address must not be a null value or be empty");
		}
			//checks if address is more than 30 characters
		if(address.length()> 30) {
			throw new IllegalArgumentException("address must be 30 characters or less");
		}
		
		return address;
	}
}

