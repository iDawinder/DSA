public class LargestInArray {

    public static int findLargest(int numbers[]) {
        int largest = numbers[0];   
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {34, 45, 3, 63, 34, 22, 52, 54, 74};
        int result = findLargest(numbers);
        System.out.print(result);
    }
}

