package com.bridgelabz.moodanalyzerexceptions;

//UC2 - Handle Exceptions
public class MoodAnalyzerWithException {

	public String message;
	String returnMessage;

	public MoodAnalyzerWithException() {
	} // Default Constructor

	public MoodAnalyzerWithException(String message) // Parameterized Constructor
	{
		this.message = message;
	}

	public String analyseMood(String message) throws MoodAnalyzerExceptions {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() throws MoodAnalyzerExceptions {
		try {
			if (message.length() == 0) {
				throw new MoodAnalyzerExceptions(MoodAnalyzerExceptions.ExceptionType.EMPTY,
						"Please enter some thing!");
			}
			returnMessage = (message.contains("sad")) ? "SAD" : "HAPPY";
		} catch (NullPointerException e) {
			return "Invalid";
		}
		return returnMessage;
	}

	public static void main(String[] args) throws MoodAnalyzerExceptions {
		MoodAnalyzerWithException moodAnalyzer = new MoodAnalyzerWithException("Iam in sad mood");
		String sadMood = moodAnalyzer.analyseMood(); // Here using Default Constructor
		System.out.println("My Mood is " + sadMood);
		System.out.println("<----------------OR------------------->");
		String happyMood = moodAnalyzer.analyseMood("Iam in happy mood"); // Here using Parameterized Constructor
		System.out.println("My Mood is " + happyMood);
	}

}
