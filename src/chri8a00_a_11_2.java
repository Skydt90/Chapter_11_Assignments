import java.util.LinkedList;
import java.util.List;

public class chri8a00_a_11_2
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new LinkedList<>();
        List<Integer>list2 = new LinkedList<>();

        list1.add(1); list1.add(3); list1.add(5);
        list2.add(2); list2.add(4); list2.add(7); list2.add(11);

        System.out.println(alternate(list1, list2));
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2)
    {
        //List to return
        List<Integer> list3 = new LinkedList<>();

        //local variables to control uneven length of lists
        boolean alternate = true;          //boolean to alternate between calls in loop.
        int size1 = list1.size();
        int size2 = list2.size();
        int index1 = 0;
        int index2 = 0;

        while(index1 < size1 || index2 < size2)
        {
            if(index1 < size1 && alternate)
            {
                list3.add(list1.get(index1));
                index1++;
            }
            else if(index2 < size2 && !alternate)
            {
                list3.add(list2.get(index2));
                index2++;
            }
            alternate = !alternate;
        }
        return list3;
    }
}