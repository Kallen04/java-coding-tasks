package Week10_CodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Task1_zee {

//    Task 1
//    ArrayList - sorting in ascending
//    Write a method that can sort the ArrayList in Ascending order without using
//    the sort method.

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(10,9,8,7,12,4,5));
        // after sort array assign back to arr variable
       list = sortAscendingArray(list);

        // print after sort Ascending
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static ArrayList<Integer> sortAscendingArray(ArrayList<Integer> list){

        // Sort the array in ascending order
        for (int i = 0; i < list.size()-1; i++) {  // start from index 0
            // start from next index all the way to last index of array to find the minimum number
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {    // if found the lower number
                    Collections.swap(list, i, j);   // swap the number
                }
            }
        }
        return list;

    }




}
