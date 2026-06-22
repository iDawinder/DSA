public class CheckSortedArray {
    public static boolean check(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return check(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};//true
        // int arr[]={1,2,6,4,5}; fasle

        boolean result=check(arr,0);
        System.out.println(result);
    }
}
/*
if(i == arr.length-1){
            return true;
        }

if this case became true means the checking went to the end and array is sorted last 
call gives true and that true will pass over to the other functions in the stack 
and in the end we get true        

*/