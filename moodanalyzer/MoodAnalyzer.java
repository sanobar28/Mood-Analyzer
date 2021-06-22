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
	 * Refactor- Created parameterized constructor which takes string as argument
	 * 
	 * @param message
	 */
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	/*
	 * UC-1 Method to analyze mood which takes string argument
	 */
	public String analyseMood(String message) throws MoodAnalysisException {
		this.message = message;
		return analyseMood();
	}

	/**
	 * This method throws exception Custom exception message when 
	 * value is empty
	 * @return
	 * @throws MoodAnalysisException
	 */
	public String analyseMood() throws MoodAnalysisException {

		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_EMPTY,
						"Please enter Proper Mood");
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.exceptionType.ENTERED_NULL, e);
		}
	}
}
