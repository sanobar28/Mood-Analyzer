package moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	/**
	 * Test case for sad mood
	 * 
	 */
	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood();
		try {
			moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // passed message to constructor
		
		Assert.assertEquals("SAD", mood);
	}

	/**
	 * Test case for happy mood
	 * 
	 */
	@Test
	public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood();
		try {
			moodAnalyzer = new MoodAnalyzer("I am in any Mood");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	/**
	 * UC-2 Handles Null value Exception
	 */
	@Test
	public void givenNullMood() {
		MoodAnalyzer moodAnalyzer;
		String mood;
		try {
			moodAnalyzer = new MoodAnalyzer(null);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
