package Searching;
import java.util.*;
public class QB13_sq_root {


    public static int sqrtN(long N) {
        long start = 0;
        long end = N ;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (mid * mid <= N) {
               start = mid +1;

            }
            else{
                end = mid -1;
            }

        }
        return (int) end ;

    }

    public static void main(String[] args) {
        System.out.println(sqrtN(15));
    }


}