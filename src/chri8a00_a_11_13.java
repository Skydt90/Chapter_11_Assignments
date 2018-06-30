import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class chri8a00_a_11_13
{
    public static void main(String[] args)
    {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("Christian", 27); map1.put("Camilla", 26);
        map2.put("Søren", 30); map2.put("Christian", 27);

        System.out.println(intersect(map1, map2));
    }

    public static Map intersect(Map<String, Integer> map1, Map<String, Integer> map2)
    {
        //Declaring a set to store keys from the map
        Set<String> keySet1 = map1.keySet();
        Set<String> keySet2 = map2.keySet();

        Set<String> commonKey = new HashSet<>(keySet1);

        System.out.println(commonKey.retainAll(keySet2));

        return map1;
    }
}
