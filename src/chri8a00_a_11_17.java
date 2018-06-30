import java.util.HashMap;
import java.util.Map;

public class chri8a00_a_11_17
{
    public static void main(String[] args)
    {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("Christian", "27");
        map1.put("Camilla", "27");
        map2.put("Søren", "30");
        map2.put("Christian", "27");
        map2.put("Camilla", "27");

        System.out.println("Map 2 contains the same keys and values as map 1: " + subMap(map1, map2));
    }

    public static boolean subMap(Map<String, String> map1, Map<String, String> map2)
    {
        //Declaring a counter to track number of times keys and values match.
        int counter = 0;

        //Looping over every key in map 1.
        for (String key : map1.keySet())
        {
            String value1 = map1.get(key);      //Adding the value of the key from map1 to a String
            String value2 = map2.get(key);      //Adding the value of the key from map2 to a String

            if (value1.equals(value2))          //Comparing the values of the two Strings.
            {
                counter++;
            }
        }
        return counter == map1.size();
    }
}
