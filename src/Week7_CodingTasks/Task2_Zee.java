package Week7_CodingTasks;


public class Task2_Zee {


    /*
    Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {

        int[] arr = {10,9,8,7,12,4,5};

        // after sort array assign back to arr variable
        arr = sortAscendingArray(arr);

        // print after sort Ascending
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] sortAscendingArray(int[] arr){

        // Sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {  // start from index 0
            // start from next index all the way to last index of array to find the minimum number
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {    // if found the lower number
                    int temp = arr[i];    // swap the index
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }

}
