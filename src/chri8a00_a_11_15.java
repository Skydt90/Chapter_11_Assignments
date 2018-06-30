import java.util.*;

public class chri8a00_a_11_15
{
    public static void main(String[] args)
    {
        List<Integer> tal = new LinkedList<>();
        tal.add(1); tal.add(5); tal.add(3); tal.add(2); tal.add(4);tal.add(6); tal.add(1);
        System.out.println("The list looks like this: " + tal);
        System.out.println("The highest number of times a value has appeared is: " + maxOccurrences(tal));
    }

    public static int maxOccurrences(List<Integer> list)
    {
        //Retun 0 if list is empty.
        if (list.size() == 0)
        {
            return 0;
        }

        //Declaring a map to store the integers and their number of occurrences.
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxOccurrence = 0;

        //Loops and places the numbers to the map with the correct value assigned to the key.
        for(int tal : list)
        {
            if(map.containsKey(tal))
            {
                map.put(tal, map.get(tal) + 1);
            }
            else
            {
                map.put(tal, 1);
            }

            //Adjusts the variable, so it will reflect the number of times,
            // a number has appeared in the list.
            if(map.get(tal) > maxOccurrence)
            {
                maxOccurrence = map.get(tal);
            }
        }
        return maxOccurrence;
    }
}
