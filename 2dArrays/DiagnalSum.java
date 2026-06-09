//O(n²) even case

public class DiagnalSum {
    public static void CalculateDiagnalSum(int[][] matrix) {
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    primarySum += matrix[i][j];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix.length - 1) {
                    secondarySum += matrix[i][j];
                }
            }
        }

        System.out.println(primarySum);
        System.out.println(secondarySum);
        System.out.println(primarySum + secondarySum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        CalculateDiagnalSum(matrix);
    }
}
