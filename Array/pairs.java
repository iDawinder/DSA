//possible combination of the given array in the form of two pairs 

public class pairs {
    public static void makePairs(int numbers[]){
   for(int i=0;i<numbers.length;i++){
    int curr=numbers[i];
    for(int j=i+1;j<numbers.length;j++){
        System.out.print("(" + curr + "," + numbers[j] + ")");
    }
    System.out.println();
   }


    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8};
        makePairs(numbers);
    }
}

/* output
(2,4)(2,6)(2,8)
(4,6)(4,8)
(6,8) */