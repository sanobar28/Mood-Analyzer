package moodanalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	
	MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
	
	 /**
	  * Test case for sad mood 
	  * 
	  */
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
  
        String mood = moodAnalyzer.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }

    /**
     * Test case for happy mood
     * 
     */
    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {

        String mood = moodAnalyzer.analyseMood("I am in any Mood");
        Assert.assertEquals("HAPPY", mood);
    }

}
