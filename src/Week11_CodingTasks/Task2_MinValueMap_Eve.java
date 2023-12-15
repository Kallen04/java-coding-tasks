package Week11_CodingTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task2_MinValueMap_Eve {
    public  static  int  minValue( Map<String,Integer> map  ) {
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first( );
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 10);
        map.put("C", 2);
        map.put("D", 7);

        int minimumValue = minValue(map);
        System.out.println("Minimum value: " + minimumValue);
    }
}
