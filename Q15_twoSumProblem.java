package Arrays.a;

public class Q15_twoSumProblem {

    public static String read(int n, int []book, int target){
        String s ="YES";
        String b ="NO";
        for(int i =0;i<book.length;i++){
            for(int j = 0;j<book.length;j++){
                if(book[i]+book[j]== target){
                    return s;
                }
            }
        }
        return  b;
    }

    public static void main(String[] args) {
        int arr[]= {4,1,2,3,1};
      System.out.println( read(5,arr,5));

    }
}
