package Week1_CodingTasks;

import java.util.Scanner;

public class TASK1_Andjela {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0) {

            System.out.println(num + " is even");
        } else {

            System.out.println(num + " is odd");
        }
    }

    public static class OddEven_Boolean {

        public static void main(String[] args) {


            int number = 20;

            boolean isEven = number % 2 == 0; //When we divide number by two we need reminder 0, case that means is even number

            //boolean isOdd= number% 2 != 0; // When we divide a number by 2, if the reminder is NOT 0, means the number is odd

            boolean isOdd = !isEven; //If the number is not even, then it's odd

            System.out.println(number + " is and even number: " + isEven);
            System.out.println(number + " is an odd number " + isOdd);


        }


    }

    public static class OddEven_Ternary {
        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);

            System.out.println("Enter a number: ");
            int num = reader.nextInt();

            String evenOdd=(num %2==0)? "even":"odd";

            System.out.println(num + " is "+ evenOdd);
        }
    }
}