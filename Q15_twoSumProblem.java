package Arrays.a;

import java.util.*;
public class Q15_twoSumProblem {

//    public static String read(int n, int []book, int target){
//        String s ="YES";
//        String b ="NO";
//        for(int i =0;i<book.length;i++){
//            for(int j = 0;j<book.length;j++){
//                if(book[i]+book[j]== target){
//                    return s;
//                }
//            }
//        }
//        return  b;
//    }

  //Better

//public static String read(int n, int []arr, int target) {
//    HashMap<Integer, Integer> mpp = new HashMap<>();
//    for (int i = 0; i < n; i++) {
//        int num = arr[i];
//        int moreNeeded = target - num;
//        if (mpp.containsKey(moreNeeded)) {
//            return "YES";
//        }
//
//        mpp.put(arr[i], i);
//    }
//    return "NO";
//}

    //Brute

    public static String read(int n, int []arr, int target) {
       int left = 0,right = n-1;
        Arrays.sort(arr);
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum==target){
                return "Yes";
            }
            else if(sum< target){
                left++;
            }
            else{right--;}

        }
        return "NO";
    }

    public static void main(String[] args) {
        int arr[]= {4,1,2,3,1};
      System.out.println( read(5,arr,5));

    }
}
