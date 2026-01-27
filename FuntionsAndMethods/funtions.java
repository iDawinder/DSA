
import java.util.*;

public class funtions{

    public static int sumOfTowNumbers(int a,int b){  //parameters  fromal parameters
        return  a + b;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= sc.nextInt();
         System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.print( "The sum of two numbers is :- "  + sumOfTowNumbers(a, b));//arguments  actual parametres
        sc.close();
    }
}