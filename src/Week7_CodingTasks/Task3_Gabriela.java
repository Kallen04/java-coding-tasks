package Week7_CodingTasks;

import java.util.Arrays;

public class Task3_Gabriela {
    /*
    Question3: Array - Sort Descending
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 7, 8, 90};
        System.out.println(Arrays.toString(sortArrayDes(arr1)));

        int[] arr2 = {100, 90, 130, 40, 85};
        System.out.println(Arrays.toString(sortArrayDes(arr2)));

    }

    public static int[] sortArrayDes(int[] arr) {
        int num;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
        return arr;
    }


}

