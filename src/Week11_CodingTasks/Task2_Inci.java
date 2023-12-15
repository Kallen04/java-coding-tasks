package Week11_CodingTasks;

import java.util.HashMap;
import java.util.Map;

public class Task2_Inci {

/*
Map - Min value
Write a method that can return the minimum value from a map (DO NOT
use sort method
 */

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("a", 0);
        myMap.put("b", 3);
        myMap.put("c", 8);
        myMap.put("d", 1);


        int minValue = findMinValueFromMap(myMap);
        System.out.println("minValue = " + minValue);
    }

    public static Integer findMinValueFromMap(Map<String,Integer> myMap ){

        if (myMap == null || myMap.isEmpty()) {
            return null;
        }

        Integer min = myMap.values().iterator().next();

        for ( Integer value : myMap.values()) {
            if(value<min){
                min = value;
            }
        }

        return min;
    }

}
