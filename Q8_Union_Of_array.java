package Arrays.a;

import java.util.ArrayList;

public class Q8_Union_Of_array {



    static void Union(int arr[],int arr2[]) {

        ArrayList<Integer> list1 = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            list1.add(arr2[j]);
        }
//        System.out.println(list1); without removing duplictes


            // Create a new ArrayList
            ArrayList<Integer> newList = new ArrayList<>();

            // Traverse through the first list
            for (Integer element : list1) {

                // If this element is not present in newList
                // then add it
                if (!newList.contains(element)) {

                    newList.add(element);
                }
            }

            System.out.println(newList);
        }


    public static void main(String[] args) {
       int  arr[]= {0,5,1,2,3};
       int arr2[]={3,4,3,2};

               Union(arr,arr2);


    }
}
