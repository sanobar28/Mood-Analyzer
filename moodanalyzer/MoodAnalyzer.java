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

	public MoodAnalyzer() {
		
	}

	public String analyseMood(String message) {
		this.message = message;
		return analyseMood();
	}

	public String analyseMood() {

		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
