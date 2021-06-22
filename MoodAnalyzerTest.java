package moodanalyzer;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import moodanalyzer.MoodAnalysisException.exceptionType;

public class MoodAnalyzerTest {

	/**
	 * Test case for sad mood
	 * 
	 */
	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() throws MoodAnalysisException {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	/**
	 * Test case for happy mood
	 * 
	 */
	@Test
	public void givenMessage_WhenNotSad_ShouldReturn_Happy() throws MoodAnalysisException {

		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	/**
	 * UC-2 Handles Null value Exception
	 * 
	 * UC-3 Given Null mood will gives mood equals Happy
	 */
	@Test
	public void givenNullMood_ShouldReturn_Happy()  {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String mood;
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalysisException.class);
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
			assertEquals(exceptionType.ENTERED_NULL, e.type);
		}
	}

	/*
	 * This Test Case Will Check For Null Pointer Exception for empty values
	 */
	@Test
	public void givenEmptyMood_ShouldThrow_Exception() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
		try {
			moodAnalyzer.analyseMood(" ");
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(exceptionType.ENTERED_EMPTY, e.type);
		}
	}

}
