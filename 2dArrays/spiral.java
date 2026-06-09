
public class spiral {

    public static void PrintSpiral(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix.length - 1;
        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol]);
            }

            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(matrix[endRow][i]);
            }

            for (int j = endRow - 1; j >= startRow + 1; j--) {
                System.out.print(matrix[j][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        PrintSpiral(matrix);

    }
}
