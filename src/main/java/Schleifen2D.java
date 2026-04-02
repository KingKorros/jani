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

    /**
     * Erzeugt ein hohles Quadrat. Nur der Rand besteht aus Sternen.
     * n = 4:
     * ****
     * * *
     * * *
     * ****
     */
    public String generateHollowSquare(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Bedingung: Wenn wir am Rand sind (erste/letzte Zeile ODER Spalte)
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            if (i < size - 1) sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Erzeugt ein umgekehrtes Dreieck.
     * n = 3:
     * ***
     * **
     * *
     */
    public String generateInvertedTriangle(int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            if (i > 1) sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Erzeugt eine kleine Multiplikationstabelle (Einmaleins).
     * n = 3:
     * 1 2 3
     * 2 4 6
     * 3 6 9
     */
    public String generateMultiplicationTable(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                sb.append(i * j);
                if (j < size) sb.append(" ");
            }
            if (i < size) sb.append("\n");
        }
        return sb.toString();
    }

}
