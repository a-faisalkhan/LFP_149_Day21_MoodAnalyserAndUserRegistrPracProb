package com.bridgelabz.moodanalyzercustomexception;

import com.bridgelabz.moodanalyzerexceptions.MoodAnalyzerExceptions;

public class MoodAnalyzerCustomException {

	public String message;
	String returnMessage;

	public MoodAnalyzerCustomException(String message) // Parameterized Constructor
	{
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyzerExceptions {
		try {
			if (message.length() == 0) {
				throw new MoodAnalyzerExceptions(MoodAnalyzerExceptions.ExceptionType.EMPTY,
						"Please enter some thing!");
			}
			returnMessage = (message.contains("sad")) ? "SAD" : "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalyzerExceptions(MoodAnalyzerExceptions.ExceptionType.NULL, "Please enter some thing!");
		}
		return returnMessage;
	}

	public static void main(String[] args) {

		try {
			//MoodAnalyzerCustomException moodAnalyzer = new MoodAnalyzerCustomException(""); //ExceptionType is EMPTY
			MoodAnalyzerCustomException moodAnalyzer = new MoodAnalyzerCustomException(null); //ExceptionType is NULL
			String mood = moodAnalyzer.analyseMood(); // Here using Default Constructor
			System.out.println("My Mood is " + mood);
		} catch (MoodAnalyzerExceptions e) {
			System.out.println(e.type);
		}
	}
}
