public class getIthBit {
    public static int getBit(int num, int n) {
        int BitMask = 1 << n;
        if ((num & BitMask) == 0) {
            return 0;
            // System.out.println(" the bit at the" + " " + n + " " + "position is equal to 0");
        } else {
            return 1;
            // System.out.println(" the bit at the" + " " + n + " " + "position is equal to 1");
        }
    }
    public static void main(String[] args) {
       int result= getBit(10, 3);
       System.out.println("The value of the bit is : " + result);
    }
}

/*

10 = 1010

the indices start from backword 

1 0 1 0 
3 2 1 0 

check the value of the bit at i 3 


we take 1 and left shift it with the 3 
1<<3
0001
becames 
1000

then we & between them 

1010
1000
_____
1000 

now check 

1000 == 0000

no so the bit must be the 1 at the given index







*/