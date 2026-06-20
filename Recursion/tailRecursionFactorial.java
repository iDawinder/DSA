class tailRecursionFactorial {

    public static int factorial(int currentProduct, int currentNumber) {

        if (currentNumber == 1) {
            return currentProduct;
        }

        int nextNumber = currentNumber - 1;
        int updatedProduct = currentProduct * nextNumber;

        return factorial(updatedProduct, nextNumber);
    }

    public static void main(String[] args) {

        int result = factorial(5, 5);
        System.out.println(result);
    }
}

/*
current code's logic completely written by me while solving the factorial of number n
after that i dry run it on the notebook and sense that it will give the desired value 
however after uploading this code on the AI it tells it's tail recursion and its completely
fine and give the desired output
i don't even know about tail recursion 
i made so many test case just to build this logic on the notebook and finaaly succeed
on my own 

*/