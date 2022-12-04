package com.lab.interfaces;

import com.lab.model.Employee;

/**
 * CredentialGenerator is the interface class implements the CredentialGenerator
 * should implements all the method defined in CredentialGenerator.
 * CredentialGenerator is the interface This interface holds all the operations
 * that is required to generate email, password, showing credentials.
 **/

public interface CredentialGenerator {

	public String generatePassword();

	public String generateEmailAddress(Employee employee);

	public void showCredentials(Employee employee);

}
