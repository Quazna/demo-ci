package com.lab.devops;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(15, App.add(5, 10));
    }

    @Test
    public void testAddNegative() {
        assertEquals(-5, App.add(5, -10));
    }

    @Test
    public void testPath() {
        String folder = "data";
        String file = "test.txt";
        // Test này sẽ PASS trên Windows nhưng FAIL trên Ubuntu/macOS
        assertEquals("data\\test.txt", App.getPath(folder, file));
    }

}
