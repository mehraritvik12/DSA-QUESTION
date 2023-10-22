package Searching;

public class Q01_Linear_Search {


    static int LinearSearch2(int arr[],int target) {
        if(arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }


        }
        return Integer.MAX_VALUE;    // bcz -1 may be element in arr

    }
//    static int LinearSearch(int arr[],int target) {
//        while (arr.length == 0) {
//            return -1;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//
//
//        }
//        return -1;
//    }

    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,69,2,4,5,6,69,2,};
       System.out.println(LinearSearch2(arr,69));
    }
}
