import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class chri8a00_a_11_19
{
    public static void main(String[] args)
    {
        Map<String, Integer> names = new HashMap<>();
        names.put("Christian", 5); names.put("Søren", 3); names.put("Trine", 1);
        System.out.println("The original map contains: " + names);
        System.out.println("The number that occurs the fewest times in the map is : " + rarest(names));
    }

    public static int rarest(Map<String, Integer> map)
    {
        try
        {
            if (map.isEmpty())
                throw new NullPointerException();
            else
            {
            Map<Integer, Integer> intMap = new TreeMap<>();   //TreeMap to contain map values and no of occurrences.
            Map<Integer, Integer> revMap = new TreeMap<>();   //TreeMap to contain reversed values and keys from intMap

            //Adding int key to the new map and assigning them a new value
            for (String key : map.keySet())
            {
                int value = map.get(key);                      //Value equals to that of the given key.

                if (intMap.containsKey(value))
                {
                    intMap.put(value, intMap.get(value) + 1);
                }
                else
                {
                    intMap.put(value, 1);
                }
            }
            //Reversing the intMap, ensuring that the first number
            //is the lowest occurring in the original map
            for (Integer key : intMap.keySet())
            {
                Integer value = intMap.get(key);   //Assigning the keys value to an Integer.
                if (!revMap.containsKey(value))    //Checks if new map has the value.
                {
                    revMap.put(value, key);        //If not, assigns the value as key and key as value.
                }
            }
            return revMap.get(1);                  //Returns the first number of the revered map,
            }
        }
        catch (Exception npe)
        {

            System.out.println("You tried to enter a map with no values! " + npe);
        }
        return 0;
    }
}
