package Searching;

public class QB19_Find_k_Missing_ {
    public static int missingK(int[] vec, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;     /// or low +k
    }


    public static void main(String[] args) {
        int arr[]= {4,7,9,10};
        System.out.println(  missingK(arr,4,4));
    }
}
