package Arrays.a;

public class Q01_Largest {
//    public static int LargestBrute(int arr[]) {
//
//        int largest = arr[0];
//        for (int i = 0; i <= arr.length-2; i++) {
//
//                if (arr[i] < arr[i+1]) {
//                    largest = arr[i+1];
//
//                }
//            }
//        return largest;
//
//
//    }

    public static int SecondLargest(int arr[]) {
        int sl=Integer.MIN_VALUE;
        for(int i =0;i<=arr.length-1;i++){
             if(arr[i]>sl && arr[i]!=Largest(arr) )
                sl=arr[i];
        }
        return sl;
    }


    public static int Largest(int arr[])
    {
        int largest = Integer.MIN_VALUE;   //-infinity

        for(int i=0;i<=arr.length-1;i++){
            if(largest<arr[i])
                largest=arr[i];
        }
        return largest;
    }


    public static int Smallest(int arr[])
    {
        int smallest = Integer.MAX_VALUE;   //-infinity

        for(int i=0;i<=arr.length-1;i++){
            if(smallest>arr[i])
                smallest=arr[i];
        }
        return smallest;
    }

    public static int SecondSmallest(int arr[])
    {
        int ss = Integer.MAX_VALUE;   //-infinity

        for(int i=0;i<=arr.length-1;i++){
            if(ss>arr[i] && arr[i]!=Smallest(arr))
                ss=arr[i];
        }
        return ss;
    }

    public static void main(String[] args) {


        int arr[] = {3, 2, 9, 7};

        //System.out.println(LargestBrute(arr));
        System.out.println(Largest(arr));
        System.out.println(SecondLargest(arr));
        System.out.println(Smallest(arr));
        System.out.println(SecondSmallest(arr));
    }
}
