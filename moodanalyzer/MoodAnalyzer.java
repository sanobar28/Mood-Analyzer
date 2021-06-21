/**
 * 
 * @author Sanobar Mujawar
 * @since 21.06.21
 * 
 * Purpose: To analyze mood using custom exceptions and Junit Testing
 * 
 */

package moodanalyzer;

public class MoodAnalyzer {

	private String message;

	/**
	 * Refactor- Created parameterized constructor which 
	 * takes string as argument
	 * @param message
	 */
	public MoodAnalyzer(String message) {
		 this.message = message;
	}

	/*
	 * UC-1 Method to analyze mood which takes string argument
	 */
	public String analyseMood(String message) {
		this.message = message;
		return analyseMood();
	}

	//return Happy or Sad
	public String analyseMood() {

		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
