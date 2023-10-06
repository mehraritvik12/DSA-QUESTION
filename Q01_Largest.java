
public class Q01_Largest {
    public static int Largest(int arr[]) {

        int largest = arr[0];
        for (int i = 0; i <= arr.length-2; i++) {

                if (arr[i] < arr[i+1]) {
                    largest = arr[i+1];

                }
            }
        return largest;


    }

    public static void main(String[] args) {


        int arr[] = {3, 2, 9, 7};

        System.out.println(Largest(arr));
    }
}