package Week1_CodingTasks;

import java.util.Scanner;

public class OddEven_Ternary {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd=(num %2==0)? "even":"odd";

        System.out.println(num + " is "+ evenOdd);
    }
}