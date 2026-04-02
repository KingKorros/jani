import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Schleifen2DTest {
    private final Schleifen2D generator = new Schleifen2D();

    @Test
    void testGenerateSquare() {
        String expected = "***\n***\n***";
        assertEquals(expected, generator.generateSquare(3));
    }

    @Test
    void testGenerateTriangle() {
        String expected = "*\n**\n***";
        assertEquals(expected, generator.generateTriangle(3));
    }

    @Test
    void testGenerateChessboard() {
        // Bei (0,0) steht #, bei (0,1) steht Leerzeichen, etc.
        String expected = "# #\n # \n# #";
        assertEquals(expected, generator.generateChessboard(3));
    }
}