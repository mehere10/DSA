package StringDataStructure.StringBulder;
import java.util.*;


public class stringBulderMethods
{
    Scanner sc=new Scanner(System.in);

    // Append method
    static String strAppend(String str)
    {
        StringBuilder result=new StringBuilder(str);
        result.append(" XYZ");  // append method
        return result.toString();
    }
    public static void main(String[] args) {

        String s="ABC";
        System.out.println(strAppend(s));
    }
}
