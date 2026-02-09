public class maxSubArraySum {
    public static void maxsubarray(int numbers[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {

                    curr += numbers[k];
                }
                System.out.println(curr);
                if (curr > max) {
                    max = curr;
                }

            }
        }
        System.out.println("the maximum is"+max);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 10 };
        maxsubarray(numbers);
    }
}
