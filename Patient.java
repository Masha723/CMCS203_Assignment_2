/**Class: CMSC203 CRN 30338
	Program: Assignment 1 Design
	Instructor: Ahmed Tarek
	Summary of Description: the class is a template to the object Patient 
							which contains patient's personal information. 
							Also, the class has methods which return
							 merged string of its personal information  
	
	
	Due Date: 02/19/2024
	Integrity Pledge: I pledge that I have completed the programming assignment independently.
	I have not copied the code from a student or any source.
	Student’s Name: Mariia Leskovets
*
*/

/**
 * Patient class, represents a Patient object
 * @author Mariia Leskocets
 *
 */


public class Patient {
	String first_name;		
	String last_name;
	String middle_name;
	String phone_number;
	String emergency_name;
	String emergency_phone;
	String street_address;
	String city;
	String state;
	String zip_code;

	/**
	 * Returns the patient's first_name 
	 * @return a String corresponding to the patient's first_name 
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * sets the patient's first_name
	 * @param first_name is the patient's first_name
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * Returns the patient's last_name 
	 * @return a String corresponding to the patient's last_name 
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * sets the patient's last_name
	 * @param last_name is the patient's last_name
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * Returns the patient's middle_name 
	 * @return a String corresponding to the patient's middle_name 
	 */
	public String getMiddle_name() {
		return middle_name;
	}
	/**
	 * sets the patient's middle_name
	 * @param middle_name is the patient's middle_name
	 */
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	/**
	 * Returns the patient's emergency_name
	 * @return a String corresponding to the patient's emergency_name 
	 */
	public String getEmergency_name() {
		return emergency_name;
	}
	/**
	 * sets the patient's emergency_name
	 * @param emergency_name is the patient's emergency contact
	 */
	public void setEmergency_name(String emergency_name) {
		this.emergency_name = emergency_name;
	}
	/**
	 * Returns the patient's emergency_phone
	 * @return a String corresponding to the patient's emergency_phone 
	 */
	public String getEmergency_phone() {
		return emergency_phone;
	}
	/**
	 * sets the patient's emergency_phone
	 * @param emergency_phone is the patient's emergency contact phone number
	 */
	public void setEmergency_phone(String emergency_phone) {
		this.emergency_phone = emergency_phone;
	}
	/**
	 * Returns the patient's street_address
	 * @return a String corresponding to the patient's street_address 
	 */
	public String getStreet_address() {
		return street_address;
	}
	/**
	 * sets the patient's street_address
	 * @param street_address is the patient's street address
	 */
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	/**
	 * Returns the patient's city of living
	 * @return a String corresponding to the patient's city of living 
	 */
	public String getCity() {
		return city;
	}
	/**
	 * sets the patient's city of living
	 * @param city is the patient's city of living
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * Returns the patient's state of living
	 * @return a String corresponding to the patient's state 
	 */
	public String getState() {
		return state;
	}
	/**
	 * sets the patient's state of living
	 * @param state is the patient's state of living
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * Returns the patient's ZIP code 
	 * @return a String corresponding to the patient's ZIP code
	 */
	public String getZip_code() {
		return zip_code;
	}
	/**
	 * sets the patient's ZIP codeZIP
	 * @param ZIP code is patient's ZIP code
	 */
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	/**
	 * Default no-arg Constructor
	 */
	public Patient() {
		
	}
	/**
	 * Constructor that takes data as input and sets them.
	 * @param name - patient's name
	 * @param middle_name -patient's middle name
	 * @param last_name - patient's last name
	 * @param phone_number - patient's phone number
	 * @param emergency_name - patient's emergency contact
	 * @param emergency_phone - patient's emergency contact number
	 * @param street_address - patient's street address
	 * @param city  - patient's city
	 * @param state - patient's state
	 * @param zip_code - patient's ZIP code 

	 */
	
	public Patient(String name, String middle_name,String last_name,String phone_number, String emergency_name,String emergency_phone,String street_address,String city,String state, String zip_code) {
		this.first_name=name;
		this.middle_name=middle_name;
		this.last_name=last_name;
		this.phone_number=phone_number;
		this.emergency_name=emergency_name;
		this.emergency_phone=emergency_phone;
		this.street_address=street_address;
		this.city=city;
		this.state=state;
		this.zip_code=zip_code;
	}
	
	/**
	 * Constructor that takes data as input and sets them
	 * @param name String
	 * @param middle_name String
	 * @param last_name String
	 */
	
	public Patient(String name, String middle_name,String last_name) {
		this.first_name=name;
		this.middle_name=middle_name;
		this.last_name=last_name;
	}

	
	
	/* Returns a merged String of last, middle and first names of the patient
	 */
	public  String buildFullName() {
		String result=first_name+" "+middle_name+" "+last_name;
		return result;
	
	}
	/* Returns a merged String of street_address, city,state and ZIP code of the patient
	 */
	public  String buildAddress() {
		String result =street_address+" "+city+" "+state+" "+zip_code;
		return result;
	}
	/* Returns a merged String of the name and phone number of the patient's emergency contact
	 */
	public  String buildEmergencyContact() {
		String result=emergency_name+" "+emergency_phone;
		return result;
	}
	/*
	 * Displays Patient's personal data
	 */
	public void toStringg() {
		System.out.println("Patient info:");
		System.out.println("  Name: "+buildFullName());
		System.out.println("  Address: "+buildAddress());
		System.out.println("  EmergencyContact: "+buildEmergencyContact());
	}
}

