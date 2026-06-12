/*
before starting code let us discuss why we put -1 with the lenght in the while loop 
we have total lenght of the string is 10 
means it going for the 0 to 9 according to the loop 
the important thing is that when we have 0 to 9 in the loop 
the str(10) cannot give any value to us as again we have 0 to 9 indices
so when we write -1 it mean the loop gonna run for the 0 to 8 as 9<9 is false
why this is important 
notice we have also write the i+1 in the second condition 
if we go for the i<str.length() it means 0 to 9 and after reaching 9 the second condtion will perform 
9+1 and it have str.charAt(i+1)=10 which is going to stop the loop immidiately so that's why the -1 is important 

*/

class stringCompressing {
    public static String compressString(String str){
        String cStr="";
        for(int i=0;i<str.length();i++){
        Integer count=1;
            
            while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            cStr+=str.charAt(i);
            if(count > 1){
                cStr+=count;
            }
        }
        return cStr.toString();
    }
    
    public static void main(String[] args) {
        
        String str="aaabbcccdd";
        
       String result= compressString(str);
       System.out.println(result);
    }
}