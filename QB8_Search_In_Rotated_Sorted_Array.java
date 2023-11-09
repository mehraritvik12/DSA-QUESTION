package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class QB8_Search_In_Rotated_Sorted_Array {


    public static  int search (ArrayList<Integer> arr, int n , int k) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == k) {
                return mid;
            }

//left sorted
            if (arr.get(mid) >= arr.get(start)) {

                if (arr.get(start) <= k && k <= arr.get(mid)) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (arr.get(end) <= k && k <= arr.get(mid)) {
                    start = mid + 1;

                }
                else{
                    end = mid - 1;
                }

            }
        }
        return -1;


    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,2,1,9,7,5,4));
        System.out.println(search(arr,9,3));
    }

}
