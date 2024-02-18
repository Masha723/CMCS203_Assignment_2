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
 * PatientDriverApp class
 * @author Mariia Leskovets
 *
 */

public class PatientDriverApp {
	
	public static void displayPatient(Patient one) {
		one.toStringg();
	}
	public static void displayProcedure(Procedure one) {
		one.toStringg();
		
	}
	
	public static double calculateTotalCharges(Procedure one, Procedure two,Procedure three) {
		double charges=Double.valueOf(one.price_of_procedure)+Double.valueOf(two.price_of_procedure)+Double.valueOf(three.price_of_procedure);
		return charges;
				
	}

	public static void main(String[] args) {
		
		Patient patient=new Patient("Jane","Margaret","Doe");
		
		Procedure one_procedure=new Procedure();
		one_procedure.title = "Lip injection";
		one_procedure.date="06/02/1996";
		one_procedure.practicioner_name="Dr. House F.";
		one_procedure.price_of_procedure=10.006;
		
		Procedure two_procedure=new Procedure("Dental Hyengine","06/06/1996");
		two_procedure.practicioner_name="Dr House F.";
		two_procedure.price_of_procedure=30.00;
		
		Procedure three_procedure=new Procedure("Rinoplastic","06/06/1996","Dr House J.",40.090);
		
		displayPatient(patient);
		displayProcedure(one_procedure);
		displayProcedure(two_procedure);
		displayProcedure(three_procedure);
		double total=calculateTotalCharges(one_procedure,two_procedure,three_procedure);
		System.out.printf("\nTotal Charges: $%.2f",total);
		System.out.println("\n\nStudent's name: Mariia Leskovers");
		System.out.println("MC#: M21174658");
		System.out.println("Due Date: 02/19/2024");
		
		}
}


