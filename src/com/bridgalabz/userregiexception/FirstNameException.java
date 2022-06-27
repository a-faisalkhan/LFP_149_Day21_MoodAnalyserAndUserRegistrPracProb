package com.bridgalabz.userregiexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameException {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		try {
			String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
			Pattern regex = Pattern.compile(namePattern);
			String inputStr = sc.nextLine();

			Matcher firstNameMatcher = regex.matcher(inputStr);
			sc.close();

			if (firstNameMatcher.matches()) {
				System.out.println(inputStr + " is valid name.");
			} else {
				System.out.println(inputStr + " is invalid name.Kindly input the right one.");
			}
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}
}
