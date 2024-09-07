package StringDataStructure.StringBulder;
import java.util.*;


public class stringBulderMethods
{
    Scanner sc=new Scanner(System.in);

    // Append method
    static String strAppend(String str)
    {
        StringBuilder result=new StringBuilder(str);
        result.append(" World");  // append method

        // we are using toString method because SB returns an object of SB , to we need to convert it into String.
        return result.toString();
    }

    // setCharAt method
    static String setCharacter(String str)
    {
        StringBuilder result=new StringBuilder(str);
        result.setCharAt(0,'M');
        return result.toString();
    }
    static String insertAt(String str)
    {
        StringBuilder result=new StringBuilder(str);
        result.insert(1,'e');
        return result.toString();
    }
    public static void main(String[] args) {

        String s="Hello";
        System.out.println("Original string : "+s);
        System.out.println("Append method : "+strAppend(s));   // append
        System.out.println("Set Char method : "+setCharacter(s));   // setCharAt
        System.out.println("Insert method : "+insertAt(s)); // insert
    }
}
