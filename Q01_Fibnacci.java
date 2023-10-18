package Extra;

import java.util.ArrayList;

public class Q01_Fibnacci {



//    static void fibonacci(int n){
//        // fibo of n = (n-1) + (n-2)
//        int fib[] = new int[2];
//        fib[0]=0;
//        fib[1]=1;
//
//        for(int i=2;i<=n;i++){
//            fib[i%2]= fib[1]+ fib[0];
//        }
//        System.out.println(fib[n%2]);
//    }

    public static int fib(int n) {

        if(n==0|| n==1) {
            return n;

        }


        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;

        return fn;


    }

    public static void main(String[] args) {

        System.out.println(fib(7));
    }
}
