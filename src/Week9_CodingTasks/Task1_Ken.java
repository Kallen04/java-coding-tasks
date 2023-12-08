package Week9_CodingTasks;

import java.util.Scanner;

public class Task1_Ken {

    /*
        Array - Concat two arrays
        Write a return method that can concat two arrays
     */

    public static void main(String[] args) {

        // Get user input1.
        Scanner input =new Scanner(System.in);
        System.out.println("Please Enter anything as array1: ");
        String input1 = input.nextLine();

        // Get user input2.
        System.out.println("Please Enter anything as array2: ");
        String input2 = input.nextLine();

        // Use custom method to concat 2 arrays
        System.out.println("The Concatenated Array is: ");
        System.out.println(arrayConcat(input1, input2));

    }

    public static char[] arrayConcat(String string1, String string2){

        // Convert string1 to char array
        char[] array1 = string1.toCharArray();

        // Convert string2 to char array
        char[] array2 = string2.toCharArray();

        // Create a final Array, length is two arrays' sum
        char[] finalArray = new char[string1.length() + string2.length()];

        // Copy element from array1 to final array
        for (int i = 0; i < string1.length(); i++) {

            finalArray[i] = array1[i];

        }

        // Copy element from array2 to final array
        for (int i = 0; i < string2.length(); i++) {

            finalArray[array1.length + i] = array2[i];

        }

        return finalArray;

    }


}
