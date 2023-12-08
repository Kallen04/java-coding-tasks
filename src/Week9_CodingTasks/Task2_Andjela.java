package Week9_CodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task2_Andjela {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Nick", "Sam", "Jane", "Ahmed"));
        System.out.println(removeAhmed(names));
    }

    /*

Remove Ahmed

Create a method that will accept a List of names and returns a List with all Ahmed names removed

parameter: List<String>
returns: List <String>

Ex.

removeAhmed ("Ahmed","John","Nick","Erick","Ahmed")
output: ("John","Nick","Erick")

     */


    public static List<String> removeAhmed(List<String> names) {
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("Ahmed")) {
                iterator.remove();
            }


        }
        return names;

    }

    public static List<String> removeAhmed2(List<String> names) {

        names.removeIf(p -> p.equals("Ahmed"));
        return names;
    }
}
