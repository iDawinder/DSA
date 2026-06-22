public class FirstOccurence{
    public static int checkFirstOccurence(int[] arr ,int i){
         if (i == arr.length) {
        return -1;
    }
        if(arr[i] == 5){
            return  i;
        }
        return checkFirstOccurence(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr ={8,3,6,9,5,10,2,5,3};
        int result=checkFirstOccurence(arr,0);
        System.out.println(result);
    }
}