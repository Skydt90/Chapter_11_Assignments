import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class chri8a00_a_11_16
{
    public static void main(String[] args)
    {
        Map<String, String> names = new HashMap<>();
        names.put("Christian", "27"); names.put("Søren", "26");
        System.out.println("The map contains: " + names);
        System.out.println("Keys don't point to the same value: " + is1to1(names));
    }

    public static boolean is1to1(Map<String, String> map)
    {
        //declaring a set to store values, to separate duplicates
        Set<String> values = new HashSet<>();

        //Looping all key Strings in the map.
        for (String key : map.keySet())
        {
            String value = map.get(key);    //Assigning the value of the key to a String
            values.add(value);              //And adding it to the set
        }
        return map.size() == values.size();
    }
}
