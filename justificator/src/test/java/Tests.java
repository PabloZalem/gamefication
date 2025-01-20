import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Tests {
    @Test
    public void equalWord() {
        assertEquals("word", formatedLine("word"));
    }

    @Test
    public void spaceInitical(){
        assertEquals("word", formatedLine("     word"));
    }

    @Test
    public void spaceAfterWord() {
        assertEquals("word", formatedLine("word      "));
    }

    @Test
    public void spaceBetweenWord() {
        assertEquals("word", formatedLine("   word     "));
    }

    @Test
    public void throwAnException() {
        assertThrows(TreatingError.class, () -> formatedLine(null));
    }

    private String formatedLine(String word) {
        if (word == null) throw new TreatingError();
        return word.trim().replaceAll("\\s+", " ");
    }

    public class TreatingError extends RuntimeException{
    }
}
