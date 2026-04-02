public class Schleifen2D {

    /**
     * Erzeugt ein Quadrat aus Sternen.
     * n = 3:
     * ***
     * ***
     * ***
     */
    public String generateSquare(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append("*");
            }
            if (i < size - 1) sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Erzeugt ein rechtwinkliges Dreieck.
     * n = 3:
     * *
     * **
     * ***
     */
    public String generateTriangle(int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            if (i < height) sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Erzeugt ein Schachbrettmuster.
     * n = 3:
     * # #
     * #
     * # #
     */
    public String generateChessboard(int size) {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((row + col) % 2 == 0) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            if (row < size - 1) sb.append("\n");
        }
        return sb.toString();
    }

}
