public class linearSearch {

    public static int find(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
           if(numbers[i]==key){
            return i;
           }
        }
        return -1;
    }
 public static void main(String[] args) {
     int numbers[]={10,4,56,67,78,75,32,23,45,20,20};
     int key=10;

     int index=find(numbers, key);

     if(index ==-1){
        System.out.print("The key is not present");

     }else{
        System.out.println("The key is at the index :" + index );
     }
 }   
}
