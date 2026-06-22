public class PowerOfN {

    public static int checkPowerOfX(int x,int n){
        if(n==0){
            return 1;
        }

        return x * checkPowerOfX(x, n-1);
    }
    public static void main(String[] args) {
        
        int X=2;
        int N=4;
       int result= checkPowerOfX(X,N);
       System.out.println(result);
    }
}



