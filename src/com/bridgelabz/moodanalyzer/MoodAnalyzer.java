package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

	public String moodAnalysis(String msg) {

		if (msg.contains("sad")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}

	public static void main(String[] args) {
		System.out.println("********Welcom To Mood Analyzer Problems***********");
		
		MoodAnalyzer moodAnalysis = new MoodAnalyzer();
		String sadMood = moodAnalysis.moodAnalysis("I am in sad mood");
		System.out.println("My Mood is: " + sadMood);
		System.out.println("<----------------OR------------------->");
		String happyMood = moodAnalysis.moodAnalysis("I am in happy mood");
		System.out.println("My Mood is: " + happyMood);

	}

}
