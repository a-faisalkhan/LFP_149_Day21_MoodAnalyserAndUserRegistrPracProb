package com.bridgelabz.moodanalyzerconstructor;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerWithConstructorTest {

	@Test
	public void respondAsSadMoodWithConstructor() { // Repeated TC1.1
		MoodAnalyzerWithConstructor moodAnalyzer = new MoodAnalyzerWithConstructor();
		String result = moodAnalyzer.analyseMood("I am in sad Mood"); // Here using Parameterized Constructor 
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("SAD", result);
	}
	
	@Test
	public void respondAsHappyMoodWithConstructor() { // Repeated TC1.2
		MoodAnalyzerWithConstructor moodAnalyzer = new MoodAnalyzerWithConstructor();
		String result = moodAnalyzer.analyseMood("I am in happy Mood"); // Here using Parameterized Constructor 
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("HAPPY", result);
	}
}
