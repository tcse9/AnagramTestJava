package anagram_java.anagram_java;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import anagram_java.anagram_java.AnagramString;

public class AnagramUnitTest {

    @Test
    public void testAnagramSuccess() {
        AnagramString anagramUnit = new AnagramString();

        boolean result = anagramUnit.isAnagram("bleat", "table");

        assertTrue(result);

    }
    
    @Test
    public void testAnagramFail() {
        AnagramString anagramUnit = new AnagramString();

        boolean result = anagramUnit.isAnagram("eat", "tar");

        assertFalse(result);

    }
    
    @Test
    public void testAnagramEmptyString() {
        AnagramString anagramUnit = new AnagramString();

        boolean result = anagramUnit.isAnagram("", null);

        assertFalse(result);

    }
}
