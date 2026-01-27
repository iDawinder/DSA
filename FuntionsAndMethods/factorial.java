
/*this is the code to find the binomial factorial which is done by me wihtout the help of AI 
later when is  asked AI that is it the final form to calculate the binomial factorial 
it say the logic is correct but it cause the redundancy so at the end i am also mentioning the 
code that is given by AI*/



public class factorial {
    public static int facto(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;

        }
        return fact;
    }

      public static int facto2(int r) {
        int fact = 1;
        for (int i = r; i >= 1; i--) {
            fact = fact * i;

        }
        return fact;
    }

     public static int facto3(int diff) {
        int fact = 1;
        for (int i = diff; i >= 1; i--) {
            fact = fact * i;

        }
        return fact;
    }

    public static void main(String[] args) {
        // int fact=1;
        // for(int i=5;i>=1;i--){
        // fact= fact * i;

        // }
        // System.out.print(fact);
        int n = 10;
        int r=5;
        int diff=n-r;
        int result3=facto3(diff);
        int result = facto(n);
        int result2=facto2(r);
        int cbr=result/(result2*result3);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(cbr);

        // System.out.println(diff);
    }
}


/*
AI's code


public class Factorial {
    static int fact(int n) {
        int f = 1;
        for (int i = n; i >= 1; i--) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 10, r = 5;
        int nCr = fact(n) / (fact(r) * fact(n - r));
        System.out.println(nCr);
    }
}

*/