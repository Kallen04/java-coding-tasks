package Week11_CodingTasks;

import java.util.*;

public class Task1_Ken {


    // Write a method that prints the frequency of each character from a String.


    public static void main(String[] args) {

        // Get user input1
        Scanner input =new Scanner(System.in);
        System.out.println("Please Enter something: ");
        String str = input.nextLine();

        // Use the custom method
        stringFrequency(str);

    }

    public static void stringFrequency(String str){

        // Create a map tp put the result.
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Create a loop for get frequency of String.
        for (String each : str.split("")) {

            // Convert String to Array then use the frequency method to get frequency.
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            // Put string and frequency in the map
            frequencyMap.put(each, frequency);

        }

        // Print the map
        System.out.println(frequencyMap);

    }

}
