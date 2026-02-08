
/*start and end for better understanding  , write i and j directly 
dry run the code with the  commented line which is wrong but to 
understand the code better ,change i to 1 in second loop and then dry 
run it change k to 0 then dry it  Try different varient from correct one 
and dry run it match your answer with the Ai */
public class subArrays {
    public static void GenerateSubArray(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<= end;k++){
                    // System.out.print(numbers[start]  +" "+ numbers[end]);
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,5,10};
        GenerateSubArray(numbers);
    }
}
