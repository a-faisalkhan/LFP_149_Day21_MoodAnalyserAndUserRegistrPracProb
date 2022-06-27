package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void respondAsSadMood() { // TC1.1
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String result = moodAnalyzer.moodAnalysis("I am in sad Mood");
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("Sad", result);
	}
	
	@Test
	public void respondAsHappyMood() { // TC1.2
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String result = moodAnalyzer.moodAnalysis("I am in happy Mood");
		System.out.println("Iam in " + result + " mood.");
		Assert.assertEquals("Happy", result);
	}
}
