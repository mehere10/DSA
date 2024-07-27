//package ArrayDataStructure.ArrayList;
//import java.util.ArrayList;
//
//public class ArrayListDemo
//{
//    public static void main(String[] args)
//    {
//        ArrayList<Integer> age=new ArrayList<Integer>();    // declaring an arraylist
//
//        // adding items to list
//        age.add(45);
//        age.add(65);
//        age.add(15);
//
//        // printing the content
//        System.out.println(age);
//    }
//}


package ArrayDataStructure.ArrayList;
import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> age=new ArrayList<Integer>();    // declaring an arraylist

        // adding items to list
        age.add(45);
        age.add(65);
        age.add(15);

        age.add(0,80);     // adding an element to the first position of the list.

        // printing the content
        System.out.println(age);
    }
}
