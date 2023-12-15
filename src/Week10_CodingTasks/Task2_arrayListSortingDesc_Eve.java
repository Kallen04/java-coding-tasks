package Week10_CodingTasks;

import java.util.ArrayList;

public class Task2_arrayListSortingDesc_Eve {
    public static void sortDescending(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);

        System.out.println("Original ArrayList: " + numbers);

        sortDescending(numbers);

        System.out.println("ArrayList sorted in descending order: " + numbers);
    }
}

