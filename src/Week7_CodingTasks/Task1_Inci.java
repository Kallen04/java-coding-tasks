package Week7_CodingTasks;

public class Task1_Inci {

    /*
    Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
     */

    public static int findMinimumNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 9, 3,-1};
        int minNumber = findMinimumNumber(arr);
        System.out.println("The maximum number in the array is: " + minNumber);
    }
}

