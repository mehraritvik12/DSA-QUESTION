package Arrays.a;
import java.util.*;
public class Q22_Leader_in_Array {

    public static List<Integer> superiorElements(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            boolean isSuperior = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] <= a[j]) {
                    isSuperior = false;
                    break;
                }
            }
            if (isSuperior) {
                list.add(a[i]);
            }
        }

        Collections.sort(list);
        return list;
    }



//Optimal

//    public static List<Integer> superiorElements(int[] a) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int n = a.length;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = n-1; i >= 0; i--) {
//            if(a[i]>max){
//                max=a[i];
//                list.add(a[i]);
//            }
//
//        }
//        //Collections.reverse(list);
//        return list;
//    }
    public static void main(String[] args) {
        int[] array = {142, 145, 41, 13, 41};
        List<Integer> result = superiorElements(array);

        System.out.println("Superior elements: " + result);
    }
}
