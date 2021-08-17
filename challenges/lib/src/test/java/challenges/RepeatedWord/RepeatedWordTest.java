package challenges.RepeatedWord;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatedWordTest {

    @Test
    public void inputStringEdgeCaseTest() {
        String expected = "no repeated words";
        assertEquals(expected, RepeatedWord.findRepeated(""));
    }

    @Test // i have comma in next to a word
    public void inputStringExpectFailureTest() {
        String failureCase = "Once upon a, time there was a brave princess who...";
        String expected = "a";
        assertEquals(expected,RepeatedWord.findRepeated(failureCase));
    }

    @Test
    public void inputStringHappyCaseTest() {
        String happyCase = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String expected = "it";
        assertEquals(expected, RepeatedWord.findRepeated(happyCase));
    }
}