package Arrays.a;

public class Q04_Left_RotateBy_1 {

    static void leftRotate(int arr[],int n){
      int temp = 1;
      for(int i =1;i<n;i++){
          arr[i-1]=arr[i ];
      }
      arr[n-1] = temp;

      for(int j=0;j<n;j++){
          System.out.print(arr[j] + " ");
      }


    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 3, 4, 5};
      leftRotate(arr,5);

    }

}
