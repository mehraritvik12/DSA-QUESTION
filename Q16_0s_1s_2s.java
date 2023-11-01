package Arrays.a;

import java.util.ArrayList;
import java.util.*;

import static java.util.Collections.swap;


public class Q16_0s_1s_2s {


    public static void sort(ArrayList<Integer> arr, int n){

        int low =0;
        int mid =0;
        int high = n-1;

        while(mid<=high) {
            if (arr.get(mid) == 0) {
                // swap function
                int temp = arr.get(mid);
                arr.set(mid, arr.get(low));
                arr.set(low,temp);

                mid++;
                low++;
            } else if (arr.get(mid) == 1) {


                mid++;

            } else {


                // swap function
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;

            }
        }
        }
//        int c1=0;
//        int c2=0;
//        int c3=0;
//
//        for(int i =0;i<n;i++){
//
//            if(arr.get(i)==0){
//                c1++;
//            }
//            else if(arr.get(i)==1){
//                c2++;
//            }
//            else if(arr.get(i)==2){
//                c3++;
//            }
//        }
//         arr.clear();
//        for(int i=0;i<c1;i++){
//           arr.add(Integer.valueOf("0"));
//        }
//        for(int i=0;i<c2;i++){
//            arr.add(Integer.valueOf("1"));
//        }
//        for(int i=0;i<c3;i++){
//            arr.add(Integer.valueOf("2"));
//        }
//
//
//
////        System.out.println(arr);
//
//    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,2,2,2,0,0,1,0));
        sort(arr,8);
      System.out.println(arr);


    }



}
