package Week2_CodingTasks;

import java.util.Scanner;

public class TASK3_Zee {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();
        if (num <= 0) {           // if NOT positive number
            System.out.println("Invalid Number!!");
        } else {
            printConsecutiveNumber(num);
        }

    }

    public static void printConsecutiveNumber(int num){

        // declare the word that can divisible by 2,3 and 5
        String divisibleBy2 = "Codility";
        String divisibleBy3 = "Test";
        String divisibleBy5 = "Coders";

        for (int i = 1; i <= num ; i++) {    //iterate from 1 to num

            if((i%2==0) && (i%3==0) && (i%5==0)) {   //the number is divisible by 2,3 and 5
                System.out.println(divisibleBy2+divisibleBy3+divisibleBy5); //concatenation 3 word together

            } else if ((i%2==0) && (i%3==0)) {   //the number is divisible by 2,3
                System.out.println(divisibleBy2+divisibleBy3); // concatenate word of divisibleBy2 and divisibleBy3

            } else if ((i%2==0) && (i%5==0)) {  //the number is divisible by 2,5
                System.out.println(divisibleBy2+divisibleBy5); // concatenate word of divisibleBy2 and divisibleBy5

            } else if ( (i%3==0) && (i%5==0) ){  //the number is divisible by 3,5
                System.out.println(divisibleBy3+divisibleBy5); // concatenate word of divisibleBy3 and divisibleBy5

            } else if (i%2==0) {  //the number is divisible only 2
                System.out.println(divisibleBy2);   //replace divisibleBy2 word

            } else if (i%3==0) {   //the number is divisible only 3
                System.out.println(divisibleBy3);  //replace divisibleBy3 word

            } else if (i%5==0) {  //the number is divisible only 5
                System.out.println(divisibleBy5);  //replace divisibleBy5 word

            } else {
                System.out.println(i);
            }
        }



    }

}
