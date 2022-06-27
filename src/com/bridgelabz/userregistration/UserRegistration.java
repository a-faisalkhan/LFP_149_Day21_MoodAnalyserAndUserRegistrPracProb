package com.bridgelabz.userregistration;

public class UserRegistration {
	public boolean checkFirstName(String firstName) {
		return (firstName.matches("[A-Z][a-z]{3,}"));

	}

	public boolean checkLastName(String lastName) {
		return (lastName.matches("[A-Z][a-z]{3,}"));
	}

	public boolean checkEmail(String emailID) {
		return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
	}

	public boolean checkPhoneNumber(String phoneNumber) {
		return (phoneNumber.matches("91\\s[0-9]{10}"));
	}

	public boolean checkPassword1(String password) {
		return (password.matches("^(?=.*[A-Z])(?=.*[a-z]).{8,}$"));
	}

	public boolean checkPassword(String password) {
		return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$"));
	}

	public String moodAnalyzer(String firstName, String lastName, String phoneNumber, String emailID, String password) {
		if (checkFirstName(firstName) == true && checkLastName(lastName) == true && checkEmail(emailID) == true
				&& checkPhoneNumber(phoneNumber) == true && checkPassword(password) == true) {
			return "HAPPY";
		} else {
			return "SAD";
		}

	}
}
