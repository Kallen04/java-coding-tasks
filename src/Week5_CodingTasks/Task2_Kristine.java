package Week5_CodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task2_Kristine {
    /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse1(String str){
        String reverse = "";//declare an empty String
        for(int i = str.length()-1; i >= 0; i--){//use reverse for loop
            reverse+=str.charAt(i);//concatenate each character to an epmty string
        }
        return reverse;//return new string
    }

    public static String reverse2(String str){
        char [] allCharacters = str.toCharArray();//convert String into Array of char

        ArrayList<Character> listOfChar = new ArrayList<>();//create ArrayList of Characters object

        for (char eachChar : allCharacters) {//loop through each element of char Array and add each to the ArrayList
            listOfChar.add(eachChar);
        }
        Collections.reverse(listOfChar);//use reverse() method of Collections
        String reverse = "";//create empty String
        for (Character character : listOfChar) {//use for loop to add each character to new string
            reverse+=character;
        }


       return reverse;
    }



    public static String reverse3(String str){
        StringBuffer stb = new StringBuffer(str);//create a StringBuffer object

        stb = stb.reverse();//use StringBuffer reverse() method

        return stb.toString();//convert StringBuffer into String and return it
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create Scanner object
        
        String str = input.nextLine();

        System.out.println("Reverse with for loop "+reverse1(str));//print reversed string
        System.out.println("Reverse with Collections " + reverse2(str));

        System.out.println("Reverse with StringBuffer " + reverse3(str));
    }


}
