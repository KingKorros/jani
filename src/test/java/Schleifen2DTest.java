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

    @Test
    void testHollowSquare() {
        // Für Größe 4: Rand voll, Mitte leer
        String expected = "****\n*  *\n*  *\n****";
        assertEquals(expected, generator.generateHollowSquare(4));
    }

    @Test
    void testInvertedTriangle() {
        String expected = "***\n**\n*";
        assertEquals(expected, generator.generateInvertedTriangle(3));
    }

    @Test
    void testMultiplicationTable() {
        String expected = "1 2 3\n2 4 6\n3 6 9";
        assertEquals(expected, generator.generateMultiplicationTable(3));
    }
}