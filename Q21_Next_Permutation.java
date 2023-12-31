package Arrays.a;
import java.util.*;
public class Q21_Next_Permutation {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)

    {
        int idx=-1;
        int n= permutation.size();

        for(int i =n-2;i>=0;i--){
            if(permutation.get(i)<permutation.get(i+1)){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            Collections.reverse(permutation);
            return permutation;
        }



        for(int i=n-1;i>idx;i--){
            if(permutation.get(i)>permutation.get(idx)){
                Collections.swap(permutation, i,idx);
                break;
            }
        }

        List<Integer> sublist = permutation.subList(idx + 1, n);
        Collections.reverse(sublist);

        return permutation;
    }

    public static void main(String[] args) {
        ArrayList<Integer> permutation = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(nextPermutation(permutation)); // Output: [2, 1, 3]
    }
}
