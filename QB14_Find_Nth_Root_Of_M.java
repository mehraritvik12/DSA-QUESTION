package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class QB14_Find_Nth_Root_Of_M {


    public static int NthRoot(int n, int m) {
        int start =0;
        int end = m;

        while(start<=end){
            int mid = start + (end- start)/2;


            if(Math.pow(mid, n)==m){
                return mid;

            }



            if(Math.pow(mid, n)<=m){

               start = mid +1;
            }
            else {
                end = mid - 1;
            }


        }
        return -1;


    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(NthRoot(3,64));
    }
}
