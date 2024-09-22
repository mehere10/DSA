package HashSet;
import java.util.HashSet;
public class Temp {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(1);

        // search
        if(set.contains(1)) System.out.println("set contains 1");
        if(!set.contains(6)) System.out.println("Does not contain 6");

    }
}
