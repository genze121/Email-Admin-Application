package com.admin.email;

public class EmailAdminApp {

	public static void main(String[] args) {
		Email email = new Email("Hello", "World");

		email.setAlternateEmail("coder@gmail.com");
		System.out.println("Your alternate email is:- " + email.getAlternateEmail());
		System.out.println("==================================================");
		
		System.out.println(email.showInfo());
		System.out.println("=========================================================================");

		System.out.println("User created the Email:- " + email.toString());
		System.out.println("=========================================================================");

	}

}
