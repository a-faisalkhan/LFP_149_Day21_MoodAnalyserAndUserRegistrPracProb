package com.bridgelabz.moodanalyzerconstructor;

//Refactor Case
public class MoodAnalyzerWithConstructor {

	public String message;
	String returnMessage;

	public MoodAnalyzerWithConstructor() {
	} // Default Constructor

	public MoodAnalyzerWithConstructor(String message) // Parameterized Constructor
	{
		this.message = message;
	}

	public String analyseMood(String message) {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() {
		return returnMessage = (message.contains("sad")) ? "SAD" : "HAPPY";
	}
	
	public static void main(String[] args) {
		MoodAnalyzerWithConstructor moodAnalyzer = new MoodAnalyzerWithConstructor("I am in sad mood");
		String sadMood = moodAnalyzer.analyseMood(); // Here using Default Constructor
		System.out.println("My Mood is " + sadMood);
		System.out.println("<----------------OR------------------->");
		String happyMood = moodAnalyzer.analyseMood("I am in happy mood"); // Here using Parameterized Constructor
		System.out.println("My Mood is " + happyMood);
	}

}
