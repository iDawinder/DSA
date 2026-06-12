// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
class CountVowels {
    
    public static int checkTheVowels(String vowels,String str){
     
        int count=0;
        
        for(int i=0;i<str.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(str.charAt(i) == vowels.charAt(j)){
                    count++;
                    
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Start small. Ship something.");
        
        String vowels= "aeiou";
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        
        int result=checkTheVowels(vowels,str);
        System.out.println(result);
    }
}