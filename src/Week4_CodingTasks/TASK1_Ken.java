package Week4_CodingTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TASK1_Ken {
    public static void main(String[] args) {

        // Get user input.
        Scanner input =new Scanner(System.in);
        System.out.println("Please Enter a random String : ");
        String str = input.nextLine();

        // Use custom method to get the result.
        frequencyOfChar(str);

    }

    public static void frequencyOfChar(String str){

        // Declare String result which is for final result.
        String result = "";

        // Use .split method to get string array, and use foreach loop to get each string of the array.
        for (String each : str.split("")) {

            // Use frequency method from Collections class to get the frequency of each element of String array.
            // For using frequency method, we cannot pass an array as first argument, we need to cast it to a collection type, here we use asList method to cast it.
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            // After steps above, we got each character "each" and frequency of it "frequency".

            // Now we need to add each character and frequency to the "result".
            // Also make sure duplicated characters are not added to the "result".
            // So, if character is not contains to the "result" yet, we add it to the "result", after character, at the end we also add frequency of each character.
            if(!result.contains(each)){

                result += each + frequency;

            }

        }

        System.out.println(result);

    }

}
