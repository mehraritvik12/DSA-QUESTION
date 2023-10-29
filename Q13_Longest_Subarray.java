package Arrays.a;

public class Q13_Longest_Subarray {
    public static int longestSubarrayWithSumK(int []a, long k) {
      int len = 0;
        for(int i =0; i<a.length;i++){
            for(int j =i;j<a.length;j++){

                long s = 0;
                for(int l =i;l<=j;l++){
                    s+=a[l];
                }
                if(s==k)
                    len = Math.max(len,j-i+1);


            }

        }

        return len;
     }



    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;

    System.out.println(longestSubarrayWithSumK(a,k));
    }
}
