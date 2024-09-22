package HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Basics {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);

        // search
        if(set.contains(1)) System.out.println("set contains 1");
        if(!set.contains(6)) System.out.println("Does not contain 6");

        // remove an element in the set
        set.remove(1);

        // size of set
        System.out.println("The size of set is :" +set.size());

        // printing the set.
        System.out.println("Normally prining set :"+set);

        //iterator
        Iterator it =set.iterator();
        System.out.print("Printing using iterator.");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        // to delete all elements in the hashset.
        set.clear();
    }
}
