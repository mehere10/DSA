package HashMap;
import java.util.*;

public class Basics {
    public static void main(String[] args) {
        // key(type),value(type)
        HashMap<String,Integer> map=new HashMap<>();    // create a hash map {syntax}.

        // insertion.
        map.put("India",120);
        map.put("USA",30);
        map.put("China",150);

        // searching.
        System.out.println(map.containsKey("China"));   // if the key is present in map  it will display true

        // iteration in hashMap
        System.out.println("Iterating in the map : ");
        for(Map.Entry<String , Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue());
            System.out.println("");
        }
        // displaying the entire map
        System.out.println(map);
    }
}
