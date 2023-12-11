package Week8_CodingTasks;

import java.util.Arrays;

public class Task2_Kristine {

    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
     */

    public static void main(String[] args) {
        int [] arr =  {1,0,2,0,3,0,4,0};



        System.out.println("Zeros at the end: " + Arrays.toString(zerosAtTheEnd(arr)));

    }

    public static int [] zerosAtTheEnd(int [] arr){

        int[] newArr = new int [arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                newArr[j++] = arr[i];
            }

        }


        return newArr;
    }
}
