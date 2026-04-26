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
        // Trên Windows: getPath trả về "data\test.txt" -> PASS
        // Trên Linux/Mac: getPath trả về "data/test.txt" -> FAIL (vì so sánh với "data\test.txt")
        assertEquals("data\\test.txt", App.getPath(folder, file));
    }
}
