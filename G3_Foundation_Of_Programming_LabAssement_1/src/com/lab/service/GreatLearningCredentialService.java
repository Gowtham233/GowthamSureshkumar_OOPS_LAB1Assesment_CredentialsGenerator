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
	 * @generatePassword is used generate the password with 8 digit
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
	 * @generateEmailAddress is used generate the emailAddress
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
	 * @showCredentials is used generate the emailAddress
	 **/
	@Override
	public void showCredentials(Employee employee) {

		String employeeName = employee.getFirstName();
		String emailAddress = generateEmailAddress(employee);
		String password = generatePassword();

		System.out.println("Dear " + employeeName + " your generated credentials are as follows :");

		System.out.println("Email    ---> " + emailAddress);
		System.out.println("Password ---> " + password);
	}

}
