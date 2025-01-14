import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testSingleWord() {
        assertEquals("WORD", formatLine("WORD"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("WORD", formatLine("  WORD"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("WORD", formatLine("WORD     "));
    }

    @Test
    public void testMultipleSpacesBetweenWords() {
        assertEquals("HELLO WORLD", formatLine("HELLO     WORLD"));
    }

    private static String formatLine(String word) {
        return word.trim().replaceAll("\\s+", " ");
    }
}
