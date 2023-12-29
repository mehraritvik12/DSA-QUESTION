package Arrays.a;

public class Q18_MaxSubArraySum {


    // Brute O(n3)


//    public static long maxSubarraySum(int[] arr, int n) {
//        long ans=Integer.MIN_VALUE;
//
//        for(int i =0;i<n;i++){
//
//            for(int j=i;j<n;j++){
//                long sum =0;
//                for(int k=i;k<=j;k++){
//                    sum+=arr[k];
//
//                }
//                ans = Math.max(ans, sum);
//            }
//        }
//        if(ans<0){
//            return 0;
//        }
//        return ans;
//    }
//


    //better  O(n2)

//    public static long maxSubarraySum(int[] arr, int n) {
//        long ans=Integer.MIN_VALUE;
//
//        for(int i =0;i<n;i++){
//            long sum =0;
//            for(int j=i;j<n;j++){
//
//                sum+=arr[j];
//
//                ans = Math.max(ans, sum);
//            }
//        }
//        if(ans<0){
//            return 0;
//        }
//        return ans;
//    }

    //optimal


//    long maxi = Long.MIN_VALUE; // maximum sum
//    long sum = 0;
//
//        for (int i = 0; i < n; i++) {
//
//        sum += arr[i];
//
//        if (sum > maxi) {
//            maxi = sum;
//        }
//
//        // If sum < 0: discard the sum calculated
//        if (sum < 0) {
//            sum = 0;
//        }
//    }
//
//    // To consider the sum of the empty subarray
//    // uncomment the following check:
//
//    //if (maxi < 0) maxi = 0;
//
//        return maxi;
}


//coding ninja sol

//    public static long maxSubarraySum(int[] arr, int n) {
//        long curSum[] = new long[n];
//        long maxSum = 0;
//
//        for(int i = 0; i < n; i++) {
//            if(i == 0) {
//                curSum[i] = Math.max(0L, arr[i]);
//            } else {
//                curSum[i] = Math.max(0L, curSum[i-1] + arr[i]);
//            }
//
//            maxSum = Math.max(maxSum, curSum[i]);
//        }
//
//        return maxSum;
//
//    }
//}
//