public class recursionBasics{
    public static void performRecursion(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        performRecursion(n-1);
    }
    public static void main(String[] args) {
        
        performRecursion(5);
    }
}