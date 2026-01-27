public class foverloading {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a ,int b ,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(4,4));
        System.out.println(sum(4,4,5));
    }
}


/*
Funtion oveloading= Multiple function with the same name but different parameters
*/