/**Class: CMSC203 CRN 30338
	Program: Assignment 1 Design
	Instructor: Ahmed Tarek
	Summary of Description:   
	
	
	Due Date: 02/19/2024
	Integrity Pledge: I pledge that I have completed the programming assignment independently.
	I have not copied the code from a student or any source.
	Student’s Name: Mariia Leskovets
*
*/
/**
 * Procedure class, represents a Patient object
 * @author Mariia Leskocets
 *
 */

public class Procedure {
	String title;
	String date;
	String practicioner_name;
	double price_of_procedure;
	
	/**
	 * Returns the procedure's title 
	 * @return a String corresponding the title 
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * sets the procedure's title 
	 * @param title is the procedure's title 
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Returns the procedure's date 
	 * @return a String corresponding to the date 
	 */
	public String getDate() {
		return date;
	}/**
	 * sets the procedure's date 
	 * @param date is the procedure's date 
	 */
	public void setDate(String date) {
		this.date = date;
	}/**
	 * Returns the practicioner_name
	 * @return a String corresponding to practicioner_name
	 */
	public String getPracticioner_name() {
		return practicioner_name;
	}/**
	 * sets the practicioner_name 
	 * @param practicioner_name is the name of practitioner who performed the procedure 
	 */
	public void setPracticioner_name(String practicioner_name) {
		this.practicioner_name = practicioner_name;
	}
	/**
	 * Returns the price_of_procedure
	 * @return a double corresponding to price_of_procedure
	 */
	public double getPrice_of_procedure() {
		return price_of_procedure;
	}
	/**
	 * sets the price_of_procedure 
	 * @param practicioner_name is the price of the performed procedure 
	 */
	public void setPrice_of_procedure(double price_of_procedure) {
		this.price_of_procedure = price_of_procedure;
	}
	/**
	 * Default no-arg Constructor
	 */
	public Procedure() {
		}
	/**
	 * Constructor that takes data as input and sets them
	 * @param title String
	 * @param date String
	 */
	public Procedure(String title,String date) {
		this.title=title;
		this.date=date;
	}
	/**
	 * Constructor that takes data as input and sets them
	 * @param title String
	 * @param date String
	 * @param practicioner_name String
	 * @param price_of_procedure double
	 */
	public Procedure(String title,String date, String practicioner_name,double price_of_procedure) {
		this.title=title;
		this.date=date;
		this.practicioner_name=practicioner_name;
		this.price_of_procedure=price_of_procedure;
	}
	
	/*
	 * Displays the procedures information
	 */
	public void toStringg() {
		System.out.println("\n\tProcedure "+title);
		System.out.println("\tProcedureDate "+date);
		System.out.println("\tPracticioner="+practicioner_name);
		System.out.println("\tCharge="+price_of_procedure+"\n");
	}
}
