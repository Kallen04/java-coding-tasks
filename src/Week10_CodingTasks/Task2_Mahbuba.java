package Week10_CodingTasks;

import java.util.Arrays;

public class Task2_Mahbuba {

    //Write a method that can sort the ArrayList in descending order without
    //using the sort method.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(7, 4, 0, 13, 8, 6, -4, 5, 1, 2, 9)));
    }

    public static int[] sortDescending(int... arr) { //we convert int array to variable argument

        for (int i = 0; i < arr.length; i++) { //will iterate through array
            for (int j = 0; j < arr.length - 1; j++) { //will compare each 2 numbers
                if (arr[j] < arr[j + 1]) { //we need to swap positions
                    int temp = arr[j]; // temporary variable is created not to lose the value of swapped numbers
                    arr[j] = arr[j + 1]; //as we compare numbers next to it, j<arr.length-1(to avoid index out of bound exception)
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


}
