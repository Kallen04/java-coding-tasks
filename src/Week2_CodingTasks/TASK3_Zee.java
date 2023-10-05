package Week2_CodingTasks;

import java.util.Scanner;

public class TASK3_Zee {

    /*
    Numbers -- print consecutive numbers

    - given a positive integer N ,
    - prints the consecutive numbers from 1 to N, each on a separate line.
    - any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    - If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced
      by a concatenation of the respective words Codility, Test and Coders in this given order.
    For example, numbers divisible by both 2 and 3 should be replace by CodilityTest
    and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

     */

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

//        // declare the word that can divisible by 2,3 and 5
//        String divisibleBy2 = "Codility";
//        String divisibleBy3 = "Test";
//        String divisibleBy5 = "Coders";
        for (int i = 1; i <= num ; i++) {    //iterate from 1 to num

          /*  if((i%2==0) && (i%3==0) && (i%5==0)) {   //the number is divisible by 2,3 and 5
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

           */
            if(i%2 == 0 || i%3 == 0 || i%5 == 0){ // if num can divisible by 2 or 3 or 5

                if(i%2 == 0){
                    System.out.print("Codility");
                }
                if(i%3 == 0){
                    System.out.print("Test");
                }
                if(i%5 == 0){
                    System.out.print("Coders");
                }
                System.out.println(); // after checked all condition print next line

            }  else {
                System.out.println(i);   // the number is not divisible by 2,3 and 5
            }




        }



    }

}
