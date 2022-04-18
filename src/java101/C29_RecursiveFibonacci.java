package java101;

public class C29_RecursiveFibonacci {
    public static void main(String[] args) {
        /*1 1 2 3 5 8 13 21
        Sum of the number and the previous number must equal next
        number
        */

        System.out.println(fibonacci(8));


    }

    private static int fibonacci(int i) {

        if(i==1||i==2) return 1;

        return fibonacci(i-1)+fibonacci(i-2);



    }
}
