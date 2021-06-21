package moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	
	/**
	 * Test case for sad mood
	 * 
	 */
	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood"); //passed message to constructor
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	/**
	 * Test case for happy mood
	 * 
	 */
	@Test
	public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood"); //passed message to constructor
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}
