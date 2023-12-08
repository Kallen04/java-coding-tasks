package Week6_CodingTasks;

public class Task2_Mahbuba {
    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array
    public static int findMaxArray(int[] arr) {
        int max = arr[0]; //initialize max,it will hold value of first array
        for (int i = 0; i < arr.length; i++) { //loop through array
            if (max < arr[i]) { //if any of element is greater than max, then store a value of the element in max
                max = arr[i]; //at the end of the loop, max represents the largest element in the array
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, -1, 12, 1, 9};
        System.err.println(("Maximum number is: " + findMaxArray(arr)));
    }

}
