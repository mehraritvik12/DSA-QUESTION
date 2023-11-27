package Searching;

public class QB17_Smallest_divisor {

    public static int smallestDivisor(int arr[], int limit) {
        int start =0;
        int end = limit;


        while(start<=end)
        {
            int mid = start +( end-start)/2;
            if (givesum(arr, mid)==limit){
                return mid;

            }

            if (givesum(arr, mid)<limit){
                end = mid-1;


        }
                else{

                end = mid-1;
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
