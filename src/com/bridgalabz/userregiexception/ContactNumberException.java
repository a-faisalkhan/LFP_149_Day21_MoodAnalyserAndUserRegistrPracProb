package com.bridgalabz.userregiexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactNumberException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the contact number : ");
		try {
			String namePattern = "^[0-9]{2}\\s{1}[0-9]{10}$$";
			Pattern regex = Pattern.compile(namePattern);
			String inputStr = sc.nextLine();
			Matcher contactNumMatcher = regex.matcher(inputStr);
			sc.close();

			if (contactNumMatcher.matches()) {
				System.out.println(inputStr + " is valid name.");
			} else {
				System.out.println(inputStr + " is invalid name.Kindly input the right name");
			}
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}
}
