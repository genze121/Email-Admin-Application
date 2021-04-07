package com.admin.email;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private int passwordLength = 10;
	private String email;
	private String companySuffix = "company.com";

	public Email() {
		super();
	}

	// accepting the constructor with firstname and lastname
	public Email(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;

		// getting the firstname and lastname of the User
		System.out.println("Email Created:- " + this.firstname + " " + this.lastname);

		// getting the department
		this.department = setDepartment();
		System.out.println("==================================================");
		System.out.println("Your department is:- " + this.department);

		// getting the Random Password
		this.password = setRandomPassword(passwordLength);
		System.out.println("Your Password is:- " + this.password);

		//generating the email id for user
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
		
	}

	// set the department to which the user wants to choose
	private String setDepartment() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("DEPARTMENT CODES");
		System.out.println("==================================================");

		System.out.println("1.For Sales");
		System.out.println("2.For Development");
		System.out.println("3.For Accounting");
		System.out.println("0.For None");

		System.out.println("==================================================");

		System.out.print("Enter the Department code:- ");
		int deptChoice = scan.nextInt();

		if (deptChoice == 1) {
			String option1 = "sales";
			return option1;
		} else if (deptChoice == 2) {
			String option2 = "development";
			return option2;
		} else if (deptChoice == 3) {
			String option3 = "accounting";
			return option3;
		} else {
			String none = "";
			return none;
		}

	}

	// set the random password
	private String setRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&()]{";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}

		return new String(password);
	}

	// set for mailBoxCapacity
	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	// set for alternateEmail
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	// set for changePassword
	public void setChangePassword(String password) {
		this.password = password;
	}

	// getting for mailBoxCapacity
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	// getting for alternateEmail
	public String getAlternateEmail() {
		return alternateEmail;
	}

	// getting for changePassword
	public String getChangePassword() {
		return password;
	}
	
	public String showInfo() {
		
		return "DISPLAY NAME:- " + firstname + " " + lastname + 
				"\n" + "COMPANY EMAIL:- " + email + 
				"\n" + "MAILBOX CAPACITY:- " + mailBoxCapacity + " " + "mb";
	}

	@Override
	public String toString() {
		return "Email [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
