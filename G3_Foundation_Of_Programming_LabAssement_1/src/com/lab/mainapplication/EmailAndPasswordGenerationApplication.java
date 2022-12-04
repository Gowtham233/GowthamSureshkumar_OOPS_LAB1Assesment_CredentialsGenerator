package com.lab.mainapplication;

import java.util.Scanner;

import com.lab.interfaces.CredentialGenerator;
import com.lab.model.Employee;
import com.lab.service.GreatLearningCredentialService;

/**
 * DriverApplication to generated the Email Address and password for the
 * Employee. User UI shows the option and user should select the department for
 * generating Email and password.
 **/

public class EmailAndPasswordGenerationApplication {

	public static void main(String[] args) {

		String firstName;
		String lastName;
		String companyName;

		Scanner userInput = new Scanner(System.in);

		// Getting the first name from the user
		System.out.println("Enter your First Name : ");
		firstName = userInput.nextLine();

		// Getting the last name from the user
		System.out.println("Enter your Last Name : ");
		lastName = userInput.nextLine();

		Employee employee = new Employee(firstName, lastName);

		// Getting the Company name from the user
		System.out.println("Enter your Company Name : ");
		companyName = userInput.nextLine();
		employee.setCompanyName(companyName);

		CredentialGenerator credential = new GreatLearningCredentialService();

		System.out.println("Logged in successfully for Generating Credentials ");

		// give options to 1.Technical, 2.Admin, 3. Human Resource, 4.Legal
		System.out.println("Please Enter the department from the following : ");
		System.out.println("1. Technical (tech)");
		System.out.println("2. Admin (adm)");
		System.out.println("3. Human Resource (hr)");
		System.out.println("4. Legal (lg)");

		int option = userInput.nextInt();

		// using switch case to generate email and password for specific department
		// based on user input
		switch (option) {
		case 1: {
			employee.setDepartmentName("tech");
			credential.showCredentials(employee);
		}
			break;

		case 2: {
			employee.setDepartmentName("adm");
			credential.showCredentials(employee);
		}
			break;

		case 3: {
			employee.setDepartmentName("hr");
			credential.showCredentials(employee);
		}
			break;
		case 4: {
			employee.setDepartmentName("lg");
			credential.showCredentials(employee);
		}
			break;
		default: {
			System.out.println("Please enter the valid department");
		}
		}
		userInput.close();
	}
}
