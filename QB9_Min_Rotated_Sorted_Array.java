package Searching;

public class QB9_Min_Rotated_Sorted_Array {

    public static int findMin(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[start] <= arr[end]) {
                ans = Math.min(ans, arr[start]);
                break;
            }

            // left half sorted
            if (arr[start] <= arr[mid]) {
                ans = Math.min(ans, arr[start]);
                start = mid + 1;


            } else {
                ans = Math.min(ans, arr[mid]);
                end = mid -1;

            }


        }
        return ans;
    }
}
