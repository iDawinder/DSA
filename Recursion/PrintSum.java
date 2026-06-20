public class PrintSum {
    public static int CalculateSum(int n){
        if(n==1){
            return 1;
        }
        int result =n + CalculateSum(n-1);
        return result;

    }
    public static void main(String[] args) {
        // CalculateSum(5);
        System.out.println( CalculateSum(5));
    }
}
