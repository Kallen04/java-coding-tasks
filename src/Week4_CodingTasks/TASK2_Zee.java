package Week4_CodingTasks;

import java.util.Arrays;
import java.util.Scanner;

public class TASK2_Zee {
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st word : ");
        String str1 = input.nextLine();
        System.out.print("Enter 2nd word : ");
        String str2 = input.nextLine();


        System.out.println(same(str1,str2));

    }

    public static boolean same(String str1, String str2) {

            // Check if the lengths of the strings are equal.
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert the strings to character arrays.
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            // Sort the character arrays.
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            // Compare the character arrays.
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    return false;
                }
            }

            return true;
    }


}
