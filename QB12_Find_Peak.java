package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class QB12_Find_Peak {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();
        int start = 1;
        int end = n-2;
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;

        if (n == 1) return 0;
        if(arr.get(0)>=arr.get(1)){
            return 0;
        }
        if(arr.get(n-1)>=arr.get(n-2)){
            return n-1;
        }

        while(start<=end){



            int mid = start +(end- start)/2;

            if(arr.get(mid-1)<arr.get(mid) && arr.get(mid+1)<arr.get(mid)){
                return mid;
            }

            if(arr.get(mid-1)<arr.get(mid)){
                a = mid;
                start = mid + 1;
            }
            else{
                b = mid;
                end = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(findPeakElement(arr));
    }

}
