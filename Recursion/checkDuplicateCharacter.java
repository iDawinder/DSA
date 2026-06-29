import java.lang.StringBuilder;

class checkDuplicateCharacter {
    public static void checkDuplicateCharacter(String str,int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        
        char CurrChar =  str.charAt(idx);
        
        if(map[CurrChar - 'a']  == true){
            checkDuplicateCharacter( str,idx +1,  newStr, map);
        }else{
            map[CurrChar -'a'] = true;
            checkDuplicateCharacter( str, idx +1,  newStr.append(CurrChar), map);
        }
    }
    public static void main(String[] args) {
        String str="mmonneyyyyy";
        StringBuilder newStr=new StringBuilder();
    
        
        checkDuplicateCharacter(str,0,newStr,new boolean[26]);
    }
}