public class OptDiagnalSum {

    public static void calculateDiagnalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            // primary diagonal -> i == j means same row same col
            // so we just do matrix[i][i]
            sum += matrix[i][i];

            // secondary diagonal condition is i + j = n - 1
            // means row index + col index = last index
            // so if i + j = n - 1 then j = n - 1 - i
            // that's why we use matrix[i][n - i - 1]

            if (i != n - 1 - i) {
                // this check is for middle element in odd matrix
                // because middle element comes in both diagonal so we skip duplicate
                sum += matrix[i][n - i - 1];
            }
        }

        System.out.println("Total diagonal sum is = " + sum);
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        calculateDiagnalSum(matrix);
    }
}