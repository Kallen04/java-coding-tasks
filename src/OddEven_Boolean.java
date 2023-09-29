public class OddEven_Boolean {

    public static void main(String[] args) {


        int number = 20;

        boolean isEven = number % 2 == 0; //When we divide number by two we need reminder 0, case that means is even number

        //boolean isOdd= number% 2 != 0; // When we divide a number by 2, if the reminder is NOT 0, means the number is odd

        boolean isOdd = !isEven; //If the number is not even, then it's odd

        System.out.println(number + " is and even number: " + isEven);
        System.out.println(number + " is an odd number " + isOdd);


    }


}

