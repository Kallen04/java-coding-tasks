package Week8_CodingTasks;

import java.util.Arrays;

public class Task1_Eve {

    public static int[] Solution(int N) {
        int[] result = new int[N];  //4
        int sum = 0;
        for (int i = 0; i < N - 1; i++) { // 0, 1, 2
            result[i] = i;  //  [0, 1, 2, -3]
            sum += i; // 3
        }
        result[N - 1] = -sum; //3
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(6)));

    }
}