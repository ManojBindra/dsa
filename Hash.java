import java.util.*;
import java.util.stream.*;

public class Hash {

    public static void main(String[] args)
    {
        HashSet<String> flower_set = new HashSet<>();
 
        flower_set.add("tulip");
        flower_set.add("rose");
        flower_set.add("orchid");
        flower_set.add("marie-gold");
 
        // Using stream api
        // and typecasting the List object to ArrayList
        ArrayList<String> flower_array
            = (ArrayList<String>)flower_set.stream()
                  .collect(Collectors.toList());
 
        // all elements from hashset are copied to arraylist
        System.out.println(
            "Elements of flower Arraylist are :");
        System.out.println(flower_array);
 
        // using the get method of Arraylist to get the
        // element at index=0
        System.out.print("Element at index 0 is : "
                         + flower_array.get(0) + " ");
    }
}

