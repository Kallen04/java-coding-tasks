package Week3_CodingTasks;

import java.util.Scanner;
public class TASK1_Ken {

    // Find a prime number
    // A prime number is a whole number greater than 1 and whose only factors are 1 and itself.
    // e.g. 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29

    public static void main(String[] args) {

        // Get a number input from user

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number:");

        // Use custom method for check if num a prime number

        isPrimeNumber(input.nextInt());
    }

    public static boolean isPrimeNumber(int num){

        int reminderCount = 0;

        // num should be > 1
        // Check how many times num can divide number i and have 0 reminder

        if (num > 1){
            for (int i = 1; i <= num; i++){
                if(num % i == 0){
                    reminderCount++;
                }
            }

            // If num leaving 0 reminder only 2 times, it is a prime number

            if(reminderCount == 2){
                System.out.println(num + " is a prime number");
                return true;
            }
        }

            System.out.println(num + " is not a prime number");
            return false;
    }
}
