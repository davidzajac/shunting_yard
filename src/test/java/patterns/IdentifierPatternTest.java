package patterns;

import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifierPatternTest {

    @Test
    public void rule1() {
        // may not be null or empty
        assertEquals("may not be null or empty", -1, IdentifierPattern.test(""));
    }

    @Test
    public void rule2_1() {
        // first character must be a letter
        assertEquals("_bad", 0, IdentifierPattern.test("_bad"));
    }

    @Test
    public void rule2_2() {
        // first character must be a letter
        assertEquals("good", 4, IdentifierPattern.test("good"));
    }

    @Test
    public void rule2_3() {
        // first character must be a letter
        assertEquals("_good, index 1", 4, IdentifierPattern.test("_good", 1));
    }

    @Test
    public void rule3_1() {
        //must contain only letters, digits, or underscores
        assertEquals("_good$, index 1", 4, IdentifierPattern.test("_good$", 1));
    }

    @Test
    public void rule3_2() {
        //must contain only letters, digits, or underscores
        assertEquals("good_123",8, IdentifierPattern.test("good_123"));
    }

    @Test
    public void rule4() {
        // may not contain two or more consecutive underscores
        assertEquals("_good__123, index 1", 5, IdentifierPattern.test("_good__123", 1));
    }
}