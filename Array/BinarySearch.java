public class BinarySearch {

    public static int SearchKey(int numbers[],int target){
        int start=0;int end =numbers.length -1;

        while(start<=end){
            int mid= (start + end)/2;
            if(numbers[mid] == target){
                return mid;
            }if(numbers[mid]< target){
                start=mid-1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int numbers[]={1,3,5,7,9,11,13,15};
       int target=9;
       int result= SearchKey(numbers, target);
       System.out.print("The target present at the index :" +result);
      
    }
}
