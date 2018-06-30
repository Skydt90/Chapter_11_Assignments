import java.util.*;

public class chri8a00_a_11_12
{
    public static void main(String[] args)
    {
        List<String> liste = new ArrayList<>();
        liste.add("dav");
        liste.add("dav");
        liste.add("dav");
        liste.add("føj");

        System.out.println(contains3(liste));
    }

    public static boolean contains3(List<String> liste)
    {
        //Declaring a map to store String as key and Integer as value;
        Map<String, Integer> counterMap = new TreeMap<>();

        //Looping through the list.
        for (String word : liste)
        {
            //If map contains the key, add the key again and increment its value by 1.
            if (counterMap.containsKey(word))
            {
                int counter = counterMap.get(word);
                counterMap.put(word, 1 + counter);
            }
            //If not, just add the key and assign its value to 1.
            else
            {
                counterMap.put(word, 1);
            }
        }
        //Loops through every key i the map and increments the counter each time a word is found.
        //Returns true if counter reaches 3.
        for (String word : counterMap.keySet())
        {
            int counter = counterMap.get(word);
            return (counter == 3);
        }
        return false;
    }
}
