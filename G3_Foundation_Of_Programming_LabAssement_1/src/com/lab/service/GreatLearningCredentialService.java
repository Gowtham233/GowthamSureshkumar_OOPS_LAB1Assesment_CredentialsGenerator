package com.lab.service;

import java.security.SecureRandom;
import com.lab.interfaces.CredentialGenerator;
import com.lab.model.Employee;

/**
 * GreatLearningCredentialService is the class that implements from
 * CredentialGenerator The implementation of the methods generatePassword,
 * generateEmailAddress, showCredentials are implemented.
 * 
 **/

public class GreatLearningCredentialService implements CredentialGenerator {

	/**
	 * generatePassword method is used generate the password with 8 digit
	 **/
	@Override
	public String generatePassword() {

		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^*()-/&+=<>.{}[]:";

		// using SecureRandom is cryptographically strong
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		int randomIndex;
		for (int i = 0; i < 8; i++) {
			randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}
		return sb.toString();
	}

	/**
	 * generateEmailAddress method is used generate the emailAddress
	 **/
	@Override
	public String generateEmailAddress(Employee employee) {

		StringBuilder generartedEmail = new StringBuilder();
		generartedEmail.append(employee.getFirstName().toLowerCase()).append(employee.getLastName().toLowerCase())
				.append("@").append(employee.getDepartmentName().toLowerCase()).append(".")
				.append(employee.getCompanyName().toLowerCase()).append(".com");
		return generartedEmail.toString();
	}

	/**
	 * showCredentials method is used to display the emailAddress and password
	 **/
	@Override
	public void showCredentials(Employee employee) {

		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows :");

		System.out.println("Email    ---> " + employee.getEmailAddress());
		System.out.println("Password ---> " + employee.getPassword());
		System.out.println("Thank You :) Have a Nice Day " + employee.getFirstName());
		
	}

}
