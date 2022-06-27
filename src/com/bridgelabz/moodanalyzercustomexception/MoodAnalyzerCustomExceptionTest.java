package com.bridgelabz.moodanalyzercustomexception;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.moodanalyzerexceptions.MoodAnalyzerExceptions;

//UC3 - Throws custom exceptions
public class MoodAnalyzerCustomExceptionTest {

	@Test
	public void nullMood_ShouldThrowCustomException() { // TC3.1
		try {
			MoodAnalyzerCustomException moodAnalyzer = new MoodAnalyzerCustomException(null);
			String result = moodAnalyzer.analyseMood();
			System.out.println("Iam in " + result + " mood.");
		} catch (MoodAnalyzerExceptions e) {
			System.out.println(e.type);
			Assert.assertEquals(MoodAnalyzerExceptions.ExceptionType.NULL, e.type);
		}
	}

	@Test
	public void emptyMood_ShouldThrowCustomException() { // TC3.2
		try {
			MoodAnalyzerCustomException moodAnalyzer = new MoodAnalyzerCustomException("");
			String result = moodAnalyzer.analyseMood();
			System.out.println("Iam in " + result + " mood.");
		} catch (MoodAnalyzerExceptions e) {
			System.out.println(e.type);
			Assert.assertEquals(MoodAnalyzerExceptions.ExceptionType.EMPTY, e.type);
		}
	}
}
