package HashMap;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        // key(type),value(type)
        HashMap<String,Integer> map=new HashMap<>();

        // insertion.
        map.put("India",120);
        map.put("USA",30);
        map.put("China",150);

        // searching.
        System.out.println(map.containsKey("China"));   // if a key is present in map  it will display true

        // displaying
        System.out.println(map);
    }
}
