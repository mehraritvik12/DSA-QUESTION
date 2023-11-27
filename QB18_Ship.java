package Searching;

import java.util.ArrayList;

public class QB18_Ship {

    public static int leastWeightCapacity(int[] weights, int d) {
        int start = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum = sum + weights[i];
            start = Math.max(start, weights[i]);
        }
        int end = sum;

//        int start = Integer.MIN_VALUE, end = 0;
//        for (int i = 0; i < weights.length; i++) {
//            end += weights[i];
//            start = Math.max(start, weights[i]);
//        }


        while (start <= end) {
        int mid = start +(end-start)/2;


           if(givemin(weights, mid)<=d){
               end=mid-1;

           }
           else {
               start = mid+1;
           }
        }
        return start;

    }

    private static int givemin(int[] arr, int cap) {
        int n = arr.length;
        int sum =0;
        int count=1 ;
        ArrayList<Integer> list= new ArrayList<>();

    for(int i=0;i<n;i++){
        if(sum+arr[i]<=cap){
            sum+=arr[i];
        }
        else{
            list.add(sum);
            sum=arr[i];
            count++;
        }

    }

        return count;



    }

    public static void main(String[] args) {
        int arr[]= {5,4,5,2,3,4,5,6};
        int d = 5;
        //System.out.println(givemin(arr,cap));
        System.out.println( leastWeightCapacity(arr,d));

    }

}
