package StringDataStructure;
import java.util.*;
public class Temp
{
        static int isVowel(char ch)
        {
            return (0x208222 >> (ch & 0x1f)) & 1;
            // same as (2130466 >> (ch & 31)) & 1;
        }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);\////
//
//        String s="Nishant";
//
//        char result=s.charAt(0);
//        int length=s.length();
//        System.out.println(result);
//        System.out.println(length);
        System.out.println("a is " + isVowel('a'));
        System.out.println("x is " + isVowel('x'));

    }
}
