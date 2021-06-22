/**
 * This class extends exception with customized 
 * exception type in enum
 */

package moodanalyzer;

public class MoodAnalysisException extends Exception {

	public exceptionType type;

	public MoodAnalysisException(exceptionType type, String message) {
		super(message);
		this.type = type;
	}

	public MoodAnalysisException(exceptionType type, Throwable cause) {
		super(cause);
		this.type = type;
	}

	public MoodAnalysisException(exceptionType type, String messgae, Throwable cause) {
		super(messgae);
		new MoodAnalysisException(type, cause);
	}

	/**
	 * UC-3 Created exception type enum for type and cause 
	 * for exception occurred
	 * 
	 */
	public enum exceptionType {

		ENTERED_EMPTY, ENTERED_NULL
	}
}
