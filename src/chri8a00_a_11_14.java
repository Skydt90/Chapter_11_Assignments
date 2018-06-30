import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class chri8a00_a_11_14
{
    public static void main(String[] args)
    {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("Christian", 27);
        map1.put("Camilla", 26);
        map2.put("Søren", 30);
        map2.put("Christian", 27);
        map2.put("Camilla", 26);

        System.out.println(intersect(map1, map2));
    }

    public static Map intersect(Map<String, Integer> map1, Map<String, Integer> map2)
    {
        //Declaring two sets to contain all keys from each map
        Set<String> keySet1 = map1.keySet();
        Set<String> keySet2 = map2.keySet();

        //Declaring a new set to store the intersection of map 1 & 2.
        Set<String> intersection = new HashSet<>(keySet1);
        intersection.retainAll(keySet2);

        //Declaring a new map to store the intersected values if equal.
        Map toReturn = new HashMap();

        //Looping all names in the intersection map & checks if key equals value.
        for (String name : intersection)
        {
            Integer keyValue1 = map1.get(name);    //Set the variable equal to the value associated with this key
            Integer keyValue2 = map2.get(name);    // --||--

            //Add key and value to the new map if they match.
            if (keyValue1.equals(keyValue2))
            {
                toReturn.put(name, keyValue1);
            }
        }
        return toReturn;
    }
}

