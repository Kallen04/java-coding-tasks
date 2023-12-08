package Week9_CodingTasks;

import java.util.ArrayList;

public class Task3_Vladimir {

    // TASK3: ArrayList - Remove some values
    // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 1; i <= 200; i++) {
            arrList.add(i);
        }
        System.out.println("Array List BEFORE removing values greater than 100 - " + arrList);

        arrList.removeIf(p -> p > 100);

        System.out.println("Array List AFTER removing values greater than 100 - " + arrList);


    }


}
