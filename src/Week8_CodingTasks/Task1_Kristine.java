package Week8_CodingTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_Kristine {
    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.

For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
     */


    public static int [] zeroSum(int n){

        int [] result = new int[n]; //declared new array with size that equals n

        int sum = 0;//declared and initialized sum

        for(int i = 0; i < result.length-1; i++){//loop through each element of array till second to last
            result [i] = i+1;//assign a value to each element
            sum += result [i];//add value of the element to the sum
        }
        result[result.length-1]= (-sum);//assign negative sum value to the last element

        return result;

    }

    public static void main(String[] args) {
        System.out.println("Enter an integer larger than 1 and less than 100");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n <= 1 || n >= 100){//if number is out of range it will keep asking to enter correct number
            System.out.println("Invalid number, try again");
            n = input.nextInt();
        }
        System.out.println("Array with zero sum" + Arrays.toString(zeroSum(n)));
    }
}
