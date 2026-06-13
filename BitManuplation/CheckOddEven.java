//checking odd even through the & operator

class CheckOddEven{
    public static void check(int num){
        int lBit=1;
        if((num & lBit) == 0){
            System.out.println("The given number is the Even");
        }else{
            System.out.println("The given number is the Odd");
        }


    }
    public static void main(String[] args) {
        check(5);
        check(6);
        check(8);
        check(9);
    }
}

/*
& (think it as AND gate in the digtal elctronics which multiply the bits)

A   B     X
0   0     0
0   1     0
1   0     0
1   1     1

here obverse that whenever 0 comes the number becomes 0 


Decimal	3-bit Binary
0	    000
1	    001
2	    010
3	    011
4	    100
5	    101
6	    110
7	    111

notice how number end with the 0 is always the even
and the number ending with the 1 is odd 


n & 1 will be
0 for even numbers
1 for odd numbers

for example 

5=101
  001      1 here is the bit taken by us 
_______   
  001

  001 is 1

  1!=0 

  so it give us odd number 

  let take the case of 6 

  6=110
    001   1 here is the bit taken by us 
   _____
    000

    0==0

    so it give us the even number 

    that's how codes whole logic working
*/