import java.util.HashSet;
import java.util.Set;

public class chri8a00_a_11_11
{
    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1); set1.add(2); set1.add(3);
        set2.add(2); set2.add(4); set2.add(3);

        System.out.println("Set 1 contains: " + set1 + " Set 2 contains: " + set2);
        System.out.println("The symmetric difference between the two are: "
                            + symmetricSetDifference(set1, set2));
    }

    public static Set symmetricSetDifference(Set<Integer> set1, Set<Integer> set2)
    {
        //Declaring a new set to store intersection of set 1 & 2.
        Set<Integer> intersection = new HashSet<>(set1);

        //intersection now contains all elements that are in both set 1 & 2.
        intersection.retainAll(set2);

        //removing elements from set 1 matching those of the intersection set.
        set1.removeAll(intersection);

        //removing elements from set 2 matching those of the intersection set.
        set2.removeAll(intersection);

        intersection.removeAll(intersection);
        intersection.addAll(set1); intersection.addAll(set2);

        return intersection;
    }
}
