package com.bridgalabz.userregiexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Password : ");

		String namePattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";
		Pattern regex = Pattern.compile(namePattern);
		String inputStr = sc.nextLine();
		Matcher contactNumMatcher = regex.matcher(inputStr);
		try {

			if (contactNumMatcher.matches()) {
				System.out.println(inputStr + " is valid name.");
			} else {
				System.out.println(inputStr + " is invalid name.Kindly input the right one.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}
}
