
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

// break if we write the break in the loop it only break the loop and and print
// the
// System.out.println("Unable to find the target key"); statement even when we
// found
// the element so we write the return which mean return from whole fuction
// itself and
// now when the key is found we got only whats written in the first if condtion
// otherwise
// System.out.println("Unable to find the target key");
// Another point
// if the key is let's say 60 which mean it is greter so we have to move down
// but the maximum in
// array is 50 so the condition in while loop prevent to go further from the 50
// and stop the loop and
// help to print System.out.println("Unable to find the target key");

// similar if the key is 5 the columns conditoin prevent the loop to go out of
// the boundries exceeding to
// the left of 10
