package Arrays.a;

import static java.lang.Math.max;

public class Q11_Consecutive_Ones {


    public static int consecutiveOnes(int n, int[] arr) {
        int maxi = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxi= max(maxi,count);
            }
            else{
                count =0;
            }

        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,1,1,1,1,1,0};

System.out.println( consecutiveOnes(10,arr));
    }
}
