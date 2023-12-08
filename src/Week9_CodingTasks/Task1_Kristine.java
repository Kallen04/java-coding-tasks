package Week9_CodingTasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task1_Kristine {

    /*
    Array - Concat two arrays
Write a return method that can concate two arrays
     */

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4};
        int [] arr2 = {5, 6, 7, 8, 9};

        System.out.println("Two Arrays combined: " + Arrays.toString(concatArray(arr1, arr2)));

        String [] arrStr1 = {"Team", "Alya"};
        String [] arrStr2 = {"is", "the", "best"};

        System.out.println("Two Arrays combined: " + Arrays.toString(concatArray(arrStr1, arrStr2)));
    }


    public static int [] concatArray(int[] arr1, int [] arr2){
        int [] arr = new int [arr1.length + arr2.length] ;

        for(int i = 0; i< arr1.length; i++){
        arr[i] = arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            arr[j+arr1.length] = arr2[j];
        }

        return arr;
    }

    public static String [] concatArray(String[] arr1, String [] arr2){

       // String [] arr = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray(String[]::new);
        String [] arr = new String [arr1.length + arr2.length] ;

        for(int i = 0; i< arr1.length; i++){
        arr[i] = arr1[i];
        }
        for(int j = 0; j < arr2.length; j++){
            arr[j+arr1.length] = arr2[j];
        }

        return arr;
    }
}
