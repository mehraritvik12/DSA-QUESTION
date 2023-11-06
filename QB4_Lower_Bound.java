package Searching;

public class QB4_Lower_Bound {

    public static int lowerBound(int[] arr, int n, int x){
        // arr[i]>=x
        int start = 0;
        int end = n - 1;
        int ans = n;
        while (start <= end) {

        int mid = start + (end - start) / 2;

        if (arr[mid] >= x) {
            ans=mid;
            end = mid - 1;
        }

        else  {
            start = mid + 1;
        }

    }
        return ans;
    }


    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,8};
        System.out.println(lowerBound(arr, 5,7));
    }
}


