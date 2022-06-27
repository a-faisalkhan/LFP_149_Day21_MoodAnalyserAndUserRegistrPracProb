package com.bridgelabz.userregistrationjunittest;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.userregistration.UserRegistration;

public class UserRegistrationTest extends TestCase {

	@Test
	public void testingFirstName() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFNameValid = userRegistration.checkFirstName("Ajay");
		Assert.assertTrue(isFNameValid);
	}

	@Test
	public void testFirstNameInvalidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFirstNameValid = userRegistration.checkFirstName("ajay");
		Assert.assertFalse(isFirstNameValid);
	}

	@Test
	public void testLastNameValidMustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isLastNameValid = userRegistration.checkLastName("Kumar");
		Assert.assertTrue(isLastNameValid);
	}

	@Test
	public void testLastNameInValidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isLastNameValid = userRegistration.checkLastName("kumar");
		Assert.assertFalse(isLastNameValid);
	}

	@Test
	public void testEmailId_MustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isEmailValid = userRegistration.checkEmail("ajay.ab@gmail.com");
		Assert.assertTrue(isEmailValid);
	}

	@Test
	public void testEmailId_MustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isEmailInvalid = userRegistration.checkEmail("ajay@.com");
		Assert.assertFalse(isEmailInvalid);
	}

	@Test
	public void testPhoneNumber_MustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPhoneNumberValid = userRegistration.checkPhoneNumber("91 9686127142");
		Assert.assertTrue(isPhoneNumberValid);
	}

	@Test
	public void testPhoneNumber_MustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPhoneNumberInValid = userRegistration.checkPhoneNumber("9988665544");
		Assert.assertFalse(isPhoneNumberInValid);
	}

	@Test
	public void testPassword_MustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPasswordValid = userRegistration.checkPassword("Abc@123gjyg");
		Assert.assertTrue(isPasswordValid);
	}

	@Test

	public void testPassword_MustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPasswordInValid = userRegistration.checkPassword("abcdefghi");
		Assert.assertFalse(isPasswordInValid);
	}

	@Test
	public void mood_Analyser_Test_Sad() {
		UserRegistration userRegistration = new UserRegistration();
		String isMoodSad = userRegistration.moodAnalyzer("Santosh", "Kumar", "3355889966", "kumar001@.com", "400083");
		Assert.assertEquals("SAD", isMoodSad);
	}

}
