package Arrays.a;

public class Q10_Missing_Number {

    public static int missingNumber(int []a, int N) {
        int S1 = (N * (N + 1)) / 2;
        int S2 = 0;
        for (int i = 0; i < N-1; i++) {
            S2 += a[i];
        }

        return (S1 - S2);
    }

    public static void main(String[] args) {
        int a[]= {1,2,3,5,6,7,8};
        int N = 8;
       System.out.println(missingNumber(a,N));

    }

}

