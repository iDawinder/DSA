

/*In Java, arrays are objects, and when an array is passed to a method, the reference to the array is passed.

This means any changes made to the array elements inside the method will affect the original array.

The check() method increments each element of the marks array by 1.

Since both main() and check() refer to the same array object in memory, the updated values are reflected when printed in main().

This behavior is often referred to as call by reference, though technically Java uses call by value of the reference.

 Changes made to array elements inside a method persist outside the method. */
public class CallByRefrence {
    
    public static void check(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[]={45,56,76};
        check(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }

    }
}