
import java.util.Scanner;

public class LastOccurance {
    public static int checkLastOccurance(int[] arr,int i, int key){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return checkLastOccurance(arr, i-1, key);
    }
    public static void main(String[] args) {
        int[] arr ={8,3,6,9,5,10,2,5,3};

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter element");
        int key=sc.nextInt();
       int result= checkLastOccurance(arr,arr.length-1,key);
       System.out.println(result);
    }
}
