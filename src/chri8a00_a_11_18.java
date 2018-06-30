import java.util.HashMap;
import java.util.Map;

public class chri8a00_a_11_18
{
    public static void main(String[] args)
    {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Christian", "27"); map1.put("Camilla", "29"); map1.put("Søren", "29");

        System.out.println("Original map: " + map1);
        System.out.println("Reversed map: " + reverse(map1));
    }

    public static Map reverse(Map<String, String> map)
    {
        //Declaring a new map to store the reversed info.
        Map<String, String> reversedMap = new HashMap<>();

        //Looping over every key in the map.
        for(String key : map.keySet())
        {
            String value = map.get(key);            //Assigning the keys value to a String.
            if(!reversedMap.containsKey(value))     //Checks if new map has the value.
            {
                reversedMap.put(value, key);        //If not, assigns the value as key and key as value.
            }
        }
        return reversedMap;
    }
}
