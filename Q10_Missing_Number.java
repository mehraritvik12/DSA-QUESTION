package Arrays.a;

import java.util.HashSet;

public class Q10_Missing_Number {

//    public static int missingNumber(int []a, int N) {
//        int S1 = (N * (N + 1)) / 2;
//        int S2 = 0;
//        for (int i = 0; i < N-1; i++) {
//            S2 += a[i];
//        }
//
//        return (S1 - S2);
//    }

//    public static int missingNumber(int []a, int N) {
//
//
//        for (int i = 1; i <= N; i++) {
//
//            int flag = 0;
//
//            //Search the element using linear search:
//            for (int j = 0; j < N - 1; j++) {
//                if (a[j] == i) {
//
//                    // i is present in the array:
//                    flag = 1;
//                    break;
//                }
//            }
//
//            // check if the element is missing
//            //i.e flag == 0:
//
//            if (flag == 0) return i;
//        }
//
//        // The following line will never execute.
//        // It is just to avoid warnings.
//        return -1;
//    }


    public static int missingNumber(int[] a, int N) {
        int hash[] = new int[N + 1];
        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        for (int j = 1; j < N - 1; j++) {
            if (hash[j] == 0)
                return j;
        }
        return-1;
}
    public static void main(String[] args) {
        int a[]= {4,6,7,9,2,1,8,11,10,3};
        int N = 11;
       System.out.println(missingNumber(a,N));

    }

}

