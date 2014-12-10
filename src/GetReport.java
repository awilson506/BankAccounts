/*
 * Name: Adam Wilson
 * Project: 2
 * Class: COSC 600
 * 
 * This program reads in banking credentials for different types of accounts.
 * Based on the account type that is read in different interest is calculated 
 * using inheritance and polymorphism for the method getInterest()
 */

import java.util.List;

public class GetReport {
	
	public static void main(String[] args) {
		
		List<Account> accountList = Drivers.readGrades();
		Drivers.printGrades(accountList);
		
	}
}
