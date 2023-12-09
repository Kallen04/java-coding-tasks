package Week8_CodingTasks;

import java.util.Arrays;

public class Task2_Mahbuba {
//Write a method that can move all the zeros to last indexes of the array (Do
//Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0]

    public static int[] moveZeros(int[] nums){
        int[] output = new int[nums.length]; //new array with same size
        int index = 0; // index is needed for new created array(output),to assign values based on index
        for(int each : nums){ //will go through values of array
            if(each !=0){
                output[index++] = each; //assign in the position of index++
            }
        }
        return output;
    }

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,0,4,0};

        System.err.println("Updated Array: "+ Arrays.toString(moveZeros(arr)));
    }
}
