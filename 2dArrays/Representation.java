
import java.util.Scanner;

//Representing the 2d array and founding our key and founding larfest in the 2d array

public class Representation {
    public static boolean FindKey(int matrix[][],int key){
        int largest=matrix[0][0];
        boolean found=false;
         for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j] > largest){
                largest=matrix[i][j];
            }

          if(matrix[i][j] == key){
            System.out.println("Key found at the index"  +  "(" + i + " " + j + ")");
          }
        }
       }
       System.out.println(largest);
       return found;
    }


    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
       int n=matrix.length;
       int m=matrix[0].length;
        Scanner sc= new Scanner(System.in);
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
       }


         for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           System.out.print(matrix[i][j]);
        }
        System.out.println();
       }

       FindKey(matrix,5);

    }
}
