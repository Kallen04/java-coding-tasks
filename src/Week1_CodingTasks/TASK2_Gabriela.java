package Week1_CodingTasks;

public class TASK2_Gabriela {

    // Write a method that can divide two numbers without using division operator

    public static int divide(int num1, int num2) {
        int result = 0;

        if (num2 == 0) { //Undefined result
            throw new ArithmeticException("Can't divide by zero.");
        }

        if (num1 == 0) { //If zero is divided by another number the quotient is always 0
            return result;
        }

        //When we have division between two neg numbers the quotient is always a pos number
        // in order to calculate the result(quotient) just divide the integers as usual, and ignore the negative sign.

        //A positive number divided by a negative number is always negative,
        // divide the integers as usual, then place a negative sign in front of the result.
        boolean negative = false;
        if (num1 < 0) {
            // in order to calculate the result just divide the integers as usual, and ignore the negative signs
            num1 *= (-1); // transform the neg num into a pos one by multiplication with -1
            negative = true;
        }
        if (num2 < 0) {
            num2 = -num2; //another option is to reassign its neg value
            negative = true;
        }

        while (num1 >= num2) {
            num1 -= num2; //we subtract num2 from num1 and increase result by one every iteration
            result++;
        }

        if (negative) {
            return -result;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(divide(-7, 3));
    }
}
