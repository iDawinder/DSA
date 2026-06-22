
import java.util.Scanner;

public class FirstOccurence{
    public static int checkFirstOccurence(int[] arr ,int i,int key){
         if (i == arr.length) {
        return -1;
    }
        if(arr[i] == key){
            return  i;
        }
        return checkFirstOccurence(arr,i+1,key);
    }
    public static void main(String[] args) {
        int[] arr ={8,3,6,9,5,10,2,5,3};
        Scanner sc =new Scanner(System.in);
        System.out.println("enter key you want to find");
       int key=sc.nextInt();
        int result=checkFirstOccurence(arr,0,key);
        System.out.println(result);
        sc.close();
    }
}