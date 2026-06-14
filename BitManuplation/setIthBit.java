public class setIthBit {
    public static int setBit(int number,int n){
        int BitMask=1<<n;
       
        return number | BitMask;
    }
    public static void main(String[] args) {
        
      int result=  setBit(10,2);
      System.out.println(result);
    }
}


/*
10= 1010
    3210

at index to the number is 0 if we | it with the 1 the outcome will 1 
the value dont matter the outcome with the OR always come 1 when we 1 

so take 1 0001 
we left shit the bit 
1<<n
it became 0100

then 

1010
0100
____
1110 

which is 14

so we random bit to 1
*/
