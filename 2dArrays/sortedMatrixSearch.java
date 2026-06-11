
public class sortedMatrixSearch {

    public static void searchKeyFnc(int[][] sortedArray, int key) {

        int rowNumber = 0;
        int col = sortedArray[0].length - 1;

        while (rowNumber < sortedArray.length && col >= 0) {

            if (key == sortedArray[rowNumber][col]) {
                System.out.print("Given target" + " " + sortedArray[rowNumber][col]);
                System.out.println(" is on " + rowNumber + " " + col + " " + "index");
                return;
            } else if (key < sortedArray[rowNumber][col]) {
                col--;
                // sortedArray[rowNumber][col - 1];
            } else {

                // if (key > sortedArray[rowNumber][col])
                rowNumber++;
                // sortedArray[rowNumber + 1][col];
            }

        }
        System.out.println("Unable to find the target key");

    }

    public static void main(String[] args) {

        int[][] sortedArray = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }

        };

        int key = 60;
        searchKeyFnc(sortedArray, key);
    }

}