package Arrays.a;

public class Q12_Appears_once {
    public static int getSingleElement(int []arr){
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;

    }

    public static void main(String[] args) {
        int arr[] ={1,2,2,3,1};
                System.out.println(getSingleElement(arr));
    }
}
