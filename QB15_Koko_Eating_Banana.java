package Searching;

import java.rmi.dgc.VMID;
import java.util.ArrayList;
import java.util.Arrays;

public class QB15_Koko_Eating_Banana {



//    public static int findMax(int[] v) {
//        int maxi = Integer.MIN_VALUE;;
//        int n = v.length;
//        //find the maximum:
//        for (int i = 0; i < n; i++) {
//            maxi = Math.max(maxi, v[i]);
//        }
//        return maxi;
//    }
//
//
//    public static int calculateTotalHours(int[] v, int hourly) {
//        int totalH = 0;
//        int n = v.length;
//        //find total hours:
//        for (int i = 0; i < n; i++) {
//            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
//        }
//        return totalH;
//    }
//    public static int minimumRateToEatBananas(int[] v, int h) {
//        int low = 1, high = findMax(v);
//
//        //apply binary search:
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            int totalH = calculateTotalHours(v, mid);
//            if (totalH <= h) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return low;
//    }
//
//
//    public static void main(String[] args) {
//        int arr[]= {7,15,1,3};
//        System.out.println(minimumRateToEatBananas(arr,7));
//    }


    public static int minimumRateToEatBananas(int []v, int h) {

        int start =1;
        int end = max(v);

        while(start<=end){
            int mid = start +(end-start)/2;



            if (ReturTime(v,mid)<=h){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }


        return start;
    }

    static int max (int v[]){
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<v.length;i++){
            maxi = Math.max(maxi,v[i]);
        }


        return maxi;

    }

    static  int ReturTime(int v[],int mid){
        int TotalH = 0;

        for(int i =0;i<v.length;i++){
            TotalH += Math.ceil((double)(v[i]) /(double) (mid) );
        }


        return TotalH;
    }

    public static void main(String[] args) {
        int arr[]= {7,15,1,3};
        System.out.println(minimumRateToEatBananas(arr,7));
    }
}
