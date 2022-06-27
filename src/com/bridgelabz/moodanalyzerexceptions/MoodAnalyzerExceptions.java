package com.bridgelabz.moodanalyzerexceptions;

// Refactor Case
public class MoodAnalyzerExceptions extends Exception {

	public ExceptionType type;

	public enum ExceptionType {
		NULL, EMPTY, INVALID;
	}

	public MoodAnalyzerExceptions(ExceptionType type, String msg) {
		super(msg);
		this.type = type;
	}
}
