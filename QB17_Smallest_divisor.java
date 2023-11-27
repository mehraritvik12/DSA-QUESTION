package Searching;

public class QB17_Smallest_divisor {

    public static int smallestDivisor(int arr[], int limit) {

        int n = arr.length; //size of array.
        if(n > limit)
        {
            return -1;
        }
        //Find the maximum element:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }



        int start =1;
        int end = maxi;


        while(start<=end)
        {
            int mid = start +(end-start)/2;

            if (givesum(arr, mid)<=limit){
                end = mid-1;


        }
                else{

              
                start = mid +1;
        }



        }

        return start;
    }

    private static int givesum(int[] arr,int q) {
        int sum =0;

        for(int i =0;i<arr.length;i++){
            int j= (int)Math.ceil((double)(arr[i]) /(double) (q) );
            sum+=j;

        }
        return sum;

    }


    public static void main(String[] args) {
        int arr[]= {8,4,2,3};

        int limit =10;

        int ans = smallestDivisor(arr,limit);
        System.out.println(ans);


    }
}
